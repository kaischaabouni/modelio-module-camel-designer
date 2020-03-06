package fr.softeam.cameldesigner.conversion;

import camel.core.Application;
import camel.core.CamelModel;
import camel.core.CoreFactory;
import camel.deployment.DeploymentModel;
import camel.deployment.DeploymentTypeModel;
import camel.deployment.RequirementSet;
import camel.deployment.SoftwareComponent;
import camel.deployment.impl.DeploymentFactoryImpl;
import camel.metric.MetricTypeModel;
import camel.metric.impl.MetricFactoryImpl;
import camel.requirement.RequirementModel;
import camel.requirement.impl.RequirementFactoryImpl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerStereotypes;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import org.modelio.metamodel.uml.statik.Class;

/**
 * @author kchaabouni
 */
@objid ("eb948c86-6853-49bf-afbb-dea41c61130c")
public class ConvertUmlToCamel {
    @objid ("ab15739c-1584-4049-a95a-add592dcdbe4")
    private Class camelUMLModel;

    @objid ("e5210b71-11aa-4878-b8da-fa45f5759a96")
    public ConvertUmlToCamel(Class camelUMLModel) {
        super();
        this.camelUMLModel = camelUMLModel;
    }

    @objid ("e1f2959d-5876-4cc6-9041-a2674a974965")
    public Class getCamelUMLModel() {
        return this.camelUMLModel;
    }

    @objid ("cd578049-2224-4284-ba47-db639ba2c044")
    public void setCamelUMLModel(Class camelUMLModel) {
        this.camelUMLModel = camelUMLModel;
    }

    @objid ("7fe341e1-36c6-480b-871b-40c4fcdee044")
    public CamelModel convert() {
        return convertCamelModel(this.camelUMLModel);
    }

    @objid ("0ad5177a-ee5a-4ec1-9dce-10f1350e67ab")
    private CamelModel convertCamelModel(Class clazz) {
        CamelModel camelModel = CoreFactory.eINSTANCE.createCamelModel();
        camelModel.setName(clazz.getName());
        
        for(Class child : clazz.getOwnedElement(Class.class)) {
            if(child.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelDesignerStereotypes.DEPLOYMENT_TYPE_MODEL)) {
                camelModel.getDeploymentModels().add(convertDeploymentTypeModel(child));
            } else if(child.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelDesignerStereotypes.REQUIREMENT_MODEL)) {
                camelModel.getRequirementModels().add(convertRequirementModel(child));
            } else if (child.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelDesignerStereotypes.METRIC_MODEL)) {
                camelModel.getMetricModels().add(convertMetricModel(child));
            } else if (child.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelDesignerStereotypes.APPLICATION)) {
                camelModel.setApplication(convertApplication(child));
            }
        
        }
        return camelModel;
    }

    @objid ("23970974-dff2-4957-9295-2ab436297fe6")
    private Application convertApplication(Class clazz) {
        Application application = CoreFactory.eINSTANCE.createApplication();
        application.setName(clazz.getName());
        application.setVersion(clazz.getTagValue(ICamelDesignerPeerModule.MODULE_NAME, CamelDesignerStereotypes.APPLICATION, "version"));
        //application(clazz.getTagValue(arg0, rangeUri, arg2));
        return application;
    }

    @objid ("6fe84cc1-6d00-4913-a0a8-c87edbdb3290")
    private MetricTypeModel convertMetricModel(Class clazz) {
        MetricTypeModel metricTypeModel = MetricFactoryImpl.eINSTANCE.createMetricTypeModel();
        metricTypeModel.setName(clazz.getName());
        return metricTypeModel;
    }

    @objid ("18252092-9500-4486-9d2f-934e5cab12cd")
    private RequirementModel convertRequirementModel(Class clazz) {
        RequirementModel requirementModel = RequirementFactoryImpl.eINSTANCE.createRequirementModel();
        requirementModel.setName(clazz.getName());
        return requirementModel;
    }

    @objid ("53d6cbe5-102d-4502-954d-890fdbb2d11f")
    private DeploymentModel convertDeploymentTypeModel(Class clazz) {
        DeploymentTypeModel deploymentTypeModel = DeploymentFactoryImpl.eINSTANCE.createDeploymentTypeModel();
        deploymentTypeModel.setName(clazz.getName());
        
        for(Class child : clazz.getOwnedElement(Class.class)) {
            if(child.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelDesignerStereotypes.SOFTWARE_COMPONENT)) {
                deploymentTypeModel.getSoftwareComponents().add(convertSoftwareComponent(child));
            } else if(child.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelDesignerStereotypes.REQUIREMENT_SET)) {
                deploymentTypeModel.getRequirementSets().add(convertRequirementSet(child));
            }
        }
        
        
        deploymentTypeModel.getSoftwareComponents();
        deploymentTypeModel.getRequirementSets();
        return deploymentTypeModel;
    }

    @objid ("294bd1e4-3f98-4038-8cfe-de975d012bf8")
    private RequirementSet convertRequirementSet(Class clazz) {
        RequirementSet requirementSet = DeploymentFactoryImpl.eINSTANCE.createRequirementSet();
        requirementSet.setName(clazz.getName());
        return requirementSet;
    }

    @objid ("3da2ae3e-e2f4-4a8b-9386-9bc51cc33130")
    private SoftwareComponent convertSoftwareComponent(Class clazz) {
        SoftwareComponent softwareComponent = DeploymentFactoryImpl.eINSTANCE.createSoftwareComponent();
        softwareComponent.setName(clazz.getName());
        return softwareComponent;
    }

}
