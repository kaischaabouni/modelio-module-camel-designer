package fr.softeam.cameldesigner.api;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * @author kchaabouni
 */
@objid ("65df2a2c-06b3-4f3d-9b8f-9741e239875f")
public interface CamelDesignerStereotypes {
    @objid ("c96094b7-5698-411b-92a8-71f19f7c7f61")
    public static final String CAMEL_MODEL = "CamelModel";

    @objid ("2b4f8a1e-18fa-4a0c-9ae3-1fd545c94c30")
    public static final String NAMED_ELEMENT = "NamedElement";

    @objid ("0fcb1db5-b8a0-4d6d-a181-83d1c3d5b973")
    public static final String ATTRIBUTE = "Attribute";

    @objid ("db70d45d-5839-4408-b55c-f328c73b1044")
    public static final String FEATURE = "Feature";

    @objid ("c9a25dc5-7c36-4b34-9e03-0e0ae987da37")
    public static final String QUALITY_ATTRIBUTE = "QualityAttribute";

    @objid ("24e55972-0348-4067-91f2-fa154257a813")
    public static final String MEASURABLE_ATTRIBUTE = "MeasurableAttribute";

    @objid ("4b4a0cbf-6737-4647-bd35-bc39fdd11e15")
    public static final String ACTION = "Action";

    @objid ("a1fd3d72-affe-4c02-b63b-8c04dff456d0")
    public static final String APPLICATION = "Application";

    @objid ("be7d3416-56e8-4720-92e5-6736577e5e52")
    public static final String PROPERTY_DEPENDENCY = "PropertyDependency";

    @objid ("83107973-d32d-4961-86dd-efaacb248604")
    public static final String CAMEL_VIEWPOINT = "CamelViewPoint";

    @objid ("eb226858-04b7-4916-a2c2-d7934c38a4ac")
    public static final String EXECUTION_MODEL_DIAGRAM = "ExecutionModelDiagram";

    @objid ("408cdff4-8a90-4dc4-827c-a1463fff6ed3")
    public static final String METRIC_MODEL_DIAGRAM = "MetricModelDiagram";

    @objid ("82fed834-31aa-4d99-b054-956df3f3f684")
    public static final String DATA_MODEL_DIAGRAM = "DataModelDiagram";

    @objid ("99123060-2967-4fe2-8f47-247399ee462d")
    public static final String LOCATION_MODEL_DIAGRAM = "LocationModelDiagram";

    @objid ("262832bf-1d7b-4866-abe9-da11dfb07ca3")
    public static final String REQUIREMENT_MODEL_DIAGRAM = "RequirementModelDiagram";

    @objid ("f7b2e448-3e34-42e9-84f5-46ae8e1122f6")
    public static final String ABSTRACT_CAMEL_DIAGRAM = "AbstractCamelDiagram";

    @objid ("0ec78fda-a2c5-4f6c-9248-cb9d159771ec")
    public static final String CONSTRAINT_MODEL_DIAGRAM = "ConstraintModelDiagram";

    @objid ("d699ae33-ef22-45d0-ae1a-c8bce465440a")
    public static final String METADATA_MODEL_DIAGRAM = "MetadataModelDiagram";

    @objid ("eb80d06a-754a-4e9a-b0c2-5f1c29bc1299")
    public static final String ORGANISATION_MODEL_DIAGRAM = "OrganisationModelDiagram";

    @objid ("f70ff377-fc67-4b50-acfb-f4fbfa0ab327")
    public static final String SCALABILITY_MODEL_DIAGRAM = "ScalabilityModelDiagram";

    @objid ("9bccb173-8947-4e0d-942a-524066c3c8c1")
    public static final String DEPLOYMENT_MODEL_DIAGRAM = "DeploymentModelDiagram";

    @objid ("b6230c9b-9a84-4e42-a088-ff4cf26efce2")
    public static final String SECURITY_MODEL_DIAGRAM = "SecurityModelDiagram";

    @objid ("390b96c7-fdf5-44b3-b085-93add14bc006")
    public static final String TYPE_MODEL_DIAGRAM = "TypeModelDiagram";

