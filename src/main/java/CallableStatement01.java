import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CallableStatement01 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/techproed", "postgres", "Sercan91$");
        Statement st = con.createStatement();

        /*
        Javada methodlar return type sahibi olsa da olmasa da method olarak adlandırılır.
        SQL ' de ise data return ediyorsa "function" denir. Return yapmıyorsa, "procedure" olarak adlandırılır
         */

        // CallableStatement ile function çağırmayı parametrelendireceğiz.









    }
}
