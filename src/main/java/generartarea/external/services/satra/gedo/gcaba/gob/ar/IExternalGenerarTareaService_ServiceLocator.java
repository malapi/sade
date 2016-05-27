/**
 * IExternalGenerarTareaService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package generartarea.external.services.satra.gedo.gcaba.gob.ar;

public class IExternalGenerarTareaService_ServiceLocator extends org.apache.axis.client.Service implements generartarea.external.services.satra.gedo.gcaba.gob.ar.IExternalGenerarTareaService_Service {

    public IExternalGenerarTareaService_ServiceLocator() {
    }


    public IExternalGenerarTareaService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IExternalGenerarTareaService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IExternalGenerarTareaServicePort
    private java.lang.String IExternalGenerarTareaServicePort_address = "http://sade-mule.hml.gcba.gob.ar/GEDOServices/generarTarea";

    public java.lang.String getIExternalGenerarTareaServicePortAddress() {
        return IExternalGenerarTareaServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IExternalGenerarTareaServicePortWSDDServiceName = "IExternalGenerarTareaServicePort";

    public java.lang.String getIExternalGenerarTareaServicePortWSDDServiceName() {
        return IExternalGenerarTareaServicePortWSDDServiceName;
    }

    public void setIExternalGenerarTareaServicePortWSDDServiceName(java.lang.String name) {
        IExternalGenerarTareaServicePortWSDDServiceName = name;
    }

    public generartarea.external.services.satra.gedo.gcaba.gob.ar.IExternalGenerarTareaService_PortType getIExternalGenerarTareaServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IExternalGenerarTareaServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIExternalGenerarTareaServicePort(endpoint);
    }

    public generartarea.external.services.satra.gedo.gcaba.gob.ar.IExternalGenerarTareaService_PortType getIExternalGenerarTareaServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            generartarea.external.services.satra.gedo.gcaba.gob.ar.IExternalGenerarTareaServiceSoapBindingStub _stub = new generartarea.external.services.satra.gedo.gcaba.gob.ar.IExternalGenerarTareaServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getIExternalGenerarTareaServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIExternalGenerarTareaServicePortEndpointAddress(java.lang.String address) {
        IExternalGenerarTareaServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (generartarea.external.services.satra.gedo.gcaba.gob.ar.IExternalGenerarTareaService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                generartarea.external.services.satra.gedo.gcaba.gob.ar.IExternalGenerarTareaServiceSoapBindingStub _stub = new generartarea.external.services.satra.gedo.gcaba.gob.ar.IExternalGenerarTareaServiceSoapBindingStub(new java.net.URL(IExternalGenerarTareaServicePort_address), this);
                _stub.setPortName(getIExternalGenerarTareaServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("IExternalGenerarTareaServicePort".equals(inputPortName)) {
            return getIExternalGenerarTareaServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "IExternalGenerarTareaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "IExternalGenerarTareaServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IExternalGenerarTareaServicePort".equals(portName)) {
            setIExternalGenerarTareaServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
