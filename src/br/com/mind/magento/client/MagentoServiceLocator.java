/**
 * MagentoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.mind.magento.client;

public class MagentoServiceLocator extends org.apache.axis.client.Service implements br.com.mind.magento.client.MagentoService {

    public MagentoServiceLocator() {
    }


    public MagentoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MagentoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Mage_Api_Model_Server_V2_HandlerPort
    private java.lang.String Mage_Api_Model_Server_V2_HandlerPort_address = "https://admin.handara.signashop.com.br/index.php/api/v2_soap";

    public java.lang.String getMage_Api_Model_Server_V2_HandlerPortAddress() {
        return Mage_Api_Model_Server_V2_HandlerPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Mage_Api_Model_Server_V2_HandlerPortWSDDServiceName = "Mage_Api_Model_Server_V2_HandlerPort";

    public java.lang.String getMage_Api_Model_Server_V2_HandlerPortWSDDServiceName() {
        return Mage_Api_Model_Server_V2_HandlerPortWSDDServiceName;
    }

    public void setMage_Api_Model_Server_V2_HandlerPortWSDDServiceName(java.lang.String name) {
        Mage_Api_Model_Server_V2_HandlerPortWSDDServiceName = name;
    }

    public br.com.mind.magento.client.Mage_Api_Model_Server_V2_HandlerPortType getMage_Api_Model_Server_V2_HandlerPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Mage_Api_Model_Server_V2_HandlerPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMage_Api_Model_Server_V2_HandlerPort(endpoint);
    }

    public br.com.mind.magento.client.Mage_Api_Model_Server_V2_HandlerPortType getMage_Api_Model_Server_V2_HandlerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.mind.magento.client.Mage_Api_Model_Server_V2_HandlerBindingStub _stub = new br.com.mind.magento.client.Mage_Api_Model_Server_V2_HandlerBindingStub(portAddress, this);
            _stub.setPortName(getMage_Api_Model_Server_V2_HandlerPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMage_Api_Model_Server_V2_HandlerPortEndpointAddress(java.lang.String address) {
        Mage_Api_Model_Server_V2_HandlerPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.mind.magento.client.Mage_Api_Model_Server_V2_HandlerPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.mind.magento.client.Mage_Api_Model_Server_V2_HandlerBindingStub _stub = new br.com.mind.magento.client.Mage_Api_Model_Server_V2_HandlerBindingStub(new java.net.URL(Mage_Api_Model_Server_V2_HandlerPort_address), this);
                _stub.setPortName(getMage_Api_Model_Server_V2_HandlerPortWSDDServiceName());
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
        if ("Mage_Api_Model_Server_V2_HandlerPort".equals(inputPortName)) {
            return getMage_Api_Model_Server_V2_HandlerPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:Magento", "MagentoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:Magento", "Mage_Api_Model_Server_V2_HandlerPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Mage_Api_Model_Server_V2_HandlerPort".equals(portName)) {
            setMage_Api_Model_Server_V2_HandlerPortEndpointAddress(address);
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
