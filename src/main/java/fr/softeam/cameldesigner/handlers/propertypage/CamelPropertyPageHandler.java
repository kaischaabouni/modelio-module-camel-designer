package fr.softeam.cameldesigner.handlers.propertypage;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerStereotypes;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import org.modelio.api.module.IModule;
import org.modelio.api.module.propertiesPage.AbstractModulePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("bcfec296-bffd-45e9-885b-40a0ae969f2e")
public class CamelPropertyPageHandler extends AbstractModulePropertyPage {
    @objid ("f9e026a8-a446-4c6c-9d7c-6dddb734133f")
    public CamelPropertyPageHandler(final IModule module, final String name, final String label, final String bitmap) {
        super(module, name, label, bitmap);
    }

    @objid ("224b5d23-f6be-419a-a26d-30ddeab768a2")
    @Override
    public void update(final List<MObject> elements, final IModulePropertyTable table) {
        if (elements != null 
                && elements.size() > 0
                && elements.get(0) != null
                && elements.get(0) instanceof ModelElement){
        
            ModelElement element = ((ModelElement) elements.get(0));
        
            // tags
            for (TaggedValue tag : element.getTag()) {
                table.addProperty(tag.getDefinition().getName(), tag.getActual().get(0).getValue());
            }
        
            // properties
            for (Dependency dependency : element.getDependsOnDependency()) {
                if(dependency.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelDesignerStereotypes.PROPERTY_DEPENDENCY)) {
                    table.addProperty(dependency.getName(), dependency.getDependsOn().getName());
                }
            }
        
        }
    }

    @objid ("1d132582-0e32-4659-96dc-de33e55f583e")
    @Override
    public void changeProperty(final List<MObject> elements, final int row, final String value) {
        // TODO Auto-generated method stub
    }

}