    @objid ("e4febc66-b14a-4837-91d4-ed71a2eb4cb6")
    public static final String UNIT_MODEL_DIAGRAM = "UnitModelDiagram";

    @objid ("8b278c93-9794-4b9d-ae84-c7eca940dee0")
    public static final String CAMEL_MODEL_DIAGRAM = "CamelModelDiagram";

    @objid ("dabac5aa-8b30-4a5b-978b-f37b0420a7c7")
    public static final String DEPLOYMENT_TYPE_MODEL = "DeploymentTypeModel";

    @objid ("5bfb42a3-e201-47f9-8a87-7c0789d74177")
    public static final String COMPONENT = "Component";

    @objid ("ff8b7041-3cde-45a3-8c91-6135380307b7")
    public static final String SOFTWARE_COMPONENT = "SoftwareComponent";

    @objid ("d52f9e10-7bd9-4c27-9859-27b1c45d966f")
    public static final String VM = "VM";

    @objid ("ddee3cdd-d816-4791-9245-7bfab698d488")
    public static final String PAAS = "PaaS";

    @objid ("8186a25a-8cc7-48e1-92d7-d1be64a79ab8")
    public static final String REQUIREMENT_SET = "RequirementSet";

    @objid ("aaa4a9ab-c94e-45ae-946d-0012a9f44264")
    public static final String DEPLOYMENT_MODEL = "DeploymentModel";

    @objid ("c348c955-cbdd-4654-a41b-6d01c2c5f7ab")
    public static final String CONFIGURATION = "Configuration";

    @objid ("14de3e4f-f9af-4cac-b777-7319a061e575")
    public static final String COMMUNICATION_PORT = "CommunicationPort";

    @objid ("43767eea-46e4-4f30-be22-dcb2362879ae")
    public static final String PROVIDED_COMMUNICATION = "ProvidedCommunication";

    @objid ("bcc95894-3895-4bab-b27c-79fdd270119f")
    public static final String REQUIRED_COMMUNICATION = "RequiredCommunication";

    @objid ("5db0b9de-ca48-4f10-ae30-bff625c7e664")
    public static final String HOSTING_PORT = "HostingPort";

    @objid ("a93a8e12-785b-4812-bad1-3cca9f9c0d4f")
    public static final String PROVIDED_HOST = "ProvidedHost";

    @objid ("c9d07b52-5f45-4ccf-a97a-76cb913033d2")
    public static final String REQUIRED_HOST = "RequiredHost";

    @objid ("cab82cfb-951d-48d7-8230-ea4d7be281c7")
    public static final String SCRIPT_CONFIGURATION = "ScriptConfiguration";

    @objid ("9a9e8c74-2b57-433c-addc-f142455ffeee")
    public static final String CLUSTER_CONFIGURATION = "ClusterConfiguration";

    @objid ("acdbab22-4499-4a02-a5e2-59df16a36202")
    public static final String CONTAINER = "Container";

    @objid ("5e385dc6-7d1d-4c82-8c5e-1520fd828784")
    public static final String COMPONENT_RELATION = "ComponentRelation";

    @objid ("d0f1ab50-60cd-4d7d-849e-ada69631dfd5")
    public static final String PAAS_CONFIGURATION = "PaaSConfiguration";

    @objid ("72cf8470-07cd-4451-9721-4f57a4c63b78")
    public static final String SERVERLESS_CONFIGURATION = "ServerlessConfiguration";

    @objid ("c004142c-36ca-470a-8690-7ce8fee658f1")
    public static final String BUILD_CONFIGURATION = "BuildConfiguration";

    @objid ("7b16e2eb-2279-4627-9de3-acf691db2169")
    public static final String EVENT_CONFIGURATION = "EventConfiguration";

    @objid ("b96fb9bd-913a-418c-b1a3-3628b7cd05bd")
    public static final String COMMUNICATION = "Communication";

    @objid ("d2f25d9a-8a66-41ad-aaa1-0c6a6f9fb097")
    public static final String LOCATION_COUPLING = "LocationCoupling";

