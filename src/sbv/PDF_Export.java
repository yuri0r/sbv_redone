/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbv;
import java.util.*;
import java.text.*;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import javax.swing.JFileChooser;

/**
 *
 * @author Philipp Csernalabics
 */

public class PDF_Export {
    static String pdfName;
    static String pathName; 
    static Paragraph haken = new Paragraph("\u2214",FontFactory.getFont(FontFactory.HELVETICA,11));
    
public static void studentClassPDF(String class_ID, Oberflaeche ob){
    String pathName2;
 JFileChooser chooser = new JFileChooser();
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    int returnVal = chooser.showOpenDialog(ob);
      
    File savefile = chooser.getSelectedFile();
    pathName2 = savefile.getPath();
    try{
    Document document = new Document(PageSize.A4); 
    
    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pathName2+"\\"+class_ID+".pdf"));
  
    ArrayList<String> a2 = new ArrayList();
      a2 = Classes.studentIDList(class_ID);
      document.addAuthor(System.getProperty("user.name"));
            document.addCreationDate();
            document.addCreator("Seminarkurs Programm Schulbuchverwaltung");
            document.addTitle("PDF-Export von Klasse "+class_ID);
            document.addSubject("PDF-Export des Schülers "+class_ID);
            
        
    document.open();
            
    for(int i=0; i<(a2.size());i++){
    PdfPTable table =studentPDFTable(a2.get(i),(Students.BookList(a2.get(i)).size())) ;
    Chapter chapter = PdfChapter(a2.get(i));
    document.add(chapter);
    document.add(table);   
    
    }
    document.close();
    writer.close();
    
    
    }catch (FileNotFoundException | DocumentException e) {
    }
} 




   public static void studentPDF(String studentID, Oberflaeche ob){
    
       
    JFileChooser chooser = new JFileChooser();
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    int returnVal = chooser.showOpenDialog(ob);
      
    File savefile = chooser.getSelectedFile();
    pathName = savefile.getPath();
   
    pdfName=Students.SingelStudent(studentID,1)+"-"+Students.SingelStudent(studentID,2)+".pdf";
    try{   
    Document document = new Document(PageSize.A4); 
    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pathName +"\\"+ pdfName));
     // Attributes
            document.addAuthor(System.getProperty("user.name"));
            document.addCreationDate();
            document.addCreator("Seminarkurs Programm Schulbuchverwaltung");
            document.addTitle("PDF-Export Schüler "+Students.SingelStudent(studentID,1)+" "+Students.SingelStudent(studentID,2));
            document.addSubject("PDF-Export des Schülers "+Students.SingelStudent(studentID,1)+" "+Students.SingelStudent(studentID,2));
            
        
            document.open();
         
          Chapter chapter1 = PdfChapter(studentID);
      
        ArrayList<String> bookArray = new ArrayList();
      bookArray = Students.BookList(studentID);
     PdfPTable table = new PdfPTable(5); 
    
    if (((bookArray.size())/4)<29){
           
     table = studentPDFTable(studentID, bookArray.size())  ;   
      
      }else{
         PdfPTable table1 = studentPDFTable(studentID,29*4);//Tabelle mit 5 Spalten erstellen
           
      
      document.add(table1);
      document.newPage();
      
         
      
      table.setSpacingBefore(25);
      
      table.setSpacingAfter(25);
      
      //5 Spalten benennen
      PdfPCell c2 = new PdfPCell(new Phrase("Name",FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD)));
      
      table.addCell(c2);
      
      PdfPCell c3 = new PdfPCell(new Phrase("Gekauft",FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD)));
      
      table.addCell(c3);
      
      PdfPCell c4 = new PdfPCell(new Phrase("Geliehen",FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD)));
      
      table.addCell(c4);
       PdfPCell c6 = new PdfPCell(new Phrase("Ausgegeben am",FontFactory.getFont(FontFactory.HELVETICA, 13, Font.BOLD)));
      
      table.addCell(c6);
      
      PdfPCell c5 = new PdfPCell(new Phrase("Bezahlt",FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD)));
      
      table.addCell(c5);
      
     
    
     String bought;
     String paid;
      
     //Daten in die tabelle laden
      for(int i=29*4; i<(bookArray.size());i++){
       Paragraph titel3 = new Paragraph(bookArray.get(i),FontFactory.getFont(FontFactory.HELVETICA,8, Font.BOLD));   
      table.addCell(titel3);
      i++; 
      bought=bookArray.get(i);
      if (!"1".equals(bought)){
          table.addCell("NEIN");
          table.addCell("JA"); 
      }
      else{
          table.addCell("JA");
          table.addCell("NEIN");
      }
      i++;
      Paragraph titel4 = new Paragraph(Date.ToNormal(bookArray.get(i)),FontFactory.getFont(FontFactory.HELVETICA,11));//just testing date formats
      table.addCell(titel4);
      i++; 
      paid=bookArray.get(i);
      if ("1".equals(paid)){
         table.addCell("JA"); 
      }
      else{
       table.addCell("NEIN");   
      }
    
      }
       
              }      
        document.add(chapter1); //Dokument Füllen
        document.add(table);
             
     document.close();
     writer.close();
           
        
        
    } catch (FileNotFoundException | DocumentException e) {
    }
    
    }
   
   
   
   
   public static void barcodePDF(int bookID, int anz)throws IOException, DocumentException{
    Document document = new Document( new Rectangle(160,100)); 
    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Barcodes\\"+bookID+".pdf"));
    document.open();
    PdfContentByte cb = writer.getDirectContent();
     for(int i=0 ;i<anz ;i++){
        Barcode128 code128 = new Barcode128();
        code128.setGenerateChecksum(true);
        code128.setCodeSet(Barcode128.Barcode128CodeSet.C);
        code128.setCode(String.valueOf((bookID+i)));
        code128.setN(3f);
        code128.setBarHeight(16f);
        Image image =code128.createImageWithBarcode(cb, BaseColor.BLACK, BaseColor.BLACK);
        image.scaleToFit(100,62);
        image.setAbsolutePosition(25, 30);
        document.add(image);
        document.newPage();
     }
        document.close();
        writer.close();
   
   }
   
