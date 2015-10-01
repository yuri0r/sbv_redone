package sbv;

public class Sbv {

    public static void main(String[] args) throws Exception {


        //Oberflaeche.main(args);
            
    //Leave these methods where they are for testing purposes//////////////
    //UpdateDb.UpdateAll();
    //Query.Console();
    Oberflaeche ob = new Oberflaeche();
    //PDF_Export.bestandPDF(ob);
    PDF_Export.studentBill("216", ob);    
    Copies.copyBill("216");
        //UpdateDb.updateDPrice();
        //UpdateDb.massAddClasses(328, 350, 14);
        //Students.newStudent("max", "mustermann", "1999-10-05");
   /*System.out.println(Copies.SingleCopyCountTotal("1"));
      System.out.println(Copies.boughtCopyCount("1"));
         System.out.println(Copies.borrowedCopyCount("1"));
            System.out.println(Copies.CopiesInStock("1"));*/
            }
}