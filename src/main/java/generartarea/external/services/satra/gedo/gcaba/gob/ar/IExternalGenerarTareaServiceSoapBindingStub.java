/**
 * IExternalGenerarTareaServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package generartarea.external.services.satra.gedo.gcaba.gob.ar;

public class IExternalGenerarTareaServiceSoapBindingStub extends org.apache.axis.client.Stub implements generartarea.external.services.satra.gedo.gcaba.gob.ar.IExternalGenerarTareaService_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generarTareaGEDO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "requestExternalGenerarTarea"), generartarea.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarTarea.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "responseExternalGenerarTarea"));
        oper.setReturnClass(generartarea.external.services.satra.gedo.gcaba.gob.ar.ResponseExternalGenerarTarea.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "ParametroNoExisteException"),
                      "generartarea.external.services.satra.gedo.gcaba.gob.ar.ParametroNoExisteException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "ParametroNoExisteException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "ClavesFaltantesException"),
                      "generartarea.external.services.satra.gedo.gcaba.gob.ar.ClavesFaltantesException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "ClavesFaltantesException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "ParametroInvalidoTareaException"),
                      "generartarea.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoTareaException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "ParametroInvalidoTareaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "ErrorGeneracionTareaException"),
                      "generartarea.external.services.satra.gedo.gcaba.gob.ar.ErrorGeneracionTareaException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "ErrorGeneracionTareaException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "ParametroInvalidoException"),
                      "generartarea.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "ParametroInvalidoException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "UsuarioSinPermisoException"),
                      "generartarea.external.services.satra.gedo.gcaba.gob.ar.UsuarioSinPermisoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "UsuarioSinPermisoException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "CantidadDatosNoSoportadaException"),
                      "generartarea.external.services.satra.gedo.gcaba.gob.ar.CantidadDatosNoSoportadaException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "CantidadDatosNoSoportadaException"), 
                      true
                     ));
        _operations[0] = oper;

    }

    public IExternalGenerarTareaServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public IExternalGenerarTareaServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public IExternalGenerarTareaServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", ">>requestExternalGenerarTarea>listaUsuariosDestinatariosExternos>entry");
            cachedSerQNames.add(qName);
            cls = generartarea.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarTareaListaUsuariosDestinatariosExternosEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", ">>requestExternalGenerarTarea>metaDatos>entry");
            cachedSerQNames.add(qName);
            cls = generartarea.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarTareaMetaDatosEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", ">>requestExternalGenerarTarea>usuarioFirmante>entry");
            cachedSerQNames.add(qName);
            cls = generartarea.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarTareaUsuarioFirmanteEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", ">requestExternalGenerarTarea>listaUsuariosDestinatariosExternos");
            cachedSerQNames.add(qName);
            cls = generartarea.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarTareaListaUsuariosDestinatariosExternosEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", ">>requestExternalGenerarTarea>listaUsuariosDestinatariosExternos>entry");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", ">requestExternalGenerarTarea>metaDatos");
            cachedSerQNames.add(qName);
            cls = generartarea.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarTareaMetaDatosEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", ">>requestExternalGenerarTarea>metaDatos>entry");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", ">requestExternalGenerarTarea>usuarioFirmante");
            cachedSerQNames.add(qName);
            cls = generartarea.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarTareaUsuarioFirmanteEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", ">>requestExternalGenerarTarea>usuarioFirmante>entry");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "archivoEmbebidoDTO");
            cachedSerQNames.add(qName);
            cls = generartarea.external.services.satra.gedo.gcaba.gob.ar.ArchivoEmbebidoDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "CantidadDatosNoSoportadaException");
            cachedSerQNames.add(qName);
            cls = generartarea.external.services.satra.gedo.gcaba.gob.ar.CantidadDatosNoSoportadaException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "ClavesFaltantesException");
            cachedSerQNames.add(qName);
            cls = generartarea.external.services.satra.gedo.gcaba.gob.ar.ClavesFaltantesException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "ErrorGeneracionTareaException");
            cachedSerQNames.add(qName);
            cls = generartarea.external.services.satra.gedo.gcaba.gob.ar.ErrorGeneracionTareaException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "ParametroInvalidoException");
            cachedSerQNames.add(qName);
            cls = generartarea.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "ParametroInvalidoTareaException");
            cachedSerQNames.add(qName);
            cls = generartarea.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoTareaException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "ParametroNoExisteException");
            cachedSerQNames.add(qName);
            cls = generartarea.external.services.satra.gedo.gcaba.gob.ar.ParametroNoExisteException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "requestExternalGenerarTarea");
            cachedSerQNames.add(qName);
            cls = generartarea.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarTarea.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "responseExternalGenerarTarea");
            cachedSerQNames.add(qName);
            cls = generartarea.external.services.satra.gedo.gcaba.gob.ar.ResponseExternalGenerarTarea.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "UsuarioSinPermisoException");
            cachedSerQNames.add(qName);
            cls = generartarea.external.services.satra.gedo.gcaba.gob.ar.UsuarioSinPermisoException.class;
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

    public generartarea.external.services.satra.gedo.gcaba.gob.ar.ResponseExternalGenerarTarea generarTareaGEDO(generartarea.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarTarea request) throws java.rmi.RemoteException, generartarea.external.services.satra.gedo.gcaba.gob.ar.ParametroNoExisteException, generartarea.external.services.satra.gedo.gcaba.gob.ar.ClavesFaltantesException, generartarea.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoTareaException, generartarea.external.services.satra.gedo.gcaba.gob.ar.ErrorGeneracionTareaException, generartarea.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoException, generartarea.external.services.satra.gedo.gcaba.gob.ar.UsuarioSinPermisoException, generartarea.external.services.satra.gedo.gcaba.gob.ar.CantidadDatosNoSoportadaException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "generarTareaGEDO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (generartarea.external.services.satra.gedo.gcaba.gob.ar.ResponseExternalGenerarTarea) _resp;
            } catch (java.lang.Exception _exception) {
                return (generartarea.external.services.satra.gedo.gcaba.gob.ar.ResponseExternalGenerarTarea) org.apache.axis.utils.JavaUtils.convert(_resp, generartarea.external.services.satra.gedo.gcaba.gob.ar.ResponseExternalGenerarTarea.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof generartarea.external.services.satra.gedo.gcaba.gob.ar.ParametroNoExisteException) {
              throw (generartarea.external.services.satra.gedo.gcaba.gob.ar.ParametroNoExisteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof generartarea.external.services.satra.gedo.gcaba.gob.ar.ClavesFaltantesException) {
              throw (generartarea.external.services.satra.gedo.gcaba.gob.ar.ClavesFaltantesException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof generartarea.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoTareaException) {
              throw (generartarea.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoTareaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof generartarea.external.services.satra.gedo.gcaba.gob.ar.ErrorGeneracionTareaException) {
              throw (generartarea.external.services.satra.gedo.gcaba.gob.ar.ErrorGeneracionTareaException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof generartarea.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoException) {
              throw (generartarea.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof generartarea.external.services.satra.gedo.gcaba.gob.ar.UsuarioSinPermisoException) {
              throw (generartarea.external.services.satra.gedo.gcaba.gob.ar.UsuarioSinPermisoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof generartarea.external.services.satra.gedo.gcaba.gob.ar.CantidadDatosNoSoportadaException) {
              throw (generartarea.external.services.satra.gedo.gcaba.gob.ar.CantidadDatosNoSoportadaException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
