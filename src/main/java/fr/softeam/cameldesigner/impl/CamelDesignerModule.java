package fr.softeam.cameldesigner.impl;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.AbstractJavaModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.api.module.lifecycle.IModuleLifeCycleHandler;
import org.modelio.api.module.parameter.IParameterEditionModel;

@objid ("8480a3b7-a19c-434e-b676-2cae92031b88")
public class CamelDesignerModule extends AbstractJavaModule {
    @objid ("5d2e001f-95c5-404a-92b5-3da099f4d6ba")
    private static final String MODULE_IMAGE = "/res/icon/module.png";

    @objid ("5901a13c-a070-4d08-8c32-9fb2a639efc1")
    private CamelDesignerLifeCycleHandler lifeCycleHandler = null;

    @objid ("144f586a-61c7-4448-8376-067b9181ce36")
    private static CamelDesignerModule instance;

    @objid ("cf019cd7-88f0-48df-9a42-ee4bf89ad3d4")
    private CamelDesignerPeerModule peerModule = null;

    @objid ("58ad7d4c-51e4-476c-b15e-443b4b46efb7")
    public CamelDesignerModule(final IModuleContext moduleContext) {
        super(moduleContext);
        
        CamelDesignerModule.instance = this;
        
        this.lifeCycleHandler  = new CamelDesignerLifeCycleHandler(this);
        this.peerModule = new CamelDesignerPeerModule(this, moduleContext.getPeerConfiguration());
        init();
    }

    @objid ("10696bff-9c28-4015-9d47-bb4044d4a337")
    @Override
    public CamelDesignerPeerModule getPeerModule() {
        return this.peerModule;
    }

    /**
     * Return the LifeCycleHandler  attached to the current module. This handler is used to manage the module lifecycle by declaring the desired implementation for the start, select... methods.
     */
    @objid ("318ee8e1-bddc-44bd-80cc-41137cecfe9d")
    @Override
    public IModuleLifeCycleHandler getLifeCycleHandler() {
        return this.lifeCycleHandler;
    }

    /**
     * Method automatically called just after the creation of the module. The module is automatically instanciated at the beginning
     * of the MDA lifecycle and constructor implementation is not accessible to the module developer. The <code>init</code> method
     * allows the developer to execute the desired initialization.
     */
    @objid ("5679a443-b6a3-472d-b520-8125fae830ea")
    @Override
    public IParameterEditionModel getParametersEditionModel() {
        return super.getParametersEditionModel();
    }

    @objid ("e0450074-222b-4dae-bbb2-480d97f02095")
    @Override
    public String getModuleImagePath() {
        return CamelDesignerModule.MODULE_IMAGE;
    }

    @objid ("58ade3a8-7ee7-46e6-813b-04abecc4064a")
    public static CamelDesignerModule getInstance() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return instance;
    }

}
