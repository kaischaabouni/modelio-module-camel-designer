package fr.softeam.cameldesigner.handlers.commands;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerStereotypes;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.representation.diagrams.api.ICamelDiagramsService;
import fr.softeam.cameldesigner.representation.diagrams.impl.CamelDiagramsServiceImpl;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * @author kchaabouni
 */
@objid ("585c2431-ec7c-4d52-8d30-f08ffed1c056")
public abstract class CreateCamelSubModelCommand extends DefaultModuleCommandHandler {
    @objid ("1a2688d3-3bc8-474d-b6e6-4192bce692f7")
     String subModelName;

    @objid ("19a2d730-5262-4cbe-ac70-e6067a2a3d7c")
     String subModelStereotype;

    @objid ("cc8a928a-0fb0-45e4-bdfb-ea0759481b9c")
     String subModelDiagramName;

    @objid ("862d51d5-33b0-455d-905f-f11cc5a89400")
     String subModelDiagramStereotype;

    @objid ("683d428a-eecf-4b9f-b0f1-d2fe7c24d71c")
     ICamelDiagramsService camelDiagramService = new CamelDiagramsServiceImpl();

    @objid ("59a802ab-d48e-4414-a661-5492011b3c67")
    public CreateCamelSubModelCommand(String subModelName, String subModelStereotype, String subModelDiagramName, String subModelDiagramStereotype) {
        super();
        this.subModelName = subModelName;
        this.subModelStereotype = subModelStereotype;
        this.subModelDiagramName = subModelDiagramName;
        this.subModelDiagramStereotype = subModelDiagramStereotype;
    }

    @objid ("0f97e3e4-8353-4dac-b42c-6a4337f886b5")
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        ModelElement classOwner = (ModelElement) selectedElements.get(0);            
        createSubModel(module, (Class) classOwner);
    }

    @objid ("5c9946a3-2dbf-4066-9bc9-6b71426241ed")
    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        if ((selectedElements != null) && (selectedElements.size() == 1)){
            MObject selectedElement = selectedElements.get(0);
            return (
                    ((selectedElement instanceof Class 
                            && ((Class)selectedElement).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelDesignerStereotypes.CAMEL_MODEL)
                            && selectedElement.getStatus().isModifiable())));
        }
        return false;
    }

    @objid ("d3232e85-53d6-4475-a3f5-818c5c7241b3")
    private Class createSubModel(IModule module, Class camelModel) {
        IModuleContext moduleContext = module.getModuleContext();
        IModelingSession modelingSession = moduleContext.getModelingSession();
        
        Class subModel = null;
        
        
        try( ITransaction transaction = modelingSession.createTransaction("TO MODIFY LATER")){
        
            subModel = modelingSession.getModel().createClass(this.subModelName, (NameSpace) camelModel.getOwner(), ICamelDesignerPeerModule.MODULE_NAME, this.subModelStereotype);
            Dependency propertyDependency = modelingSession.getModel().createDependency(camelModel, subModel, ICamelDesignerPeerModule.MODULE_NAME, CamelDesignerStereotypes.PROPERTY_DEPENDENCY); 
        
            // Create subModel Diagram
            ClassDiagram subModelDiagram = this.camelDiagramService.createSubModelDiagram(subModel, this.subModelDiagramStereotype, this.subModelDiagramName);
        
            // Update Camel Model Diagram and ViewPoint
            for(AbstractDiagram diagram : camelModel.getDiagramElement()) {
                if(diagram instanceof ClassDiagram 
                        && diagram.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelDesignerStereotypes.CAMEL_MODEL_DIAGRAM)) {
                    
                    
                    ClassDiagram camelModelDiagram = (ClassDiagram) diagram;
        //                    for(ModelTree ownedElement: camelModel.getOwnedElement()) {
        //                        if(ownedElement instanceof Class && ownedElement.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelDesignerStereotypes.SUB_MODEL)) {
        //                            this.camelDiagramService.unmaskModelElement(ownedElement, moduleContext, camelModelDiagram, null);
        //        
        //                        }
        //                    }
                    this.camelDiagramService.unmaskModelElement(subModel, moduleContext, camelModelDiagram, null);
                    this.camelDiagramService.unmaskModelElement(propertyDependency, moduleContext, camelModelDiagram, null);
                    
                    for (AbstractDiagram diagramOfdiagram : camelModelDiagram.getDiagramElement()) {
                        if(diagramOfdiagram instanceof ClassDiagram 
                                && diagramOfdiagram.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelDesignerStereotypes.CAMEL_VIEWPOINT)) {
                            this.camelDiagramService.unmaskModelElement(subModelDiagram, moduleContext, (ClassDiagram) diagramOfdiagram, null);
        
                        }
        
                    }
                }
        
        //                this.camelDiagramService.unmaskModelElement(subModel, moduleContext, deploymentModelDiagram, bounds);
        
                subModel.setOwner(camelModel);
                
                moduleContext.getModelioServices().getEditionService().openEditor(subModelDiagram);
        
                transaction.commit ();
            }
            return subModel;
        }
    }

}
