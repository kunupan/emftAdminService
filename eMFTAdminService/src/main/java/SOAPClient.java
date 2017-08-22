import AdminClient.AdminService;
import AdminClient.DateTime;
import AdminClient.User;
import AdminClient.Server;
import AdminClient.Transfer;

import AdminClient.*;
import java.rmi.RemoteException;
import javax.xml.rpc.Stub;
import javax.xml.rpc.ServiceException;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Created by PansariK on 19/08/2017.
 */
public class SOAPClient {

    public static void main(String[] args) {

        // Input params - fileLocation, operationType = (addUser(U), addServer(S), addTransfer(T)), Env = (Prod, Non-Prod)

        //https://gdclappd0007.transport.nsw.gov.au/cfcc/control?view=services/new/AdministratorService?wsdl
        String ADMIN_USER_ID = "admin";

        String PROD_ADMIN_SERVICE_URL = "https://gdclappp0057.transport.nsw.gov.au/cfcc/control?view=services/new/AdministratorService";
        String PROD_ADMIN_PASSWORD = "TownhallStation01#";

        String NONPROD_ADMIN_SERVICE_URL = "https://gdclappd0007.transport.nsw.gov.au/cfcc/control?view=services/new/AdministratorService";
        String NONPROD_ADMIN_PASSWORD = "BlacktownStation01#";

        String ADMIN_SERVICE_URL = "";
        String ADMIN_PASSWORD = "";


       char operationCode = args[1].charAt(0);
       String fileLocation = args[0];

        if(args[2] == "P") {

            ADMIN_SERVICE_URL = PROD_ADMIN_SERVICE_URL;
            ADMIN_PASSWORD = PROD_ADMIN_PASSWORD;
        }
        else {

            ADMIN_SERVICE_URL = NONPROD_ADMIN_SERVICE_URL;
            ADMIN_PASSWORD = NONPROD_ADMIN_PASSWORD;
        }

        SOAPClient adminClient = new SOAPClient();

        JSONParser parser = new JSONParser();

        try {
            // Object obj = parser.parse(new FileReader("/Users/<username>/Documents/file1.txt"));
            Object obj = parser.parse(new FileReader(args[0]));
            JSONObject jsonObject = (JSONObject) obj;

            switch (operationCode) {

                case 'U':

                    setUserProperties setUser = new setUserProperties();
                    User newUser = new User();
                    newUser = setUser.setUserProperties(fileLocation);
                    try {
                        adminClient.addUser(newUser, ADMIN_USER_ID, ADMIN_PASSWORD ,ADMIN_SERVICE_URL);
                    } catch (Exception e) {
                        System.out.println("Error adding user, " + e.getMessage());
                    }

                    break;

                case 'S':

                    setServerProperties setServer = new setServerProperties();
                    Server newServer = new Server();
                    newServer = setServer.setServerProperties(fileLocation);
                    try {
                        adminClient.addServer(newServer, ADMIN_USER_ID, ADMIN_PASSWORD ,ADMIN_SERVICE_URL);
                    } catch (Exception e) {
                        System.out.println("Error adding user, " + e.getMessage());
                    }

                    break;

                case 'T':

                    setTransferProperties setTransfer = new setTransferProperties();
                    Transfer newTransfer = new Transfer();
                    newTransfer = setTransfer.setTransferProperties(fileLocation);
                    try {
                        adminClient.addTransfer(newTransfer, ADMIN_USER_ID, ADMIN_PASSWORD ,ADMIN_SERVICE_URL);
                    } catch (Exception e) {
                        System.out.println("Error adding user, " + e.getMessage());
                    }

                    break;


            }


        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void addUser(User _usr, String ADMIN_USER_ID, String ADMIN_PASSWORD ,String ADMIN_SERVICE_URL) throws RemoteException, ServiceException
    {
        System.setProperty("org.apache.axis.components.net.SecureSocketFactory","com.proginet.sift.soap.fileTransferService.util.CustomAxisSSLSocketFactory");
        Stub stub = createProxy(ADMIN_USER_ID, ADMIN_PASSWORD);
        stub._setProperty(javax.xml.rpc.Stub.ENDPOINT_ADDRESS_PROPERTY,ADMIN_SERVICE_URL);
        ((org.apache.axis.client.Stub)stub).setMaintainSession(true);
        AdminService admin=(AdminService)stub; // apache stub
// need session id to make SOAP calls
        String sessionId = admin.getSession();
        boolean success = admin.addUser(_usr, sessionId);
        if (success)
        {
            System.out.println("Added user successfully.");
        }
        else
        {
            System.out.println("Failed to add user.");
        }
    }


    public void addServer(Server _server, String ADMIN_USER_ID, String ADMIN_PASSWORD ,String ADMIN_SERVICE_URL) throws RemoteException, ServiceException
    {
        System.setProperty("org.apache.axis.components.net.SecureSocketFactory","com.proginet.sift.soap.fileTransferService.util.CustomAxisSSLSocketFactory");
        Stub stub = createProxy(ADMIN_USER_ID, ADMIN_PASSWORD);
        stub._setProperty(javax.xml.rpc.Stub.ENDPOINT_ADDRESS_PROPERTY,ADMIN_SERVICE_URL);
        ((org.apache.axis.client.Stub)stub).setMaintainSession(true);
        AdminService admin=(AdminService)stub; // apache stub
// need session id to make SOAP calls
        String sessionId = admin.getSession();
        boolean success = admin.addServer(_server, sessionId);
        if (success)
        {
            System.out.println("Added server successfully.");
        }
        else
        {
            System.out.println("Failed to add server.");
        }
    }


    public void addTransfer(Transfer _transfer, String ADMIN_USER_ID, String ADMIN_PASSWORD ,String ADMIN_SERVICE_URL) throws RemoteException, ServiceException
    {
        System.setProperty("org.apache.axis.components.net.SecureSocketFactory","com.proginet.sift.soap.fileTransferService.util.CustomAxisSSLSocketFactory");
        Stub stub = createProxy(ADMIN_USER_ID, ADMIN_PASSWORD);
        stub._setProperty(javax.xml.rpc.Stub.ENDPOINT_ADDRESS_PROPERTY,ADMIN_SERVICE_URL);
        ((org.apache.axis.client.Stub)stub).setMaintainSession(true);
        AdminService admin=(AdminService)stub; // apache stub
// need session id to make SOAP calls
        String sessionId = admin.getSession();
        String transferId = admin.addTransfer(_transfer, sessionId);

        // what is the response of addTransfer...????

        if (transferId.length() == 12)
        {
            System.out.println("Added server successfully.");
        }
        else
        {
            System.out.println("Failed to add server.");
        }
    }

    /**
     * Create stub to communicate with service.
     *
     * @param username username set into stub for authentication
     * @param password user's passowrd set into stub for authentication
     * @return the stub used for communication
     */
    protected static Stub createProxy(String username, String password) throws
            ServiceException
    {
// apache stub
        AdminServiceService adminService = new
                AdminServiceServiceLocator(); //get service location
        AdminService admin =
                adminService.getAdministratorService(); //get stub instance(already cast)
        if (username == null)
        {
            username = "";
        }
        if (password == null)
        {
            password = "";
        }
        ((Stub)admin)._setProperty(javax.xml.rpc.Stub.USERNAME_PROPERTY,
                username); //down cast to load stub
        ((Stub)admin)._setProperty(javax.xml.rpc.Stub.PASSWORD_PROPERTY,
                password); //username and password
        ((Stub)admin)._setProperty(javax.xml.rpc.Stub.SESSION_MAINTAIN_PROPERTY,
                new Boolean(true)); //maintain session
        return (Stub)admin;
    }
}