public static PdfPTable studentPDFTable(String studentID, int maxInd){
          
      ArrayList<String> bookArray = new ArrayList();
      bookArray = Students.BookList(studentID);
    
      
           PdfPTable table = new PdfPTable(5);//Tabelle mit 5 Spalten erstellen
           
      table.setSpacingBefore(25);
      
      table.setSpacingAfter(25);
      
      //5 Spalten benennen
      PdfPCell c2 = new PdfPCell(new Phrase("Name",FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD)));
      
      table.addCell(c2);
      
      PdfPCell c3 = new PdfPCell(new Phrase("Gekauft",FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD)));
      
      table.addCell(c3);
      
      PdfPCell c4 = new PdfPCell(new Phrase("Geliehen",FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD)));
      
      table.addCell(c4);
       PdfPCell c6 = new PdfPCell(new Phrase("Ausgegeben am",FontFactory.getFont(FontFactory.HELVETICA, 13, Font.BOLD)));
      
      table.addCell(c6);
      
      PdfPCell c5 = new PdfPCell(new Phrase("Bezahlt",FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD)));
      
      table.addCell(c5);
      
     
    
     String a;
      
     //Daten in die tabelle laden
      for(int i=0; i<(maxInd);i++){
       Paragraph titel3 = new Paragraph(bookArray.get(i),FontFactory.getFont(FontFactory.HELVETICA,8, Font.BOLD));   
      table.addCell(titel3);
      i++; 
      a=bookArray.get(i);
      if (!"1".equals(a)){
          table.addCell("NEIN");
          table.addCell("JA"); 
      }
      else{
          table.addCell("JA");
          table.addCell("NEIN");
      }
      i++;
      Paragraph titel4 = new Paragraph(Date.ToNormal(bookArray.get(i)),FontFactory.getFont(FontFactory.HELVETICA,11));//just testing date formats
      table.addCell(titel4);
      i++; 
      a=bookArray.get(i);
      if ("1".equals(a)){
         table.addCell("JA"); 
      }
      else{
       table.addCell("NEIN");   
      }
    
      }
      
      return table;
     
    }

   public static Chapter PdfChapter(String studentID){
    
       Paragraph titel1 = new Paragraph("Schüler: "+Students.SingelStudent(studentID,1)+" "+Students.SingelStudent(studentID,2),
             FontFactory.getFont(FontFactory.HELVETICA,16, Font.BOLDITALIC)) ;
         Paragraph titel2 = new Paragraph("Geburtsdatum: "+Students.SingelStudent(studentID,3),
                FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD));
         
         ArrayList<String> a0 = new ArrayList();
         a0=Students.SingelStudentClasses(studentID);
         String classes = "";

        for (String s : Students.SingelStudentClasses(studentID))
        {
        classes += s + ", ";
        }
         Paragraph titel5 = new Paragraph("Klassen: "+classes,
                FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD));
        Chapter chapter1 = new Chapter(titel1, 1);
        chapter1.setNumberDepth(0);
        chapter1.add(titel2);
        chapter1.add(titel5);  
        return chapter1;
   }
      
   
   public static void openPDF() throws IOException{
            Desktop.getDesktop().open(new File(pathName + "/"+ pdfName));
   }
   
   public static java.awt.Image ImageOfBarcode(String bookID){
    Barcode128 code128 = new Barcode128();
        code128.setCodeSet(Barcode128.Barcode128CodeSet.AUTO);
        code128.setCodeType(Barcode128.CODE128_RAW);
        code128.setGenerateChecksum(true);
        code128.setCode(Barcode128.getRawText(bookID, true, Barcode128.Barcode128CodeSet.C));
        java.awt.Image image = code128.createAwtImage(Color.black, Color.white);
    
     
     return image; 
     
   }
   
   
   public static void bestandPDF(Oberflaeche ob){
       
   
    JFileChooser chooser = new JFileChooser();
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    int returnVal = chooser.showOpenDialog(ob);
      
    File savefile = chooser.getSelectedFile();
    pathName = savefile.getPath();
   
    pdfName="Bestand-"+getDateAsString()+".pdf";
    try{   
    Document document = new Document(PageSize.A4); 
    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pathName +"\\"+ pdfName));
     // Attributes
            document.addAuthor(System.getProperty("user.name"));
            document.addCreationDate();
            document.addCreator("Seminarkurs Programm Schulbuchverwaltung");
            document.addTitle("PDF-Export Buch Bestand ");
            document.addSubject("PDF-Export Buch Bestand ");
            
        
            document.open();
         
           Paragraph titel1 = new Paragraph("Bücherbestand vom "+ getDateAndTimeAsString()+" Uhr",FontFactory.getFont(FontFactory.HELVETICA,16, Font.BOLDITALIC));
           Chapter chapter1 = new Chapter(titel1, 1);
        chapter1.setNumberDepth(0);
      
        ArrayList<String> bookIDs = new ArrayList();
      bookIDs = Books.BookIDList();
       PdfPTable table = new PdfPTable(5); 
    //Tabelle mit 5 Spalten erstellen
         
      
      table.setSpacingBefore(25);
      
      table.setSpacingAfter(25);
      
      //5 Spalten benennen
      PdfPCell c2 = new PdfPCell(new Phrase("Buch Name",FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD)));
      
      table.addCell(c2);
     
      PdfPCell c3 = new PdfPCell(new Phrase("Verliehen",FontFactory.getFont(FontFactory.HELVETICA, 15, Font.BOLD)));
      
      table.addCell(c3);
      
      PdfPCell c4 = new PdfPCell(new Phrase("Verkauft",FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD)));
      
      table.addCell(c4);
       PdfPCell c1 = new PdfPCell(new Phrase("Im Lager",FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD)));
      
      table.addCell(c1);
      
      PdfPCell c5 = new PdfPCell(new Phrase("Gesamt",FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD)));
      
      table.addCell(c5);
     
      
     //Daten in die tabelle laden
     for(int i=0; i<(29);i++){
     Paragraph titel = new Paragraph(Books.singleBookName(bookIDs.get(i)),FontFactory.getFont(FontFactory.HELVETICA,8, Font.BOLD));    
     table.addCell(titel);
     table.addCell(Copies.borrowedCopyCount(bookIDs.get(i)));
     table.addCell(Copies.boughtCopyCount(bookIDs.get(i)));
     table.addCell(Copies.copiesInStockBySammy(bookIDs.get(i)));
     table.addCell(Copies.SingleCopyCountTotal(bookIDs.get(i)));
     
     }           
        document.add(chapter1); //Dokument Füllen
        document.add(table);
        document.newPage();
      PdfPTable table1 = new PdfPTable(5); 
    //Tabelle mit 5 Spalten erstellen
         
      
      table1.setSpacingBefore(25);
      
      table1.setSpacingAfter(25);
      
      //5 Spalten benennen
      
      table1.addCell(c2);
      
      
      table1.addCell(c3);
      
      
      table1.addCell(c4);
      
      table1.addCell(c1);
      
      
      table1.addCell(c5);
     
     for(int i=29; i<(29+30);i++){
     Paragraph titel = new Paragraph(Books.singleBookName(bookIDs.get(i)),FontFactory.getFont(FontFactory.HELVETICA,8, Font.BOLD));    
     table1.addCell(titel);
     table1.addCell(Copies.borrowedCopyCount(bookIDs.get(i)));
     table1.addCell(Copies.boughtCopyCount(bookIDs.get(i)));
     table1.addCell(Copies.copiesInStockBySammy(bookIDs.get(i)));
     table1.addCell(Copies.SingleCopyCountTotal(bookIDs.get(i)));
    
      }   
     
     document.add(table1); 
     document.newPage();
     PdfPTable table2 = new PdfPTable(5); 
    //Tabelle mit 5 Spalten erstellen
         
      
      table2.setSpacingBefore(25);
      
      table2.setSpacingAfter(25);
      
      //5 Spalten benennen
      
      table2.addCell(c2);
      
      
      table2.addCell(c3);
      
      
      table2.addCell(c4);
      
      table2.addCell(c1);
      
      
      table2.addCell(c5);
     
     for(int i=59; i<(bookIDs.size());i++){
     Paragraph titel = new Paragraph(Books.singleBookName(bookIDs.get(i)),FontFactory.getFont(FontFactory.HELVETICA,8, Font.BOLD));    
     table2.addCell(titel);
     table2.addCell(Copies.borrowedCopyCount(bookIDs.get(i)));
     table2.addCell(Copies.boughtCopyCount(bookIDs.get(i)));
     table2.addCell(Copies.copiesInStockBySammy(bookIDs.get(i)));
     table2.addCell(Copies.SingleCopyCountTotal(bookIDs.get(i)));
    
      }   
     
     document.add(table2);
     document.close();
     writer.close();
           
    }catch (FileNotFoundException | DocumentException e) {
    }
           
       
   }
   
   
   public static String getDateAsString() {
   SimpleDateFormat datum = new SimpleDateFormat("dd-MM-yyyy");
   Timestamp zeit = new Timestamp(System.currentTimeMillis());
   String time = datum.format(zeit);
   return time;
   }
   
   public static String getDateAndTimeAsString() {
   SimpleDateFormat datum = new SimpleDateFormat("dd.MM.yyyy hh:mm");
   Timestamp zeit = new Timestamp(System.currentTimeMillis());
   String time = datum.format(zeit);
   return time;
   }
   
