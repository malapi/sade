/**
 * ConsultaUsuarioSade_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.service.eu.gcaba.gob.ar;

public class ConsultaUsuarioSade_ServiceLocator extends org.apache.axis.client.Service implements external.service.eu.gcaba.gob.ar.ConsultaUsuarioSade_Service {

    public ConsultaUsuarioSade_ServiceLocator() {
    }


    public ConsultaUsuarioSade_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ConsultaUsuarioSade_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ConsultaUsuarioPort
    private java.lang.String ConsultaUsuarioPort_address = "http://sade-mule.hml.gcba.gob.ar/EUServices/consultaUsuarioSade";

    public java.lang.String getConsultaUsuarioPortAddress() {
        return ConsultaUsuarioPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ConsultaUsuarioPortWSDDServiceName = "ConsultaUsuarioPort";

    public java.lang.String getConsultaUsuarioPortWSDDServiceName() {
        return ConsultaUsuarioPortWSDDServiceName;
    }

    public void setConsultaUsuarioPortWSDDServiceName(java.lang.String name) {
        ConsultaUsuarioPortWSDDServiceName = name;
    }

    public external.service.eu.gcaba.gob.ar.ConsultaUsuarioService getConsultaUsuarioPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ConsultaUsuarioPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getConsultaUsuarioPort(endpoint);
    }

    public external.service.eu.gcaba.gob.ar.ConsultaUsuarioService getConsultaUsuarioPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            external.service.eu.gcaba.gob.ar.ConsultaUsuarioSadeSoapBindingStub _stub = new external.service.eu.gcaba.gob.ar.ConsultaUsuarioSadeSoapBindingStub(portAddress, this);
            _stub.setPortName(getConsultaUsuarioPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setConsultaUsuarioPortEndpointAddress(java.lang.String address) {
        ConsultaUsuarioPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (external.service.eu.gcaba.gob.ar.ConsultaUsuarioService.class.isAssignableFrom(serviceEndpointInterface)) {
                external.service.eu.gcaba.gob.ar.ConsultaUsuarioSadeSoapBindingStub _stub = new external.service.eu.gcaba.gob.ar.ConsultaUsuarioSadeSoapBindingStub(new java.net.URL(ConsultaUsuarioPort_address), this);
                _stub.setPortName(getConsultaUsuarioPortWSDDServiceName());
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
        if ("ConsultaUsuarioPort".equals(inputPortName)) {
            return getConsultaUsuarioPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ar.gob.gcaba.eu.service.external/", "consultaUsuarioSade");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ar.gob.gcaba.eu.service.external/", "ConsultaUsuarioPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ConsultaUsuarioPort".equals(portName)) {
            setConsultaUsuarioPortEndpointAddress(address);
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
