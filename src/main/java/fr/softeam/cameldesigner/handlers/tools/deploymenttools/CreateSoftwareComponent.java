package fr.softeam.cameldesigner.handlers.tools.deploymenttools;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.tools.DefaultBoxTool;

@objid ("ce516ff6-fea6-4a39-ad46-c1798e7d1657")
public class CreateSoftwareComponent extends DefaultBoxTool {
    @objid ("6e5e8b88-29d0-4d3d-a668-eb83dd9163c2")
    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        // TODO Auto-generated method stub
        return false;
    }

    @objid ("01f548e5-a5e4-4cad-8fb5-ca1c754dbda6")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        // TODO implement the CreateSoftwareComponent handler. 
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "CreateSoftwareComponent", "Tool not implemented!");
    }

}
