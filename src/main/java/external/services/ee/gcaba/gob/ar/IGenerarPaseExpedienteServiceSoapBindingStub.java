/**
 * IGenerarPaseExpedienteServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public class IGenerarPaseExpedienteServiceSoapBindingStub extends org.apache.axis.client.Stub implements external.services.ee.gcaba.gob.ar.IGenerarPaseExpedienteService_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[8];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generarPaseASolicitudArchivo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "datosPase"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "paseExpedienteRequest"), external.services.ee.gcaba.gob.ar.PaseExpedienteRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"),
                      "external.services.ee.gcaba.gob.ar.ParametroIncorrectoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteNoDisponibleException"),
                      "external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteNoDisponibleException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException"),
                      "external.services.ee.gcaba.gob.ar.ProcesoFallidoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteInexistenteException"),
                      "external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteInexistenteException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generarPaseEEConBloqueo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "datosPase"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "paseExpedienteRequest"), external.services.ee.gcaba.gob.ar.PaseExpedienteRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"),
                      "external.services.ee.gcaba.gob.ar.ParametroIncorrectoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteNoDisponibleException"),
                      "external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteNoDisponibleException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException"),
                      "external.services.ee.gcaba.gob.ar.ProcesoFallidoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteInexistenteException"),
                      "external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteInexistenteException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generarPaseEESinDocumento");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "datosPase"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "paseExpedienteRequest"), external.services.ee.gcaba.gob.ar.PaseExpedienteRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numeroSadePase"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"),
                      "external.services.ee.gcaba.gob.ar.ParametroIncorrectoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteNoDisponibleException"),
                      "external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteNoDisponibleException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException"),
                      "external.services.ee.gcaba.gob.ar.ProcesoFallidoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteInexistenteException"),
                      "external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteInexistenteException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generarPaseEE");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "datosPase"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "paseExpedienteRequest"), external.services.ee.gcaba.gob.ar.PaseExpedienteRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"),
                      "external.services.ee.gcaba.gob.ar.ParametroIncorrectoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteNoDisponibleException"),
                      "external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteNoDisponibleException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException"),
                      "external.services.ee.gcaba.gob.ar.ProcesoFallidoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteInexistenteException"),
                      "external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteInexistenteException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generarPaseEEAArchivo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "datosPase"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "paseExpedienteRequest"), external.services.ee.gcaba.gob.ar.PaseExpedienteRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"),
                      "external.services.ee.gcaba.gob.ar.ParametroIncorrectoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteNoDisponibleException"),
                      "external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteNoDisponibleException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException"),
                      "external.services.ee.gcaba.gob.ar.ProcesoFallidoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteInexistenteException"),
                      "external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteInexistenteException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generarPaseEEAdministrador");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "paseExpedienteRequest"), external.services.ee.gcaba.gob.ar.PaseExpedienteRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"),
                      "external.services.ee.gcaba.gob.ar.ParametroIncorrectoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteNoDisponibleException"),
                      "external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteNoDisponibleException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException"),
                      "external.services.ee.gcaba.gob.ar.ProcesoFallidoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteInexistenteException"),
                      "external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteInexistenteException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generarPaseEEConBloqueoYAclaracion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "datosPase"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "paseExpedienteRequest"), external.services.ee.gcaba.gob.ar.PaseExpedienteRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "aclaracion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"),
                      "external.services.ee.gcaba.gob.ar.ParametroIncorrectoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteNoDisponibleException"),
                      "external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteNoDisponibleException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException"),
                      "external.services.ee.gcaba.gob.ar.ProcesoFallidoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteInexistenteException"),
                      "external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteInexistenteException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generarPaseEEConDesbloqueo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "datosPase"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "paseExpedienteRequest"), external.services.ee.gcaba.gob.ar.PaseExpedienteRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"),
                      "external.services.ee.gcaba.gob.ar.ParametroIncorrectoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteNoDisponibleException"),
                      "external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteNoDisponibleException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException"),
                      "external.services.ee.gcaba.gob.ar.ProcesoFallidoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteInexistenteException"),
                      "external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteInexistenteException"), 
                      true
                     ));
        _operations[7] = oper;

    }

    public IGenerarPaseExpedienteServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public IGenerarPaseExpedienteServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public IGenerarPaseExpedienteServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteInexistenteException");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteNoDisponibleException");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.ParametroIncorrectoException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "paseExpedienteRequest");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.PaseExpedienteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.ProcesoFallidoException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void generarPaseASolicitudArchivo(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest datosPase) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "generarPaseASolicitudArchivo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {datosPase});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ParametroIncorrectoException) {
              throw (external.services.ee.gcaba.gob.ar.ParametroIncorrectoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException) {
              throw (external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ProcesoFallidoException) {
              throw (external.services.ee.gcaba.gob.ar.ProcesoFallidoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException) {
              throw (external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String generarPaseEEConBloqueo(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest datosPase) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "generarPaseEEConBloqueo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {datosPase});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ParametroIncorrectoException) {
              throw (external.services.ee.gcaba.gob.ar.ParametroIncorrectoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException) {
              throw (external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ProcesoFallidoException) {
              throw (external.services.ee.gcaba.gob.ar.ProcesoFallidoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException) {
              throw (external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String generarPaseEESinDocumento(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest datosPase, java.lang.String numeroSadePase) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "generarPaseEESinDocumento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {datosPase, numeroSadePase});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ParametroIncorrectoException) {
              throw (external.services.ee.gcaba.gob.ar.ParametroIncorrectoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException) {
              throw (external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ProcesoFallidoException) {
              throw (external.services.ee.gcaba.gob.ar.ProcesoFallidoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException) {
              throw (external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String generarPaseEE(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest datosPase) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "generarPaseEE"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {datosPase});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ParametroIncorrectoException) {
              throw (external.services.ee.gcaba.gob.ar.ParametroIncorrectoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException) {
              throw (external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ProcesoFallidoException) {
              throw (external.services.ee.gcaba.gob.ar.ProcesoFallidoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException) {
              throw (external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void generarPaseEEAArchivo(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest datosPase) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "generarPaseEEAArchivo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {datosPase});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ParametroIncorrectoException) {
              throw (external.services.ee.gcaba.gob.ar.ParametroIncorrectoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException) {
              throw (external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ProcesoFallidoException) {
              throw (external.services.ee.gcaba.gob.ar.ProcesoFallidoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException) {
              throw (external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String generarPaseEEAdministrador(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest arg0) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "generarPaseEEAdministrador"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ParametroIncorrectoException) {
              throw (external.services.ee.gcaba.gob.ar.ParametroIncorrectoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException) {
              throw (external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ProcesoFallidoException) {
              throw (external.services.ee.gcaba.gob.ar.ProcesoFallidoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException) {
              throw (external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String generarPaseEEConBloqueoYAclaracion(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest datosPase, java.lang.String aclaracion) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "generarPaseEEConBloqueoYAclaracion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {datosPase, aclaracion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ParametroIncorrectoException) {
              throw (external.services.ee.gcaba.gob.ar.ParametroIncorrectoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException) {
              throw (external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ProcesoFallidoException) {
              throw (external.services.ee.gcaba.gob.ar.ProcesoFallidoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException) {
              throw (external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String generarPaseEEConDesbloqueo(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest datosPase) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "generarPaseEEConDesbloqueo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {datosPase});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ParametroIncorrectoException) {
              throw (external.services.ee.gcaba.gob.ar.ParametroIncorrectoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException) {
              throw (external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ProcesoFallidoException) {
              throw (external.services.ee.gcaba.gob.ar.ProcesoFallidoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException) {
              throw (external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
