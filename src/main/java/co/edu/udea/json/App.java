package co.edu.udea.json;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class App 
{
    public static int IDENT_FACTOR = 4;
    public static String XML_STRING =
        "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"            +
            " <menu_desayuno>\n"                                  +
            " <opcion>\n"                                         +
            " <nombre>PanCakes</nombre>\n"                        +
            " <valor>$2.95</valor>\n"                             +
            " <descripcion>\n"                                    +
            " Lithuanian Pancake Recipe - Blynai or Sklindziai\n" +
            " </descripcion>\n"                                   +
            " <kcal>500</kcal>\n"                                 +
            " </opcion>\n"                                        +
            " <opcion>\n"                                         +
            " <nombre>Belgian Waffles</nombre>\n"                 +
            " <valor>$5.95</valor>\n"                             +
            " <descripcion>\n"                                    +
            " Two of our famous Belgian Waffles with plenty of"   + 
            " real maple syrup\n"                                 +
            " </descripcion>\n"                                   +
            " <kcal>650</kcal>\n"                                 +
            " </opcion>\n"                                        +
            " <opcion>\n"                                         +
            " <nombre>Strawberry Belgian Waffles</nombre>\n"      +
            " <valor>$7.95</valor>\n"                             +
            " <descripcion>\n"                                    +
            " Light Belgian waffles covered with strawberries"    +
            " and whipped cream\n"                                +
            " </descripcion>\n"                                   +
            " <kcal>900</kcal>\n"                                 +
            " </opcion>\n"                                        +
            " </menu_desayuno>";

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