    @objid ("029a18d9-6c31-4471-a23f-a41a4c3677f5")
    public static final String REQUIREMENT_MODEL = "RequirementModel";

    @objid ("f57e6d6c-b60c-4b16-a5c6-c3850b72de3e")
    public static final String REQUIREMENT = "Requirement";

    @objid ("89150620-13f0-45f6-9d2e-f6afa8cf1cd7")
    public static final String RESOURCE_REQUIREMENT = "ResourceRequirement";

    @objid ("08787314-d6a4-4433-b567-4bf71d1f60b2")
    public static final String HORIZONTAL_SCALE_REQUIREMENT = "HorizontalScaleRequirement";

    @objid ("1a55a212-39ad-41f4-897c-ba6286569db7")
    public static final String OPTIMISATION_REQUIREMENT = "OptimisationRequirement";

    @objid ("01c5de2f-a194-480d-9903-012ca7fad043")
    public static final String HARD_REQUIREMENT = "HardRequirement";

    @objid ("8b556b48-70bb-465f-99f1-30c4edd71a1d")
    public static final String SERVICE_LEVEL_OBJECTIVE = "ServiceLevelObjective";

    @objid ("18937033-b618-4408-bebe-e36cefda6960")
    public static final String SECURITY_REQUIREMENT = "SecurityRequirement";

    @objid ("0befbbb3-87df-410c-9fd0-6f179cb1b578")
    public static final String IMAGE_REQUIREMENT = "ImageRequirement";

    @objid ("2e081969-4ccc-49fe-af8f-3625bef07cc3")
    public static final String PROVIDER_REQUIREMENT = "ProviderRequirement";

    @objid ("cc640a56-af15-492f-838b-87e22079a1a6")
    public static final String OS_REQUIREMENT = "OSRequirement";

    @objid ("da533cde-a4c3-46e8-842f-09e477f70372")
    public static final String LOCATION_REQUIREMENT = "LocationRequirement";

    @objid ("af8e8260-7530-4740-8bb7-dbe231982952")
    public static final String SCALE_REQUIREMENT = "ScaleRequirement";

    @objid ("fa16fa6c-f24c-42d1-98c5-ba65876f2aeb")
    public static final String VERTICAL_SCALE_REQUIREMENT = "VerticalScaleRequirement";

    @objid ("cc26d5c2-8646-4c66-81f1-1eda23f96e57")
    public static final String SOFT_REQUIREMENT = "SoftRequirement";

    @objid ("28321fa8-017c-4271-a387-9478495a1c01")
    public static final String PAAS_REQUIREMENT = "PaaSRequirement";

    @objid ("cd67834b-a248-4a28-bbbf-3f5776bfdcd9")
    public static final String METRIC_TYPE_MODEL = "MetricTypeModel";

    @objid ("03bd7ad2-9e27-4e51-a6f5-164b5e53adde")
    public static final String METRIC_INSTANCE_MODEL = "MetricInstanceModel";

    @objid ("a1ee5df3-5924-424f-adca-2b4206798121")
    public static final String COMPOSITE_METRIC = "CompositeMetric";

    @objid ("a284e772-bb27-4c7e-9e03-4bdf302c74fb")
    public static final String METRIC_INSTANCE = "MetricInstance";

    @objid ("a6bee9f9-8fef-4fbb-aa80-5b1611dcb86e")
    public static final String METRIC_OBJECT_BINDING = "MetricObjectBinding";

    @objid ("ee3977ad-c3dd-4235-83a9-c9bafa186aea")
    public static final String METRIC_VARIABLE = "MetricVariable";

    @objid ("8a1641c2-b0b4-45cd-8529-e409fab649c5")
    public static final String RAW_METRIC = "RawMetric";

    @objid ("9af85109-6ef7-492f-9c3c-bb6d8f08d840")
    public static final String METRIC = "Metric";

    @objid ("07a6bac3-82a9-4c59-9e13-80d21c4adf7a")
    public static final String SENSOR = "Sensor";

