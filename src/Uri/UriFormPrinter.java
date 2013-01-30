/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri;

import java.awt.*;
import javax.swing.*;
import java.awt.print.*;

/**
 *
 * @author zsolti
 */
public class UriFormPrinter implements Printable {
    
    String nyomtatando;
           public void print(String nyomtatando) {
               this.nyomtatando = nyomtatando;
                PrinterJob printJob = PrinterJob.getPrinterJob();
                printJob.setPrintable(this);
                if (printJob.printDialog()){
                        try {
                                        //System.out.println("Calling PrintJob.print()");
                                        printJob.print();
                                        //System.out.println("End PrintJob.print()");
                        }
                        catch (PrinterException pe) {
                                System.out.println("Error printing: " + pe);
                        }
                }
        }

    @Override
    public int print(Graphics g, PageFormat pf, int page)
    throws PrinterException {
    if (page > 0) {
        return NO_SUCH_PAGE;
    }

    Graphics2D g2d = (Graphics2D)g;
    g2d.translate(pf.getImageableX(), pf.getImageableY());

    // Print the entire visible contents of a
    // java.awt.Frame.
    

    return PAGE_EXISTS;
}
    }
    

