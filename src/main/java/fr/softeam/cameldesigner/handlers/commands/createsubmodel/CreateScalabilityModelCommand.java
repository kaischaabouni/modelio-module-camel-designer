package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerStereotypes;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

/**
 * @author kchaabouni
 */
@objid ("7cb3a36f-ce8e-40b5-aa75-2405b7f1b396")
public class CreateScalabilityModelCommand extends CreateCamelSubModelCommand {
    @objid ("5962d295-9e95-4e69-9f29-c439786b7d01")
    public CreateScalabilityModelCommand() {
        super("ScalabilityModel", CamelDesignerStereotypes.SCALABILITY_MODEL, "ScalabilityModelDiagram", CamelDesignerStereotypes.SCALABILITY_MODEL_DIAGRAM);
    }

}
