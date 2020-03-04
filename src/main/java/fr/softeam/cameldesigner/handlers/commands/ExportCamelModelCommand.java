package fr.softeam.cameldesigner.handlers.commands;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerStereotypes;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("473a0b93-af1a-4840-b851-1f90873f7b56")
public class ExportCamelModelCommand extends DefaultModuleCommandHandler {
    @objid ("14ab5657-6de8-4334-bd0a-0baabbcaa310")
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        // Module context is the link to many Modelio services
        IModuleContext ctx = module.getModuleContext();
        
        // TODO replace the following dumb code by the real implementation of the command
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "ExportCamelModelCommand", "Command not implemented!");
    }

    @objid ("b102b5d1-4b29-4663-a592-361c777da4dd")
    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        if ((selectedElements != null) && (selectedElements.size() == 1)){
            MObject selectedElement = selectedElements.get(0);
            return (
                    ((selectedElement instanceof Class 
                            && ((Class)selectedElement).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelDesignerStereotypes.CAMEL_MODEL)
                            )));
        }
        return false;
    }

}
