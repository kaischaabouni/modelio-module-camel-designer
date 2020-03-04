package fr.softeam.cameldesigner.handlers.commands;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.inject.Injector;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import camel.core.CorePackage;
import camel.dsl.CamelDslStandaloneSetup;
import fr.softeam.cameldesigner.api.CamelDesignerStereotypes;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;

@objid ("78ea1827-e24b-4481-8b6b-e13b8cfb84a9")
public class ExportCamelXMIModelCommand extends DefaultModuleCommandHandler {
    @objid ("09b7a0e8-0ed5-4f33-9218-47d5f131b52c")
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        Class camelModel = (Class) selectedElements.get(0);            
        
        Map<String, Boolean> options = new HashMap<String, Boolean>();
        options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
        
        String xmiFileFullPath = "/home/kchaabouni/kais2/p10_morphemic/out/out5.xmi";
        
        
        CamelDslStandaloneSetup standAlone = new CamelDslStandaloneSetup();
        
        Injector injector = standAlone.createInjectorAndDoEMFRegistration();
        
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        
        resourceSet.getPackageRegistry().put(CorePackage.eNS_URI, CorePackage.eINSTANCE);
        
        resourceSet.addLoadOption(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
        
        //Resource resource3 = resourceSet.getResource(URI.createFileURI(xmiFileFullPath), true);
        
        
        try {
        
            System.out.println( "Hello World! " + camelModel);
            Resource resource5 = resourceSet.createResource(URI.createFileURI(xmiFileFullPath));
            System.out.println( "resource2.getAllContents(): " + resource5.getAllContents());
            resource5.getContents().add(camelModel);
            System.out.println( "resource2.getAllContents(): " + resource5.getAllContents());
            resource5.save(options);
            
        
        
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @objid ("f1f89dbf-4fa2-41d1-9f9b-9bbc0cff603d")
    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        if ((selectedElements != null) && (selectedElements.size() == 1)){
            MObject selectedElement = selectedElements.get(0);
            return (
                    ((selectedElement instanceof Class 
                            && ((Class)selectedElement).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelDesignerStereotypes.CAMEL_MODEL)
                            && selectedElement.getStatus().isModifiable())));
        }
        return false;
    }

}
