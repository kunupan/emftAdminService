import java.io.FileReader;
//import java.util.Iterator;
//import org.json.simple.JSONArray;
import AdminClient.DateTime;
import com.sun.org.apache.xpath.internal.operations.String;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import AdminClient.User;

/**
 * Created by PansariK on 21/08/2017.
 */
public class setUserProperties {

    User setUserProperties(String fileLocation) {

        JSONParser parser = new JSONParser();
        User newUser = new User();

        try {
            Object obj = parser.parse(new FileReader(fileLocation));
            JSONObject jsonObject = (JSONObject) obj;

            //User newUser = new User();
            Boolean AMUser = (Boolean) jsonObject.get("AMUser");
            Boolean LDAPDerivedUser = (Boolean) jsonObject.get("LDAPDerivedUser");
            String PGPAllowUserAddKey = (String) jsonObject.get("PGPAllowUserAddKey");
            Boolean activeUserType = (Boolean) jsonObject.get("activeUserType");
            String allowableProtocol = (String) jsonObject.get("allowableProtocol");
            String createdBy = (String) jsonObject.get("createdBy");

            String createdBy1 = (String) jsonObject.get("dateCreated");


            DateTime dateCreated = new DateTime(); // Dec 31, 2011
              dateCreated.setYear(2011);
              dateCreated.setMonth(11); // months are 0 thru 11
              dateCreated.setDay(31);



            newUser.setDateCreated(dateCreated);
            newUser.setAMUser(AMUser);
            Boolean amUser = (Boolean) jsonObject.get("AMUser");
            newUser.setAMUser(amUser);



            String name = (String) jsonObject.get("Name");
            String author = (String) jsonObject.get("Author");
            JSONArray companyList = (JSONArray) jsonObject.get("Company List");

//                newUser.setId("test01");
//                newUser.setFullName("Test User 1");
//                newUser.setPassword("test1234");
//                DateTime expireDate = new DateTime(); // Dec 31, 2011
//                expireDate.setYear(2011);
//                expireDate.setMonth(11); // months are 0 thru 11
//                expireDate.setDay(31);
//                newUser.setExpirationDate(expireDate);
//                try {
//                    adminClient.addUser(newUser);
//                } catch (Exception e) {
//                    System.out.println("Error adding user, " + e.getMessage());
//                }


        }

        catch (Exception e) {
            e.printStackTrace();
        }

        return newUser;

    }
}
