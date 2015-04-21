package sbv;

public class Sbv {

    public static void main(String[] args){
        try{
            Oberflaeche.main(args);

            //Leave these methods where they are for testing purposes//////////////
            //UpdateDb.UpdateAll();
            //UpdateDb.createTables();
            //Query.Console();
        }catch(Exception e){System.out.println(e);}
    }    
}
