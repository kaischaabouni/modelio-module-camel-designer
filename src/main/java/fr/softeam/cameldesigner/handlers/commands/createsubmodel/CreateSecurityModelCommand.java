package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerStereotypes;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

@objid ("ce656a58-6d17-4cfd-9875-db7cf1d116c4")
public class CreateSecurityModelCommand extends CreateCamelSubModelCommand {
    @objid ("1e8b9d3e-7cc2-4998-9100-04ca0d4554d7")
    public CreateSecurityModelCommand() {
        super("SecurityModel", CamelDesignerStereotypes.SECURITY_MODEL, "SecurityModelDiagram", CamelDesignerStereotypes.SECURITY_MODEL_DIAGRAM);
    }

}