    @objid ("8c560796-382a-4d3b-af03-c79c32876eac")
    public static final String WINDOW = "Window";

    @objid ("3171dca8-cd78-4c19-87bd-4684c3d84509")
    public static final String SCHEDULE = "Schedule";

    @objid ("67b64941-dd21-4bcf-b5fa-15fafa39d6ca")
    public static final String METRIC_MODEL = "MetricModel";

    @objid ("7fb09144-5172-4fbd-b5c9-c74dfa89169f")
    public static final String METRIC_CONTEXT = "MetricContext";

    @objid ("c576599d-a4d9-4d9e-acb4-ffaf02437cf4")
    public static final String COMPOSITE_METRIC_CONTEXT = "CompositeMetricContext";

    @objid ("2572bf79-527f-40d3-bfda-c1b5cf704aff")
    public static final String RAW_METRIC_CONTEXT = "RawMetricContext";

    @objid ("f6f274d3-de76-4f55-952c-f8fdfaa7dcf7")
    public static final String ATTRIBUTE_CONTEXT = "AttributeContext";

    @objid ("cd447bb1-9201-4718-8ea4-9dfa92498b24")
    public static final String FUNCTION = "Function";

    @objid ("5a249ff7-8886-4c0f-9865-47051c11db53")
    public static final String METRIC_TEMPLATE = "MetricTemplate";

    @objid ("b4fe1782-af77-421e-8b61-113b522daadf")
    public static final String OBJECT_CONTEXT = "ObjectContext";

    @objid ("890273b3-e6a1-4bb9-8f76-f8c2bfe3780c")
    public static final String METADATA_MODEL = "MetaDataModel";

    @objid ("b3ef24d1-f725-4ee6-99d9-98324b4bd859")
    public static final String MMS_OBJECT = "MmsObject";

    @objid ("a6f3cfb6-461e-406e-b277-f1137b162146")
    public static final String MMS_CONCEPT = "MmsConcept";

    @objid ("8d2cb5af-bfe6-4dd8-b0e9-a2eb02963b7b")
    public static final String MMS_PROPERTY = "MmsProperty";

    @objid ("9876eb2e-e905-447f-ba60-508c3c859db1")
    public static final String DEPLOYMENT_INSTANCE_MODEL = "DeploymentInstanceModel";

    @objid ("d2735269-894b-4c2d-b693-e96654830e31")
    public static final String COMPONENT_INSTANCE = "ComponentInstance";

    @objid ("0430c441-b551-4320-82f0-ecce55b0bb2e")
    public static final String SOFTWARE_COMPONENT_INSTANCE = "SoftwareComponentInstance";

    @objid ("eeac2023-b817-4a92-823f-12d38cfaadd0")
    public static final String VM_INSTANCE = "VMInstance";

    @objid ("b7bd6751-8628-4bf4-80fd-d3ae3d800595")
    public static final String COMMUNICATION_PORT_INSTANCE = "CommunicationPortInstance";

    @objid ("3f11959b-b166-424c-9c0e-4aff297c6340")
    public static final String PROVIDED_COMMUNICATION_INSTANCE = "ProvidedCommunicationInstance";

    @objid ("f5a4f845-65f2-4d99-a28f-3f0ee93a38d0")
    public static final String REQUIRED_COMMUNICATION_INSTANCE = "RequiredCommunicationInstance";

    @objid ("3e34e344-a85f-41d6-83b2-27fbcabcc884")
    public static final String HOSTING_PORT_INSTANCE = "HostingPortInstance";

    @objid ("ee257aa7-5e76-49f3-abd6-19a32c9c6d2d")
    public static final String PROVIDED_HOST_INSTANCE = "ProvidedHostInstance";

    @objid ("510ac080-d04b-40af-ae4d-a7ba72ad8963")
    public static final String REQUIRED_HOST_INSTANCE = "RequiredHostInstance";

    @objid ("6ae7f6fd-a9b6-4c0a-acb3-26894dd838cd")
    public static final String CONTAINER_INSTANCE = "ContainerInstance";

