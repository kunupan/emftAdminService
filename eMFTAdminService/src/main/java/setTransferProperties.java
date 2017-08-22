import java.io.FileReader;
//import java.util.Iterator;
//import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import AdminClient.Transfer;

/**
 * Created by PansariK on 21/08/2017.
 */
public class setTransferProperties {

    Transfer setTransferProperties(String fileLocation) {

        JSONParser parser = new JSONParser();
        Transfer newTransfer = new Transfer();

        try {
            Object obj = parser.parse(new FileReader(fileLocation));
            JSONObject jsonObject = (JSONObject) obj;

            String crlf = (String) jsonObject.get("CRLF");
            newTransfer.setCRLF(crlf);


        }

        catch (Exception e) {
            e.printStackTrace();
        }

        return newTransfer;

    }
}