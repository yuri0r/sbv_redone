package sbv;

import java.util.ArrayList;

public class Sbv {

    public static void main(String[] args) throws Exception {
    ArrayList<String> result = new ArrayList();
    DbConnector.getConnection(); //tests Connection
    
    
    String statement = "SELECT ID, label, isbn FROM sbm_books LIMIT 0,30";
    String[] collums =TestQuery.TableNames(statement);
    result = TestQuery.anyQuery(statement);//does kind of random Query
    TestQuery.output(result,collums);
    }
    
}
