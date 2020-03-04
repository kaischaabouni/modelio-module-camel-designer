package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerStereotypes;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

@objid ("f0a9a377-0605-4067-965a-6f1289165707")
public class CreateUnitModelCommand extends CreateCamelSubModelCommand {
    @objid ("194e2e7a-d994-49f3-822c-0b3cc019c7a4")
    public CreateUnitModelCommand() {
        super("UnitModel", CamelDesignerStereotypes.UNIT_MODEL, "UnitModelDiagram", CamelDesignerStereotypes.UNIT_MODEL_DIAGRAM);
    }

}
