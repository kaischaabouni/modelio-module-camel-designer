package fr.softeam.cameldesigner.representation.diagrams.api;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.dg.IDiagramDG;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

@objid ("c936477a-6c32-4558-b2bb-ddace4ad8f81")
public interface ICamelDiagramsService {
    @objid ("19ee52a9-6270-46b9-a56d-f0ffae35bb4d")
    void applyCamelStyle(IDiagramDG diagramDG);

    @objid ("d275b889-ad78-45d0-b09d-332b599956f6")
    void unmaskModelElement(ModelElement modelElement, IModuleContext moduleContext, ClassDiagram deploymentModelDiagram, Rectangle bounds);

    @objid ("9a8d9afc-2938-46d3-a7f1-3ced78c6c8fb")
    ClassDiagram createSubModelDiagram(Class subModel, String diagramStereotype, String deploymentModelDiagramName);

}
