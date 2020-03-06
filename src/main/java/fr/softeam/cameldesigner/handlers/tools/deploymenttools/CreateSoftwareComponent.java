package fr.softeam.cameldesigner.handlers.tools.deploymenttools;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerStereotypes;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("ce516ff6-fea6-4a39-ad46-c1798e7d1657")
public class CreateSoftwareComponent extends DefaultBoxTool {
    @objid ("6e5e8b88-29d0-4d3d-a668-eb83dd9163c2")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        return 
                targetNode.getElement() instanceof ClassDiagram
                &&  ((ClassDiagram) targetNode.getElement()).getOrigin() instanceof Class
                && ((Class)((ClassDiagram) targetNode.getElement()).getOrigin())
                .isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelDesignerStereotypes.DEPLOYMENT_TYPE_MODEL);
    }

    @objid ("01f548e5-a5e4-4cad-8fb5-ca1c754dbda6")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        IModuleContext moduleContext = CamelDesignerModule.getInstance().getModuleContext();
        IModelingSession modelingSession = moduleContext.getModelingSession();
        
        Class softwareComponent = null;
        
        try( ITransaction transaction = modelingSession.createTransaction("TO MODIFY LATER")){
        
            MObject rootParent = diagramHandle.getDiagram().getOrigin().getCompositionOwner();
            
            // create stereotyped Attack Class
            softwareComponent = modelingSession.getModel().createClass(
                    "SoftwareComponent", 
                    (NameSpace) rootParent, 
                    ICamelDesignerPeerModule.MODULE_NAME, 
                    CamelDesignerStereotypes.SOFTWARE_COMPONENT);
            
            
            // unmask Attack and save diagram
            diagramHandle.unmask(softwareComponent, rect.x, rect.y);            
            
            diagramHandle.save();
            diagramHandle.close();
            
            softwareComponent.setOwner((ModelTree) parent.getElement().getCompositionOwner());
            
            modelingSession.getModel().getDefaultNameService()
            .setDefaultName(softwareComponent, "SoftwareComponent");  
            
            
            
            
            transaction.commit ();
        }
    }

}
