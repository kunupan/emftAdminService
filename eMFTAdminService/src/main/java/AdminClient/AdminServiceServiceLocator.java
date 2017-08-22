/**
 * AdminServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class AdminServiceServiceLocator extends org.apache.axis.client.Service implements AdminClient.AdminServiceService {

    public AdminServiceServiceLocator() {
    }


    public AdminServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AdminServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AdministratorService
    private java.lang.String AdministratorService_address = "http://127.0.0.1:7080/cfcc/services/AdministratorService";

    public java.lang.String getAdministratorServiceAddress() {
        return AdministratorService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AdministratorServiceWSDDServiceName = "AdministratorService";

    public java.lang.String getAdministratorServiceWSDDServiceName() {
        return AdministratorServiceWSDDServiceName;
    }

    public void setAdministratorServiceWSDDServiceName(java.lang.String name) {
        AdministratorServiceWSDDServiceName = name;
    }

    public AdminClient.AdminService getAdministratorService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AdministratorService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAdministratorService(endpoint);
    }

    public AdminClient.AdminService getAdministratorService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            AdminClient.AdministratorServiceSoapBindingStub _stub = new AdminClient.AdministratorServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAdministratorServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAdministratorServiceEndpointAddress(java.lang.String address) {
        AdministratorService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (AdminClient.AdminService.class.isAssignableFrom(serviceEndpointInterface)) {
                AdminClient.AdministratorServiceSoapBindingStub _stub = new AdminClient.AdministratorServiceSoapBindingStub(new java.net.URL(AdministratorService_address), this);
                _stub.setPortName(getAdministratorServiceWSDDServiceName());
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
        if ("AdministratorService".equals(inputPortName)) {
            return getAdministratorService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://127.0.0.1:7080/cfcc/services/AdministratorService", "AdminServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://127.0.0.1:7080/cfcc/services/AdministratorService", "AdministratorService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AdministratorService".equals(portName)) {
            setAdministratorServiceEndpointAddress(address);
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