public static void studentBill(String studentID, Oberflaeche ob){
    
       
    JFileChooser chooser = new JFileChooser();
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    int returnVal = chooser.showOpenDialog(ob);
      
    File savefile = chooser.getSelectedFile();
    pathName = savefile.getPath();
   
    pdfName=Students.SingelStudent(studentID,1)+"-"+Students.SingelStudent(studentID,2)+"-Rechnung.pdf";
    try{   
    Document document = new Document(PageSize.A4); 
    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pathName +"\\"+ pdfName));
     // Attributes
            document.addAuthor(System.getProperty("user.name"));
            document.addCreationDate();
            document.addCreator("Seminarkurs Programm Schulbuchverwaltung");
            document.addTitle("PDF-Export Schüler "+Students.SingelStudent(studentID,1)+" "+Students.SingelStudent(studentID,2));
            document.addSubject("PDF-Export des Schülers "+Students.SingelStudent(studentID,1)+" "+Students.SingelStudent(studentID,2));
            
        
            document.open();
         
          Chapter chapter1 = PdfChapter(studentID);
      
        ArrayList<String> bookArray = new ArrayList();
      bookArray = Copies.copyBill(studentID);
     PdfPTable table = new PdfPTable(2); 
       
     table.setSpacingBefore(25);
      
      table.setSpacingAfter(25);
      
    
     
     PdfPCell name = new PdfPCell(new Phrase("Buch Name",FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD)));
      
      table.addCell(name);
     
      PdfPCell price = new PdfPCell(new Phrase("Preis",FontFactory.getFont(FontFactory.HELVETICA, 15, Font.BOLD)));
      
      table.addCell(price);
      
      for(int i=0; i<(bookArray.size());i++){
       
       if(i==bookArray.size()-2){ 
       Paragraph ges = new Paragraph(bookArray.get(i),FontFactory.getFont(FontFactory.HELVETICA,15, Font.BOLD));    
       table.addCell(ges);
       i++;
       table.addCell(bookArray.get(i));
       }else{
       //Paragraph titel = new Paragraph(bookArray.get(i),FontFactory.getFont(FontFactory.HELVETICA,8, Font.BOLD));    
       table.addCell(bookArray.get(i));
       i++;
       table.addCell(bookArray.get(i));
       
       }
      }
    
         
        document.add(chapter1); //Dokument Füllen
        document.add(table);
             
     document.close();
     writer.close();
           
        
        
    } catch (FileNotFoundException | DocumentException e) {
    }
}

    
    public static PdfPTable billTable(String studentID){
            ArrayList<String> bookArray = new ArrayList();
      bookArray = Copies.copyBill(studentID);
     PdfPTable table = new PdfPTable(2); 
       
     table.setSpacingBefore(25);
      
      table.setSpacingAfter(25);
      
    
     
     PdfPCell name = new PdfPCell(new Phrase("Buch Name",FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD)));
      
      table.addCell(name);
     
      PdfPCell price = new PdfPCell(new Phrase("Preis",FontFactory.getFont(FontFactory.HELVETICA, 15, Font.BOLD)));
      
      table.addCell(price);
      
      for(int i=0; i<(bookArray.size());i++){
       
       if(i==bookArray.size()-2){ 
       Paragraph ges = new Paragraph(bookArray.get(i),FontFactory.getFont(FontFactory.HELVETICA,15, Font.BOLD));    
       table.addCell(ges);
       i++;
       table.addCell(bookArray.get(i));
       }else{
       //Paragraph titel = new Paragraph(bookArray.get(i),FontFactory.getFont(FontFactory.HELVETICA,8, Font.BOLD));    
       table.addCell(bookArray.get(i));
       i++;
       table.addCell(bookArray.get(i));
       
       }
        
    }
      return table;
    }  
    public static void classBill(String class_ID, Oberflaeche ob){
    String pathName2;
 JFileChooser chooser = new JFileChooser();
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    int returnVal = chooser.showOpenDialog(ob);
      
    File savefile = chooser.getSelectedFile();
    pathName2 = savefile.getPath();
    try{
    Document document = new Document(PageSize.A4); 
    
    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pathName2+"\\"+class_ID+"-Rechnung.pdf"));
  
    ArrayList<String> studentArray = new ArrayList();
      studentArray = Classes.studentIDList(class_ID);
      document.addAuthor(System.getProperty("user.name"));
            document.addCreationDate();
            document.addCreator("Seminarkurs Programm Schulbuchverwaltung");
            document.addTitle("PDF-Export von Klasse "+class_ID);
            document.addSubject("PDF-Export des Schülers "+class_ID);
            
        
    document.open();
            
    for(int i=0; i<(studentArray.size());i++){
    PdfPTable table =billTable(studentArray.get(i)) ;
    Chapter chapter = PdfChapter(studentArray.get(i));
    document.add(chapter);
    document.add(table);   
    
    }
    document.close();
    writer.close();
    
    
    }catch (FileNotFoundException | DocumentException e) {
    }
} 
    
    
   
   
   
   
}

