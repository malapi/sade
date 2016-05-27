/**
 * IAdministracionDeDocumentosOficialesService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public class IAdministracionDeDocumentosOficialesService_ServiceLocator extends org.apache.axis.client.Service implements external.services.ee.gcaba.gob.ar.IAdministracionDeDocumentosOficialesService_Service {

    public IAdministracionDeDocumentosOficialesService_ServiceLocator() {
    }


    public IAdministracionDeDocumentosOficialesService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IAdministracionDeDocumentosOficialesService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IAdministracionDeDocumentosOficialesServicePort
    private java.lang.String IAdministracionDeDocumentosOficialesServicePort_address = "http://sade-mule.hml.gcba.gob.ar/EEServices/documentos-oficiales";

    public java.lang.String getIAdministracionDeDocumentosOficialesServicePortAddress() {
        return IAdministracionDeDocumentosOficialesServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IAdministracionDeDocumentosOficialesServicePortWSDDServiceName = "IAdministracionDeDocumentosOficialesServicePort";

    public java.lang.String getIAdministracionDeDocumentosOficialesServicePortWSDDServiceName() {
        return IAdministracionDeDocumentosOficialesServicePortWSDDServiceName;
    }

    public void setIAdministracionDeDocumentosOficialesServicePortWSDDServiceName(java.lang.String name) {
        IAdministracionDeDocumentosOficialesServicePortWSDDServiceName = name;
    }

    public external.services.ee.gcaba.gob.ar.IAdministracionDeDocumentosOficialesService_PortType getIAdministracionDeDocumentosOficialesServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IAdministracionDeDocumentosOficialesServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIAdministracionDeDocumentosOficialesServicePort(endpoint);
    }

    public external.services.ee.gcaba.gob.ar.IAdministracionDeDocumentosOficialesService_PortType getIAdministracionDeDocumentosOficialesServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            external.services.ee.gcaba.gob.ar.IAdministracionDeDocumentosOficialesServiceSoapBindingStub _stub = new external.services.ee.gcaba.gob.ar.IAdministracionDeDocumentosOficialesServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getIAdministracionDeDocumentosOficialesServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIAdministracionDeDocumentosOficialesServicePortEndpointAddress(java.lang.String address) {
        IAdministracionDeDocumentosOficialesServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (external.services.ee.gcaba.gob.ar.IAdministracionDeDocumentosOficialesService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                external.services.ee.gcaba.gob.ar.IAdministracionDeDocumentosOficialesServiceSoapBindingStub _stub = new external.services.ee.gcaba.gob.ar.IAdministracionDeDocumentosOficialesServiceSoapBindingStub(new java.net.URL(IAdministracionDeDocumentosOficialesServicePort_address), this);
                _stub.setPortName(getIAdministracionDeDocumentosOficialesServicePortWSDDServiceName());
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
        if ("IAdministracionDeDocumentosOficialesServicePort".equals(inputPortName)) {
            return getIAdministracionDeDocumentosOficialesServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "IAdministracionDeDocumentosOficialesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "IAdministracionDeDocumentosOficialesServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IAdministracionDeDocumentosOficialesServicePort".equals(portName)) {
            setIAdministracionDeDocumentosOficialesServicePortEndpointAddress(address);
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