    @objid ("b5fe8d7d-3c43-4263-81ce-f128935845e7")
    public static final String COMPONENT_RELATION_INSTANCE = "ComponentRelationInstance";

    @objid ("438c3788-10ed-4379-963f-0aa33230f00b")
    public static final String PAAS_INSTANCE = "PaaSInstance";

    @objid ("26c211b5-996b-47ce-9581-6612cc39a729")
    public static final String COMMUNICATION_INSTANCE = "CommunicationInstance";

    @objid ("d9b42877-20f9-4abb-ac19-544e58788b81")
    public static final String HOSTING_INSTANCE = "HostingInstance";

    @objid ("cebda68a-2b88-4c67-ab0f-2811d0857413")
    public static final String EXECUTION_MODEL = "ExecutionModel";

    @objid ("a3297aad-de25-4d7e-815e-9bb375da4c48")
    public static final String ACTION_INSTANCE = "ActionInstance";

    @objid ("c8afd126-d7d0-4fec-b707-80672842a189")
    public static final String MEASUREMENT = "Measurement";

    @objid ("50e7bb33-b7bd-49ae-a19c-436191248d49")
    public static final String APPLICATION_MEASUREMENT = "ApplicationMeasurement";

    @objid ("ae0327ed-32fb-4f92-a633-4615241f1de2")
    public static final String COMMUNICATION_MEASUREMENT = "CommunicationMeasurement";

    @objid ("554fd924-6d74-418b-96b2-f8dcf226bd96")
    public static final String HISTORY_RECORD = "HistoryRecord";

    @objid ("71d4fda3-2ed2-4f8b-8816-106ce0f6005c")
    public static final String PAAS_MEASUREMENT = "PaaSMeasurement";

    @objid ("05ec0113-a618-44a7-ba6a-44bf9a46b802")
    public static final String CONTAINER_MEASUREMENT = "ContainerMeasurement";

    @objid ("c197c61a-de30-4f4d-a315-58ab5a0359b8")
    public static final String SOFTWARE_COMPONENT_MEASUREMENT = "SoftwareComponentMeasurement";

    @objid ("34f21a91-c5a0-4252-a771-2eb4b353a98d")
    public static final String VM_MEASUREMENT = "VMMeasurement";

    @objid ("d1f05773-68a7-4c51-b969-f5531fc51666")
    public static final String HISTORY_INFO = "HistoryInfo";

    @objid ("3a16f3a3-cdc0-4537-a378-d74417fd3152")
    public static final String SLO_VIOLATION = "SLOViolation";

    @objid ("6b024ca2-5228-419e-a525-54b7926de1b8")
    public static final String CAUSE = "Cause";

    @objid ("3d483a12-a645-4f64-a4eb-b69d6ab74520")
    public static final String DATA_MEASUREMENT = "DataMeasurement";

    @objid ("85ff4c5c-1d39-4db0-a22b-10326ae82b0c")
    public static final String RULE_TRIGGER = "RuleTrigger";

    @objid ("aec61ae7-5ff9-4fca-b31b-f53ca813eaf4")
    public static final String LOCATION_MODEL = "LocationModel";

    @objid ("8cd2d1d6-4e8c-4599-b774-e26c5d5f96be")
    public static final String LOCATION = "Location";

    @objid ("2a712305-4845-4224-ac51-3a7355546182")
    public static final String CLOUD_LOCATION = "CloudLocation";

    @objid ("6e7ef636-1602-4fbb-a055-f3b81df7f01e")
    public static final String GEOGRAPHICAL_REGION = "GeographicalRegion";

    @objid ("5cb4152d-e7c0-41b0-930a-f6ad98f0724a")
    public static final String ORGANISATION_MODEL = "OrganisationModel";

    @objid ("3cbc6d6b-bda5-47b6-956c-a19fa49be475")
    public static final String CREDENTIALS = "Credentials";

    @objid ("ed1a0ffd-fa8b-4418-a097-d2611ca8ebda")
    public static final String EXTERNAL_IDENTIFIER = "ExternalIdentifier";

