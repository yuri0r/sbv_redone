/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbv;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;

/**
 *
 * @author Philipp Csernalabics
 */
public class PDF_Export {
       public static void jPanelPdfExport(Component panel) {
        try {
           
            Document doc = new Document(PageSize.A4.rotate()); // mach das rotate() weg für Hochkant
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("Beispiel_PDF.pdf"));
           
            // Attributes
            doc.addAuthor(System.getProperty("user.name"));
            doc.addCreationDate();
            doc.addCreator("Seminarkurs Programm");
            doc.addTitle("Beispiel, PDF-Export");
            doc.addSubject("Dies soll ein Beispiel eines PDF-Exports sein.");
           
            doc.open();
           
            java.awt.Image image = getImageFromPanel(panel);
            Image iTextImage = Image.getInstance(writer, image, 1);
            iTextImage.setAlignment(Image.MIDDLE); // funktioniert nicht...
            iTextImage.scaleToFit(PageSize.A4.rotate().getWidth()-100, PageSize.A4.rotate().getHeight()-100);
           
            doc.add(iTextImage);
           
            doc.close();
            writer.close();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    /* TAKEN FROM: http://stackoverflow.com/questions/25579480/how-to-export-jpanel-with-scrollable-into-pdf-file */
    public static java.awt.Image getImageFromPanel(Component component) {
       
        BufferedImage image = new BufferedImage(component.getWidth(),
            component.getHeight(), BufferedImage.TYPE_INT_RGB);
        component.paint(image.getGraphics());
        return image;
    } 
}
