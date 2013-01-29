/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import javax.xml.parsers.*;
import org.w3c.dom.*;

/**
 *
 * @author zsolti
 */
public class UriXMLReader {

    String file_nev;
    String elem_nev;
    ArrayList<String> eredmeny = new ArrayList<>();

    public ArrayList readXML(String file_nev, String elem_nev) throws Exception {

        this.file_nev = file_nev;
        this.elem_nev = elem_nev;


        DocumentBuilderFactory factory =
                DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document doc = builder.parse(new File("/home/zsolti/NetBeansProjects/UriFormUI/src/Uri/" + this.file_nev));

        Element rootElement = doc.getDocumentElement();

        NodeList list = rootElement.getElementsByTagName(this.elem_nev);

        for (int i = 0; i < list.getLength(); i++) {

            String nev = list.item(i).getTextContent();

            eredmeny.add(nev);

        }
        Collections.sort(eredmeny);
        return eredmeny;
    }
}
