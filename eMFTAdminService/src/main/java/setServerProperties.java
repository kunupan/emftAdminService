import java.io.FileReader;
//import java.util.Iterator;
//import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import AdminClient.Server;


/**
 * Created by PansariK on 21/08/2017.
 */
public class setServerProperties {

    Server setServerProperties(String fileLocation) {

        JSONParser parser = new JSONParser();
        Server newServer = new Server();

        try {
            Object obj = parser.parse(new FileReader(fileLocation));
            JSONObject jsonObject = (JSONObject) obj;

            String ftpCaseSensitive = (String) jsonObject.get("FTPCaseSensitive");
            newServer.setFTPCaseSensitive(ftpCaseSensitive);


        }

        catch (Exception e) {
            e.printStackTrace();
        }

        return newServer;

    }
}