/**
 * IAdministracionDocumentosDeTrabajoService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public class IAdministracionDocumentosDeTrabajoService_ServiceLocator extends org.apache.axis.client.Service implements external.services.ee.gcaba.gob.ar.IAdministracionDocumentosDeTrabajoService_Service {

    public IAdministracionDocumentosDeTrabajoService_ServiceLocator() {
    }


    public IAdministracionDocumentosDeTrabajoService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IAdministracionDocumentosDeTrabajoService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IAdministracionDocumentosDeTrabajoServicePort
    private java.lang.String IAdministracionDocumentosDeTrabajoServicePort_address = "http://sade-mule.gcba.gob.ar/EEServices/documentos-trabajo";

    public java.lang.String getIAdministracionDocumentosDeTrabajoServicePortAddress() {
        return IAdministracionDocumentosDeTrabajoServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IAdministracionDocumentosDeTrabajoServicePortWSDDServiceName = "IAdministracionDocumentosDeTrabajoServicePort";

    public java.lang.String getIAdministracionDocumentosDeTrabajoServicePortWSDDServiceName() {
        return IAdministracionDocumentosDeTrabajoServicePortWSDDServiceName;
    }

    public void setIAdministracionDocumentosDeTrabajoServicePortWSDDServiceName(java.lang.String name) {
        IAdministracionDocumentosDeTrabajoServicePortWSDDServiceName = name;
    }

    public external.services.ee.gcaba.gob.ar.IAdministracionDocumentosDeTrabajoService_PortType getIAdministracionDocumentosDeTrabajoServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IAdministracionDocumentosDeTrabajoServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIAdministracionDocumentosDeTrabajoServicePort(endpoint);
    }

    public external.services.ee.gcaba.gob.ar.IAdministracionDocumentosDeTrabajoService_PortType getIAdministracionDocumentosDeTrabajoServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            external.services.ee.gcaba.gob.ar.IAdministracionDocumentosDeTrabajoServiceSoapBindingStub _stub = new external.services.ee.gcaba.gob.ar.IAdministracionDocumentosDeTrabajoServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getIAdministracionDocumentosDeTrabajoServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIAdministracionDocumentosDeTrabajoServicePortEndpointAddress(java.lang.String address) {
        IAdministracionDocumentosDeTrabajoServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (external.services.ee.gcaba.gob.ar.IAdministracionDocumentosDeTrabajoService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                external.services.ee.gcaba.gob.ar.IAdministracionDocumentosDeTrabajoServiceSoapBindingStub _stub = new external.services.ee.gcaba.gob.ar.IAdministracionDocumentosDeTrabajoServiceSoapBindingStub(new java.net.URL(IAdministracionDocumentosDeTrabajoServicePort_address), this);
                _stub.setPortName(getIAdministracionDocumentosDeTrabajoServicePortWSDDServiceName());
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
        if ("IAdministracionDocumentosDeTrabajoServicePort".equals(inputPortName)) {
            return getIAdministracionDocumentosDeTrabajoServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "IAdministracionDocumentosDeTrabajoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "IAdministracionDocumentosDeTrabajoServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IAdministracionDocumentosDeTrabajoServicePort".equals(portName)) {
            setIAdministracionDocumentosDeTrabajoServicePortEndpointAddress(address);
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
