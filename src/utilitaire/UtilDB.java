package utilitaire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;							
import java.sql.Statement;

public class UtilDB {
    /* Attributs */
    private static final String connURL="jdbc:postgresql://localhost:5432/polyomino";
    private static final String username="postgres";
    private static final String password="wawa";
    
    /* Fonctions */
    public static Connection getConnection()
    {
        Connection conn= null;
        try {
            Class.forName("org.postgresql.Driver");
            conn=DriverManager.getConnection(connURL,username,password);
        }
        catch(ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return conn;
    }
    
    public static int getNextId(String nomTable) {
        String nomSequence = nomTable + "_id" + nomTable + "_seq";
        String seq = "select nextval('" + nomSequence + "') as val";
        int ret=0;
        try{
            Connection conn = getConnection();
            Statement s = conn.createStatement();
            ResultSet sequence = s.executeQuery(seq);
            sequence.next();
            ret = sequence.getInt("val");
            s.close();
            conn.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return ret;
    }
}