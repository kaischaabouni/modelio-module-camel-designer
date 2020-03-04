package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerStereotypes;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

/**
 * @author kchaabouni
 */
@objid ("3b24e2f4-4063-45f5-8f0b-c7dd74eaf3ba")
public class CreateRequirementModelCommand extends CreateCamelSubModelCommand {
    @objid ("4af7a86b-595a-4ded-b6c6-2a4dbb746b7b")
    public CreateRequirementModelCommand() {
        super("RequirementModel", CamelDesignerStereotypes.REQUIREMENT_MODEL, "RequirementModelDiagram", CamelDesignerStereotypes.REQUIREMENT_MODEL_DIAGRAM);
    }

}
