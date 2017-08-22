/**
 * AdminServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public interface AdminServiceService extends javax.xml.rpc.Service {
    public java.lang.String getAdministratorServiceAddress();

    public AdminClient.AdminService getAdministratorService() throws javax.xml.rpc.ServiceException;

    public AdminClient.AdminService getAdministratorService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