    @objid ("73f8fe53-4975-4b92-852d-2289b45f2669")
    public static final String PERMISSION = "Permission";

    @objid ("ed52d402-d39b-4adb-8f97-53a3e5400001")
    public static final String ENTITY = "Entity";

    @objid ("706ddce0-ab70-4d3c-a779-9d1367dd8653")
    public static final String CLOUD_PROVIDER = "CloudProvider";

    @objid ("12966583-6861-4f4f-87c2-a50bf9d09433")
    public static final String MODEL_RESOURCE_FILTER = "ModelResourceFilter";

    @objid ("105e8a53-0c6d-45c6-b5c6-8a993228df4e")
    public static final String RESOURCE_FILTER = "ResourceFilter";

    @objid ("606e9774-0544-4252-9ff0-8c02b3957cff")
    public static final String ORGANISATION = "Organisation";

    @objid ("d61d659b-9c50-4afd-804e-a05cda5c2c02")
    public static final String USER = "User";

    @objid ("3366350a-6be7-4e11-8d95-807257dbb829")
    public static final String ROLE = "Role";

    @objid ("be85b009-d5a1-4b31-9320-fe906be05fb7")
    public static final String SERVICE_RESOURCE_FILTER = "ServiceResourceFilter";

    @objid ("6fc8f792-a3e8-4db4-8d2f-957dbd3594b1")
    public static final String ROLE_ASSIGNMENT = "RoleAssignment";

    @objid ("af487b89-87a0-4390-aeda-9af23dc52b72")
    public static final String USER_GROUP = "UserGroup";

    @objid ("5a0ffeb0-aa53-4207-be6f-971430431cdb")
    public static final String PLATFORM_CREDENTIALS = "PlatformCredentials";

    @objid ("3776cef4-1688-4e3e-9543-824f15a5a75a")
    public static final String DATA_RESOURCE_FILTER = "DataResourceFilter";

    @objid ("2ff5c324-9752-4497-8934-8ba50b9749b8")
    public static final String CLOUD_CREDENTIALS = "CloudCredentials";

    @objid ("d998ebe7-c461-4ba8-8184-c6925d75bb14")
    public static final String SOFTWARE_COMPONENT_RESOURCE_FILTER = "SoftwareComponentResourceFilter";

    @objid ("401d8c54-874a-448b-87b6-00561f032224")
    public static final String SCALABILITY_MODEL = "ScalabilityModel";

    @objid ("fc9f468b-529d-4a94-aac6-32668401159d")
    public static final String EVENT = "Event";

    @objid ("298cc7a6-7a04-4282-aad7-acdfedf75ddb")
    public static final String UNARY_EVENT_PATTERN = "UnaryEventPattern";

    @objid ("a9e0a8b2-5e84-4d08-a30d-cfee7c81a172")
    public static final String FUNCTIONAL_EVENT = "FunctionalEvent";

    @objid ("1485cda3-09ea-4de6-8d80-786408d96aa4")
    public static final String BINARY_EVENT_PATTERN = "BinaryEventPattern";

    @objid ("f024a15c-b9b0-4e11-8a95-34613cd66852")
    public static final String EVENT_PATTERN = "EventPattern";

    @objid ("7279c33c-7e52-4a11-a612-9b521fe93d7c")
    public static final String SINGLE_EVENT = "SingleEvent";

    @objid ("90267c30-b4f5-4b41-852e-c496ce3b601b")
    public static final String NON_FUNCTIONA_LEVENT = "NonFunctionalEvent";

    @objid ("f6ef3e50-0256-406d-b17f-f294d36a43f1")
    public static final String EVENT_INSTANCE = "EventInstance";

    @objid ("c8e9d643-f0f4-4e37-9f40-d793a1e7c095")
    public static final String SCALABILITY_RULE = "ScalabilityRule";

    @objid ("26307274-e4ea-45fb-963f-9d4041beba03")
    public static final String NON_FUNCTIONAL_EVENT_INSTANCE = "NonFunctionalEventInstance";

