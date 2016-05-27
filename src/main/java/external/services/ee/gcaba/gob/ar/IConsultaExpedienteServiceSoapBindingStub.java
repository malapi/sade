/**
 * IConsultaExpedienteServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public class IConsultaExpedienteServiceSoapBindingStub extends org.apache.axis.client.Stub implements external.services.ee.gcaba.gob.ar.IConsultaExpedienteService_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[14];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerDocumentoCaratulaVariable");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoEE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"),
                      "external.services.ee.gcaba.gob.ar.ParametroIncorrectoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaEEDetallado");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoEE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "consultaExpedienteResponseDetallado"));
        oper.setReturnClass(external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponseDetallado.class);
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
        oper.setName("obtenerCaratulaPorNumeroExpediente");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "expedienteCodigo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "consultaExpedienteResponse"));
        oper.setReturnClass(external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException"),
                      "external.services.ee.gcaba.gob.ar.ProcesoFallidoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerDatosCaratulaVariable");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoEE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "caratulaVariableResponse"));
        oper.setReturnClass(external.services.ee.gcaba.gob.ar.CaratulaVariableResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"),
                      "external.services.ee.gcaba.gob.ar.ParametroIncorrectoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validarEE");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoEE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaIdFCPorExpediente");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoEE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
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
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteInexistenteException"),
                      "external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteInexistenteException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerHistorialDePasesDeExpediente");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoEE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "historialDePasesResponse"));
        oper.setReturnClass(external.services.ee.gcaba.gob.ar.HistorialDePasesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"),
                      "external.services.ee.gcaba.gob.ar.ParametroIncorrectoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerExpedientesEnGuardaTemporalMayorA24Meses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cantidadDeDias"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "expedienteElectronicoResponse"));
        oper.setReturnClass(external.services.ee.gcaba.gob.ar.ExpedienteElectronicoResponse[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaEE");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoEE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "consultaExpedienteResponse"));
        oper.setReturnClass(external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse.class);
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
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaExpedientesPorSistemaOrigenUsuario");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sistemaOrigen"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "usuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"),
                      "external.services.ee.gcaba.gob.ar.ParametroIncorrectoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerCaratulaPorCodigoEE");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "obtenerCaratulaPorCodigoEERequest"), external.services.ee.gcaba.gob.ar.ObtenerCaratulaPorCodigoEERequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ObtenerCaratulaPorCodigoEEResponse"));
        oper.setReturnClass(external.services.ee.gcaba.gob.ar.ObtenerCaratulaPorCodigoEEResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException"),
                      "external.services.ee.gcaba.gob.ar.ProcesoFallidoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarDatosExpedientePorCodigosDeTrata");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listaDeCodigosTrata"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "expedienteEstado"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "expedienteUsuarioAsignado"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "consultaExpedienteResponse"));
        oper.setReturnClass(external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException"),
                      "external.services.ee.gcaba.gob.ar.ProcesoFallidoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obtenerExpedientesEnGuardaTemporalPorCodigoExpediente");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "codigoExpediente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "expedienteElectronicoResponse"));
        oper.setReturnClass(external.services.ee.gcaba.gob.ar.ExpedienteElectronicoResponse[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaExpedientesPorSistemaOrigenReparticion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sistemaOrigen"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reparticion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"),
                      "external.services.ee.gcaba.gob.ar.ParametroIncorrectoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException"), 
                      true
                     ));
        _operations[13] = oper;

    }

    public IConsultaExpedienteServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public IConsultaExpedienteServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public IConsultaExpedienteServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "campoFFCCDTO");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.CampoFFCCDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "caratulaVariableResponse");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.CaratulaVariableResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "consultaExpedienteResponse");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "consultaExpedienteResponseDetallado");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponseDetallado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "datosTareaBean");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.DatosTareaBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "documentosVinculadosResponse");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.DocumentosVinculadosResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "dtoDatosCaratula");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.DtoDatosCaratula.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "expedienteAsociadoDTO");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.ExpedienteAsociadoDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "expedienteAsociadoResponse");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.ExpedienteAsociadoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "expedienteElectronicoResponse");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.ExpedienteElectronicoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ExpedienteInexistenteException");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "expedienteMetadataExternal");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.ExpedienteMetadataExternal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "expedientesFusionResponse");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.ExpedientesFusionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "expedientesVinculadosResponse");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.ExpedientesVinculadosResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "historialDeOperacionResponse");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.HistorialDeOperacionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "historialDePasesResponse");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.HistorialDePasesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "obtenerCaratulaPorCodigoEERequest");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.ObtenerCaratulaPorCodigoEERequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ObtenerCaratulaPorCodigoEEResponse");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.ObtenerCaratulaPorCodigoEEResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ParametroIncorrectoException");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.ParametroIncorrectoException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ProcesoFallidoException");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.ProcesoFallidoException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "solicitanteResponse");
            cachedSerQNames.add(qName);
            cls = external.services.ee.gcaba.gob.ar.SolicitanteResponse.class;
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

    public byte[] obtenerDocumentoCaratulaVariable(java.lang.String codigoEE, java.lang.String usuario) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "obtenerDocumentoCaratulaVariable"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codigoEE, usuario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
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
   }
  throw axisFaultException;
}
    }

    public external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponseDetallado consultaEEDetallado(java.lang.String codigoEE) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "consultaEEDetallado"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codigoEE});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponseDetallado) _resp;
            } catch (java.lang.Exception _exception) {
                return (external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponseDetallado) org.apache.axis.utils.JavaUtils.convert(_resp, external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponseDetallado.class);
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

    public external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse obtenerCaratulaPorNumeroExpediente(java.lang.String expedienteCodigo) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "obtenerCaratulaPorNumeroExpediente"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {expedienteCodigo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ProcesoFallidoException) {
              throw (external.services.ee.gcaba.gob.ar.ProcesoFallidoException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public external.services.ee.gcaba.gob.ar.CaratulaVariableResponse obtenerDatosCaratulaVariable(java.lang.String codigoEE, java.lang.String usuario) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "obtenerDatosCaratulaVariable"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codigoEE, usuario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (external.services.ee.gcaba.gob.ar.CaratulaVariableResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (external.services.ee.gcaba.gob.ar.CaratulaVariableResponse) org.apache.axis.utils.JavaUtils.convert(_resp, external.services.ee.gcaba.gob.ar.CaratulaVariableResponse.class);
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
   }
  throw axisFaultException;
}
    }

    public boolean validarEE(java.lang.String codigoEE) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "validarEE"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codigoEE});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int consultaIdFCPorExpediente(java.lang.String codigoEE) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "consultaIdFCPorExpediente"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codigoEE});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
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
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException) {
              throw (external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public external.services.ee.gcaba.gob.ar.HistorialDePasesResponse obtenerHistorialDePasesDeExpediente(java.lang.String codigoEE) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "obtenerHistorialDePasesDeExpediente"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codigoEE});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (external.services.ee.gcaba.gob.ar.HistorialDePasesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (external.services.ee.gcaba.gob.ar.HistorialDePasesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, external.services.ee.gcaba.gob.ar.HistorialDePasesResponse.class);
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
   }
  throw axisFaultException;
}
    }

    public external.services.ee.gcaba.gob.ar.ExpedienteElectronicoResponse[] obtenerExpedientesEnGuardaTemporalMayorA24Meses(java.lang.Integer cantidadDeDias) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "obtenerExpedientesEnGuardaTemporalMayorA24Meses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cantidadDeDias});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (external.services.ee.gcaba.gob.ar.ExpedienteElectronicoResponse[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (external.services.ee.gcaba.gob.ar.ExpedienteElectronicoResponse[]) org.apache.axis.utils.JavaUtils.convert(_resp, external.services.ee.gcaba.gob.ar.ExpedienteElectronicoResponse[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse consultaEE(java.lang.String codigoEE) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "consultaEE"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codigoEE});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse.class);
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

    public java.lang.String[] consultaExpedientesPorSistemaOrigenUsuario(java.lang.String sistemaOrigen, java.lang.String usuario) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "consultaExpedientesPorSistemaOrigenUsuario"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sistemaOrigen, usuario});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
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
   }
  throw axisFaultException;
}
    }

    public external.services.ee.gcaba.gob.ar.ObtenerCaratulaPorCodigoEEResponse obtenerCaratulaPorCodigoEE(external.services.ee.gcaba.gob.ar.ObtenerCaratulaPorCodigoEERequest request) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "obtenerCaratulaPorCodigoEE"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (external.services.ee.gcaba.gob.ar.ObtenerCaratulaPorCodigoEEResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (external.services.ee.gcaba.gob.ar.ObtenerCaratulaPorCodigoEEResponse) org.apache.axis.utils.JavaUtils.convert(_resp, external.services.ee.gcaba.gob.ar.ObtenerCaratulaPorCodigoEEResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ProcesoFallidoException) {
              throw (external.services.ee.gcaba.gob.ar.ProcesoFallidoException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse consultarDatosExpedientePorCodigosDeTrata(java.lang.String[] listaDeCodigosTrata, java.lang.String expedienteEstado, java.lang.String expedienteUsuarioAsignado) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "consultarDatosExpedientePorCodigosDeTrata"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {listaDeCodigosTrata, expedienteEstado, expedienteUsuarioAsignado});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof external.services.ee.gcaba.gob.ar.ProcesoFallidoException) {
              throw (external.services.ee.gcaba.gob.ar.ProcesoFallidoException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public external.services.ee.gcaba.gob.ar.ExpedienteElectronicoResponse[] obtenerExpedientesEnGuardaTemporalPorCodigoExpediente(java.lang.String codigoExpediente) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "obtenerExpedientesEnGuardaTemporalPorCodigoExpediente"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {codigoExpediente});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (external.services.ee.gcaba.gob.ar.ExpedienteElectronicoResponse[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (external.services.ee.gcaba.gob.ar.ExpedienteElectronicoResponse[]) org.apache.axis.utils.JavaUtils.convert(_resp, external.services.ee.gcaba.gob.ar.ExpedienteElectronicoResponse[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] consultaExpedientesPorSistemaOrigenReparticion(java.lang.String sistemaOrigen, java.lang.String reparticion) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "consultaExpedientesPorSistemaOrigenReparticion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sistemaOrigen, reparticion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
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
   }
  throw axisFaultException;
}
    }

}
