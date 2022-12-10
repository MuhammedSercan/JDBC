import java.sql.*;

public class ExecuteQuery02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/techproed", "postgres", "Sercan91$");
        Statement st = con.createStatement();

        //1. Örnek: companies tablosundan en yüksek ikinci number_of_employees değeri olan company ve number_of_employees değerlerini çağırın.

        String sql1 = "SELECT company,number_of_employees FROM companies ORDER BY number_of_employees DESC OFFSET 1 LIMIT 1;";
        ResultSet resultSet1 = st.executeQuery(sql1);

        while (resultSet1.next()){
            System.out.println(resultSet1.getString(1)+" "+resultSet1.getInt(2));
        }





    }
}
