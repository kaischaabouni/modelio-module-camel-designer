package fr.softeam.cameldesigner.handlers.commands;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerStereotypes;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.representation.diagrams.api.ICamelDiagramsService;
import fr.softeam.cameldesigner.representation.diagrams.impl.CamelDiagramsServiceImpl;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramNode;
import org.modelio.api.modelio.diagram.IDiagramService;
import org.modelio.api.modelio.diagram.dg.IDiagramDG;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * @author kchaabouni
 */
@objid ("334a8866-11b6-455d-9c4f-9359ee400879")
public class CreateCamelModelCommand extends DefaultModuleCommandHandler {
    @objid ("27d3cbc5-273b-4761-8e86-925c79bd7b45")
     ICamelDiagramsService camelDiagramService = new CamelDiagramsServiceImpl();

    @objid ("abfb9318-43b7-4aa3-adc9-54a27a861a44")
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        ModelElement packageOwner = (ModelElement) selectedElements.get(0);    
        
        
        createCamelModel(module, packageOwner);
    }

    @objid ("7fd71815-4bbb-40c1-ba4d-9ca3061f9a04")
    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        if ((selectedElements != null) && (selectedElements.size() == 1)){
            MObject selectedElt = selectedElements.get(0);
            return (
                    (((selectedElt instanceof Package) 
                            && !(selectedElt instanceof Profile)
                            && selectedElt.getStatus().isModifiable())));
        }
        return false;
    }

    @objid ("30aba000-242a-43a3-8505-e04f2b2c32e1")
    private Class createCamelModel(IModule module, ModelElement packageOwner) {
        IModuleContext moduleContext = module.getModuleContext();
        IModelingSession modelingSession = moduleContext.getModelingSession();
        
        Class camelModel = null;
        
        
        try( ITransaction createCamelModelTransaction = modelingSession.createTransaction("TO MODIFY LATER")){
        
            camelModel = modelingSession.getModel().createClass("CamelModel", (NameSpace) packageOwner, ICamelDesignerPeerModule.MODULE_NAME, CamelDesignerStereotypes.CAMEL_MODEL);
        
            MClass classDiagramMclass = moduleContext.getModelioServices().getMetamodelService().getMetamodel().getMClass(ClassDiagram.class);
        
            // Create CamelModelDiagram and unmask CamelModel
            Stereotype camelModelDiagramStereotype = modelingSession.getMetamodelExtensions().getStereotype(ICamelDesignerPeerModule.MODULE_NAME, CamelDesignerStereotypes.CAMEL_MODEL_DIAGRAM, classDiagramMclass);
            ClassDiagram camelModelDiagram = modelingSession.getModel().createClassDiagram("CamelModelDiagram", camelModel, camelModelDiagramStereotype);
            IDiagramService diagramService = moduleContext.getModelioServices().getDiagramService();
            try(  IDiagramHandle diagramHandle = diagramService.getDiagramHandle(camelModelDiagram);){
                IDiagramDG diagramDG = diagramHandle.getDiagramNode();
                this.camelDiagramService.applyCamelStyle(diagramDG);
                List<IDiagramGraphic> diagramGraphics = diagramHandle.unmask(camelModel, 200, 200);
                for (IDiagramGraphic diagramGraphic : diagramGraphics) {
                    if(diagramGraphic.getElement().equals(camelModel)){
                        ((IDiagramNode) diagramGraphic).setBounds(new Rectangle(300,200,200,100));
                    }
                }
                diagramHandle.save();
                diagramHandle.close();
            }
        
            // Create CamelViewPoint and unmask CamelModelDiagram           
            Stereotype camelViewPointStereotype = modelingSession.getMetamodelExtensions().getStereotype(ICamelDesignerPeerModule.MODULE_NAME, CamelDesignerStereotypes.CAMEL_VIEWPOINT, classDiagramMclass);
            ClassDiagram camelViewPointDiagram = modelingSession.getModel().createClassDiagram("CamelViewPoint", camelModel, camelViewPointStereotype);
            try(  IDiagramHandle diagramHandle = diagramService.getDiagramHandle(camelViewPointDiagram);){
                IDiagramDG diagramDG = diagramHandle.getDiagramNode();
                this.camelDiagramService.applyCamelStyle(diagramDG);
                List<IDiagramGraphic> diagramGraphics = diagramHandle.unmask(camelModelDiagram, 200, 200);
                diagramHandle.save();
                diagramHandle.close();
            }     
            
            moduleContext.getModelioServices().getEditionService().openEditor(camelModelDiagram);
        
            createCamelModelTransaction.commit ();
        }
        return camelModel;
    }

}
