/**
 * IGenerarPaseExpedienteService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public class IGenerarPaseExpedienteService_ServiceLocator extends org.apache.axis.client.Service implements external.services.ee.gcaba.gob.ar.IGenerarPaseExpedienteService_Service {

    public IGenerarPaseExpedienteService_ServiceLocator() {
    }


    public IGenerarPaseExpedienteService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IGenerarPaseExpedienteService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IGenerarPaseExpedienteServicePort
    private java.lang.String IGenerarPaseExpedienteServicePort_address = "http://sade-mule.hml.gcba.gob.ar/EEServices/generar-pase";

    public java.lang.String getIGenerarPaseExpedienteServicePortAddress() {
        return IGenerarPaseExpedienteServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IGenerarPaseExpedienteServicePortWSDDServiceName = "IGenerarPaseExpedienteServicePort";

    public java.lang.String getIGenerarPaseExpedienteServicePortWSDDServiceName() {
        return IGenerarPaseExpedienteServicePortWSDDServiceName;
    }

    public void setIGenerarPaseExpedienteServicePortWSDDServiceName(java.lang.String name) {
        IGenerarPaseExpedienteServicePortWSDDServiceName = name;
    }

    public external.services.ee.gcaba.gob.ar.IGenerarPaseExpedienteService_PortType getIGenerarPaseExpedienteServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IGenerarPaseExpedienteServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIGenerarPaseExpedienteServicePort(endpoint);
    }

    public external.services.ee.gcaba.gob.ar.IGenerarPaseExpedienteService_PortType getIGenerarPaseExpedienteServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            external.services.ee.gcaba.gob.ar.IGenerarPaseExpedienteServiceSoapBindingStub _stub = new external.services.ee.gcaba.gob.ar.IGenerarPaseExpedienteServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getIGenerarPaseExpedienteServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIGenerarPaseExpedienteServicePortEndpointAddress(java.lang.String address) {
        IGenerarPaseExpedienteServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (external.services.ee.gcaba.gob.ar.IGenerarPaseExpedienteService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                external.services.ee.gcaba.gob.ar.IGenerarPaseExpedienteServiceSoapBindingStub _stub = new external.services.ee.gcaba.gob.ar.IGenerarPaseExpedienteServiceSoapBindingStub(new java.net.URL(IGenerarPaseExpedienteServicePort_address), this);
                _stub.setPortName(getIGenerarPaseExpedienteServicePortWSDDServiceName());
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
        if ("IGenerarPaseExpedienteServicePort".equals(inputPortName)) {
            return getIGenerarPaseExpedienteServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "IGenerarPaseExpedienteService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "IGenerarPaseExpedienteServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IGenerarPaseExpedienteServicePort".equals(portName)) {
            setIGenerarPaseExpedienteServicePortEndpointAddress(address);
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
