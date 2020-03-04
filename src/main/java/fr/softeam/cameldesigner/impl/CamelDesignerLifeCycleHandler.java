package fr.softeam.cameldesigner.impl;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.lifecycle.DefaultModuleLifeCycleHandler;
import org.modelio.api.module.lifecycle.ModuleException;
import org.modelio.vbasic.version.Version;

@objid ("90ed4cbc-40db-45d8-b321-4bc35ccd3153")
public class CamelDesignerLifeCycleHandler extends DefaultModuleLifeCycleHandler {
    @objid ("63790a1c-b35d-417f-ad95-81bb7d121069")
    public CamelDesignerLifeCycleHandler(final CamelDesignerModule module) {
        super(module);
    }

    @objid ("c9156280-2e61-43ac-9f1f-4b1757dae919")
    @Override
    public boolean start() throws ModuleException {
        return super.start();
    }

    @objid ("1200f330-1c30-4f1a-a443-3c5329386fe9")
    @Override
    public void stop() throws ModuleException {
        super.stop();
    }

    /**
     * @return
     */
    @objid ("c27eda8e-b33e-477a-9dec-d54140b48e76")
    public static boolean install(final String modelioPath, final String mdaPath) throws ModuleException {
        return DefaultModuleLifeCycleHandler.install(modelioPath, mdaPath);
    }

    @objid ("265aa435-e1b3-4870-9fc4-bd2288c7959b")
    @Override
    public boolean select() throws ModuleException {
        return super.select();
    }

    @objid ("9376f344-7896-4e1f-b7ad-a52898f378d1")
    @Override
    public void upgrade(final Version oldVersion, final Map<String, String> oldParameters) throws ModuleException {
        super.upgrade(oldVersion, oldParameters);
    }

    @objid ("e6167d7a-d65a-4675-b18d-afa164ff32b8")
    @Override
    public void unselect() throws ModuleException {
        super.unselect();
    }

}
