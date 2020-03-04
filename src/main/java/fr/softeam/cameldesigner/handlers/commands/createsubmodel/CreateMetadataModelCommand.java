package fr.softeam.cameldesigner.handlers.commands.createsubmodel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerStereotypes;
import fr.softeam.cameldesigner.handlers.commands.CreateCamelSubModelCommand;

/**
 * @author kchaabouni
 */
@objid ("4c74527f-3ada-4cec-8a67-5f6648cbd0dc")
public class CreateMetadataModelCommand extends CreateCamelSubModelCommand {
    @objid ("7c6231b4-2f04-4983-a4a2-ad9aeb4b83e6")
    public CreateMetadataModelCommand() {
        super("MetadataModel", CamelDesignerStereotypes.METADATA_MODEL, "MetadataModelDiagram", CamelDesignerStereotypes.METADATA_MODEL_DIAGRAM);
    }

}