    @objid ("ce840193-535f-4273-9aed-2dd443c24b7b")
    public static final String FUNCTIONAL_EVENT_INSTANCE = "FunctionalEventInstance";

    @objid ("d83065ac-2ded-42f1-9b05-f6a4bf1d8bb5")
    public static final String SCALING_ACTION = "ScalingAction";

    @objid ("188c830f-f258-40a5-9952-1fcb3ec9e072")
    public static final String HORIZONTAL_SCALING_ACTION = "HorizontalScalingAction";

    @objid ("4f465233-eeb0-4be0-9a25-240e71f49c8b")
    public static final String VERTICAL_SCALING_ACTION = "VerticalScalingAction";

    @objid ("2a017033-70d1-49f0-9788-a378aa7d86c6")
    public static final String TIMER = "Timer";

    @objid ("4578837e-edb7-4a6d-9dcd-364348186791")
    public static final String SECURITY_MODEL = "SecurityModel";

    @objid ("3a90d094-20d4-4eb5-ae48-c3ea61797dc0")
    public static final String SECURITY_DOMAIN = "SecurityDomain";

    @objid ("0fbd02e0-ddbc-4a9d-9adb-f8d32fef6bf3")
    public static final String SECURITY_CONTROL = "SecurityControl";

    @objid ("c1658127-71b2-4d83-bf59-3fa961f7831c")
    public static final String SECURITY_METRIC_INSTANCE = "SecurityMetricInstance";

    @objid ("cdb81fa5-6658-4714-823a-f8bab3c01aa6")
    public static final String RAW_SECURITY_METRIC = "RawSecurityMetric";

    @objid ("5dea8c17-5df5-4565-90fc-4bc7637e997c")
    public static final String SECURITY_ATTRIBUTE = "SecurityAttribute";

    @objid ("e0a0a5a7-5b4c-4515-b092-404f60219e9f")
    public static final String CERTIFIABLE = "Certifiable";

    @objid ("5ccf0c9e-b9f3-433f-8318-c74a58561772")
    public static final String COMPOSITE_SECURITY_METRIC = "CompositeSecurityMetric";

    @objid ("ded244e1-c837-44fe-b270-8ff897f51d9a")
    public static final String SECURITY_SLO = "SecuritySLO";

    @objid ("9d2c485c-6e0d-4f1d-9cbe-5fe83c88b543")
    public static final String TYPE_MODEL = "TypeModel";

    @objid ("d4ce9344-a2ff-4aef-a6af-3ca9f7e218fb")
    public static final String LIMIT = "Limit";

    @objid ("c2013d4a-aba9-4bad-82a7-dc9faf78e59b")
    public static final String VALUE = "Value";

    @objid ("4ed7c838-5157-46f1-87d2-6d699239dc84")
    public static final String STRING_VALUE = "StringValue";

    @objid ("be0234e2-3866-41b6-9120-e64d1cd219f6")
    public static final String BOOLEAN_VALUE = "BooleanValue";

    @objid ("ccdb66aa-ba71-4fb0-84b0-3da26948f555")
    public static final String NUMERIC_VALUE = "NumericValue";

    @objid ("65eb0938-a9a9-4aa8-a301-530aec2e39b8")
    public static final String INT_VALUE = "IntValue";

    @objid ("9d73a1f2-49cd-4c50-ae05-6267fca7b6e0")
    public static final String FLOAT_VALUE = "FloatValue";

    @objid ("dca45fac-26cc-478b-bbe6-ffcfd61f0f3b")
    public static final String VALUE_TYPE = "ValueType";

    @objid ("861ed39c-e813-4e60-995f-8350601deee5")
    public static final String LIST = "List";

    @objid ("bef65987-89b1-4760-9fe2-a630669d4f83")
    public static final String DOUBLE_VALUE = "DoubleValue";

    @objid ("eed452d3-ce0e-48b9-b382-72264f0a3b3c")
    public static final String BOOLEAN_VALUE_TYPE = "BooleanValueType";

    @objid ("82aa7ef3-6321-46f4-9fa6-1342b7e925df")
    public static final String STRING_VALUE_TYPE = "StringValueType";

