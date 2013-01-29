/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author zsolti
 */
public class UriForm {
    
    public static void main(String[] args) throws Exception{
    
        ArrayList<String> al_megrendelo = new ArrayList<>();
        ArrayList<String> al_szelesseg = new ArrayList<>();
        ArrayList<String> al_vastagsag = new ArrayList<>();
        ArrayList<String> al_anyag = new ArrayList<>();
        ArrayList<String> al_szin = new ArrayList<>();
        String[] szin = {"Natur","Fehér","Sárga","Narancs","Piros","Kék","Zöld","Bordó","Barna","Lila","Fekete","Arany","Ezüst"};
        
        UriFormUI extruderista = new UriFormUI();
        

        
        UriXMLReader reader_anyag = new UriXMLReader();
        al_anyag = reader_anyag.readXML("anyagok.xml", "anyag");
        UriXMLReader reader_megrendelo = new UriXMLReader();
        al_megrendelo = reader_megrendelo.readXML("megrendelok.xml", "megrendelo");
        UriXMLReader reader_szelesseg = new UriXMLReader();
        al_szelesseg = reader_szelesseg.readXML("meretek.xml", "meret");
        UriXMLReader reader_vastagsag = new UriXMLReader();
        al_vastagsag = reader_vastagsag.readXML("vastagsag.xml", "mikron");
         
        DefaultComboBoxModel model_megrendelo = new DefaultComboBoxModel(al_megrendelo.toArray());
        DefaultComboBoxModel model_szelesseg = new DefaultComboBoxModel(al_szelesseg.toArray());
        DefaultComboBoxModel model_vastagsag = new DefaultComboBoxModel(al_vastagsag.toArray());
        DefaultComboBoxModel model_anyag = new DefaultComboBoxModel(al_anyag.toArray());
        DefaultComboBoxModel model_szin = new DefaultComboBoxModel(szin);
        
        extruderista.jComboBoxMegrendelo.setModel(model_megrendelo);
        extruderista.jComboBoxSzelesseg.setModel(model_szelesseg);
        extruderista.jComboBoxVastagsag.setModel(model_vastagsag);
        extruderista.jComboBoxAnyag.setModel(model_anyag);
        extruderista.jComboBoxSzin.setModel(model_szin);
        
        
        
        extruderista.setVisible(true);
    }
    
}
