/**
 * IExternalGenerarDocumentoServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package generardocumento.external.services.satra.gedo.gcaba.gob.ar;

public class IExternalGenerarDocumentoServiceSoapBindingStub extends org.apache.axis.client.Stub implements generardocumento.external.services.satra.gedo.gcaba.gob.ar.IExternalGenerarDocumentoService_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[2];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generarDocumentoGEDO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "requestExternalGenerarDocumento"), generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumento.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "responseExternalGenerarDocumento"));
        oper.setReturnClass(generardocumento.external.services.satra.gedo.gcaba.gob.ar.ResponseExternalGenerarDocumento.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "ErrorGeneracionDocumentoException"),
                      "generardocumento.external.services.satra.gedo.gcaba.gob.ar.ErrorGeneracionDocumentoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "ErrorGeneracionDocumentoException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "ClavesFaltantesException"),
                      "generardocumento.external.services.satra.gedo.gcaba.gob.ar.ClavesFaltantesException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "ClavesFaltantesException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "ParametroInvalidoException"),
                      "generardocumento.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "ParametroInvalidoException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "CantidadDatosNoSoportadaException"),
                      "generardocumento.external.services.satra.gedo.gcaba.gob.ar.CantidadDatosNoSoportadaException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "CantidadDatosNoSoportadaException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generarDocumentoUsuarioExterno");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "requestExternalGenerarDocumentoUsuarioExterno"), generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumentoUsuarioExterno.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "responseExternalGenerarDocumento"));
        oper.setReturnClass(generardocumento.external.services.satra.gedo.gcaba.gob.ar.ResponseExternalGenerarDocumento.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "ErrorGeneracionDocumentoException"),
                      "generardocumento.external.services.satra.gedo.gcaba.gob.ar.ErrorGeneracionDocumentoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "ErrorGeneracionDocumentoException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "ClavesFaltantesException"),
                      "generardocumento.external.services.satra.gedo.gcaba.gob.ar.ClavesFaltantesException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "ClavesFaltantesException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "ParametroInvalidoException"),
                      "generardocumento.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "ParametroInvalidoException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "CantidadDatosNoSoportadaException"),
                      "generardocumento.external.services.satra.gedo.gcaba.gob.ar.CantidadDatosNoSoportadaException",
                      new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "CantidadDatosNoSoportadaException"), 
                      true
                     ));
        _operations[1] = oper;

    }

    public IExternalGenerarDocumentoServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public IExternalGenerarDocumentoServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public IExternalGenerarDocumentoServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", ">>requestExternalGenerarDocumento>listaUsuariosDestinatariosExternos>entry");
            cachedSerQNames.add(qName);
            cls = generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumentoListaUsuariosDestinatariosExternosEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", ">>requestExternalGenerarDocumento>metaDatos>entry");
            cachedSerQNames.add(qName);
            cls = generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumentoMetaDatosEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", ">requestExternalGenerarDocumento>listaUsuariosDestinatariosExternos");
            cachedSerQNames.add(qName);
            cls = generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumentoListaUsuariosDestinatariosExternosEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", ">>requestExternalGenerarDocumento>listaUsuariosDestinatariosExternos>entry");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", ">requestExternalGenerarDocumento>metaDatos");
            cachedSerQNames.add(qName);
            cls = generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumentoMetaDatosEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", ">>requestExternalGenerarDocumento>metaDatos>entry");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "archivoEmbebidoDTO");
            cachedSerQNames.add(qName);
            cls = generardocumento.external.services.satra.gedo.gcaba.gob.ar.ArchivoEmbebidoDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "CantidadDatosNoSoportadaException");
            cachedSerQNames.add(qName);
            cls = generardocumento.external.services.satra.gedo.gcaba.gob.ar.CantidadDatosNoSoportadaException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "ClavesFaltantesException");
            cachedSerQNames.add(qName);
            cls = generardocumento.external.services.satra.gedo.gcaba.gob.ar.ClavesFaltantesException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "ErrorGeneracionDocumentoException");
            cachedSerQNames.add(qName);
            cls = generardocumento.external.services.satra.gedo.gcaba.gob.ar.ErrorGeneracionDocumentoException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "ParametroInvalidoException");
            cachedSerQNames.add(qName);
            cls = generardocumento.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "requestExternalGenerarDocumento");
            cachedSerQNames.add(qName);
            cls = generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "requestExternalGenerarDocumentoUsuarioExterno");
            cachedSerQNames.add(qName);
            cls = generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumentoUsuarioExterno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "responseExternalGenerarDocumento");
            cachedSerQNames.add(qName);
            cls = generardocumento.external.services.satra.gedo.gcaba.gob.ar.ResponseExternalGenerarDocumento.class;
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

    public generardocumento.external.services.satra.gedo.gcaba.gob.ar.ResponseExternalGenerarDocumento generarDocumentoGEDO(generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumento request) throws java.rmi.RemoteException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.ErrorGeneracionDocumentoException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.ClavesFaltantesException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.CantidadDatosNoSoportadaException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "generarDocumentoGEDO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (generardocumento.external.services.satra.gedo.gcaba.gob.ar.ResponseExternalGenerarDocumento) _resp;
            } catch (java.lang.Exception _exception) {
                return (generardocumento.external.services.satra.gedo.gcaba.gob.ar.ResponseExternalGenerarDocumento) org.apache.axis.utils.JavaUtils.convert(_resp, generardocumento.external.services.satra.gedo.gcaba.gob.ar.ResponseExternalGenerarDocumento.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof generardocumento.external.services.satra.gedo.gcaba.gob.ar.ErrorGeneracionDocumentoException) {
              throw (generardocumento.external.services.satra.gedo.gcaba.gob.ar.ErrorGeneracionDocumentoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof generardocumento.external.services.satra.gedo.gcaba.gob.ar.ClavesFaltantesException) {
              throw (generardocumento.external.services.satra.gedo.gcaba.gob.ar.ClavesFaltantesException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof generardocumento.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoException) {
              throw (generardocumento.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof generardocumento.external.services.satra.gedo.gcaba.gob.ar.CantidadDatosNoSoportadaException) {
              throw (generardocumento.external.services.satra.gedo.gcaba.gob.ar.CantidadDatosNoSoportadaException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public generardocumento.external.services.satra.gedo.gcaba.gob.ar.ResponseExternalGenerarDocumento generarDocumentoUsuarioExterno(generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumentoUsuarioExterno request) throws java.rmi.RemoteException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.ErrorGeneracionDocumentoException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.ClavesFaltantesException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.CantidadDatosNoSoportadaException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "generarDocumentoUsuarioExterno"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (generardocumento.external.services.satra.gedo.gcaba.gob.ar.ResponseExternalGenerarDocumento) _resp;
            } catch (java.lang.Exception _exception) {
                return (generardocumento.external.services.satra.gedo.gcaba.gob.ar.ResponseExternalGenerarDocumento) org.apache.axis.utils.JavaUtils.convert(_resp, generardocumento.external.services.satra.gedo.gcaba.gob.ar.ResponseExternalGenerarDocumento.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof generardocumento.external.services.satra.gedo.gcaba.gob.ar.ErrorGeneracionDocumentoException) {
              throw (generardocumento.external.services.satra.gedo.gcaba.gob.ar.ErrorGeneracionDocumentoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof generardocumento.external.services.satra.gedo.gcaba.gob.ar.ClavesFaltantesException) {
              throw (generardocumento.external.services.satra.gedo.gcaba.gob.ar.ClavesFaltantesException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof generardocumento.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoException) {
              throw (generardocumento.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof generardocumento.external.services.satra.gedo.gcaba.gob.ar.CantidadDatosNoSoportadaException) {
              throw (generardocumento.external.services.satra.gedo.gcaba.gob.ar.CantidadDatosNoSoportadaException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