    @objid ("01da42bb-bc5d-4f1a-89f6-d00ce4e7ea1c")
    public static final String RANGE_UNION = "RangeUnion";

    @objid ("e36dfe11-8256-4ee7-8aa8-efd669bb5d6f")
    public static final String RANGE = "Range";

    @objid ("e0c34cbc-d4a5-4d66-abf5-6f48d5f15f0b")
    public static final String UNIT_MODEL = "UnitModel";

    @objid ("b41e6bf1-7d7a-414d-9f0a-692e8c2897d2")
    public static final String UNIT = "Unit";

    @objid ("3053ac2d-ff1c-4014-a503-d4d9e7e66df6")
    public static final String DIMENSIONED_UNIT = "DimensionedUnit";

    @objid ("8100e048-3216-4031-9ccc-5d9bfdca7a00")
    public static final String UNIT_DIMENSION = "UnitDimension";

    @objid ("18189304-d0be-4846-8483-067ac117e7c1")
    public static final String DIMENSIONLESS = "Dimensionless";

    @objid ("b6043b37-ea32-4f5b-b63f-3966fe14dc54")
    public static final String SINGLE_UNIT = "SingleUnit";

    @objid ("0413a5b7-e044-46c6-a94f-7e3ebfe7d8d1")
    public static final String COMPOSITE_UNIT = "CompositeUnit";

    @objid ("bce06be4-981a-411c-ad29-0eca8ef261ed")
    public static final String CONSTRAINT_MODEL = "ConstraintModel";

    @objid ("fbcadf13-f784-4039-bf9d-3c128c121dfc")
    public static final String CONSTRAINT = "Constraint";

    @objid ("9fc5fc6e-ffd5-4c33-9768-bebf662d7570")
    public static final String UNARY_CONSTRAINT = "UnaryConstraint";

    @objid ("07ba70b2-31e0-4ee8-8052-d7e02772a8a9")
    public static final String COMPOSITE_CONSTRAINT = "CompositeConstraint";

    @objid ("1f188423-910f-491c-b3c0-1ade931bef54")
    public static final String ATTRIBUTE_CONSTRAINT = "AttributeConstraint";

    @objid ("99a60ad4-66c3-4510-88aa-7989a47c0e33")
    public static final String METRIC_CONSTRAINT = "MetricConstraint";

    @objid ("738ed93b-866c-4869-9660-2baae6827a55")
    public static final String IF_THEN_CONSTRAINT = "IfThenConstraint";

    @objid ("864064b4-04bf-4e80-b9e7-fd5f1e99592b")
    public static final String METRIC_VARIABLE_CONSTRAINT = "MetricVariableConstraint";

    @objid ("f2d5fb94-9909-4836-9a3f-1d96bd006b6f")
    public static final String LOGICAL_CONSTRAINT = "LogicalConstraint";

    @objid ("455088b3-afb4-4d89-9f55-0ebc9cf5434b")
    public static final String DATA_MODEL = "DataModel";

    @objid ("9a575f29-5307-4509-b81d-2aea079f3e6d")
    public static final String DATA_TYPE_MODEL = "DataTypeModel";

    @objid ("602d6dfa-f2b1-4716-9e6d-514c70991029")
    public static final String DATAINSTANCE = "DataInstance";

    @objid ("23f058ed-9ebb-4c05-beab-c7183aa9b737")
    public static final String DATA_SOURCE = "DataSource";

    @objid ("819f9528-9d27-48b4-8018-dc5c97f159f8")
    public static final String DATA_INSTANCE_MODEL = "DataInstanceModel";

    @objid ("59127d0b-2ead-4921-820b-9ff40fd916de")
    public static final String DATA = "Data";

    @objid ("88c087d4-d46e-4ed1-96de-bc2cda4b9429")
    public static final String DATA_SOURCE_INSTANCE = "DataSourceInstance";

    @objid ("9efd4097-705e-47f6-83ba-7a741d853d2f")
    public static final String SUB_MODEL = "SubModel";

}
