package co.edu.udea.json;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class App 
{
    public static int IDENT_FACTOR = 4;
    public static String XML_STRING =
        "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            " <flights>\n"                             +
            " <flight>\n"                              +
            " <from>Barranquilla</from>\n"             +
            " <to>Medellin</to>\n"                     +
            " <fare>$175.000j</fare>\n"                +
            " <aircraft>Boeing 777</aircraft>\n"       +
            " </flight>\n"                             +
            " <flight>\n"                              +
            " <from>Bogota</from>\n"                   +
            " <to>Cartagena</to>\n"                    +
            " <fare>$198.000j</fare>\n"                +
            " <aircraft>Boeing 747</aircraft>\n"       +
            " </flight>\n"                             +
            " <flight>\n"                              +
            " <from>Medellin</from>\n"                 +
            " <to>Bogota</to>\n"                       +
            " <fare>$150.000j</fare>\n"                +
            " <aircraft>Airbus</aircraft>\n"           +
            " </flight>\n"                             +
            " </flights>";

    public static void main(String[] args) {
        try {
            JSONObject jsonFromXML = XML.toJSONObject(XML_STRING);
            String jsonOut = jsonFromXML.toString(IDENT_FACTOR);
            System.out.print(jsonOut);
        } catch (JSONException e) {
            System.out.print(e.toString());
        }
    }
}
