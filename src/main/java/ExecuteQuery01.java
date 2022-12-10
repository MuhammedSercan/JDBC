import java.sql.*;

public class ExecuteQuery01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1.adım drivere e kaydol
        Class.forName("org.postgresql.Driver");
        //2.adım database e bağlan
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/techproed","postgres","Sercan91$");
        //3.adım statement oluştur
        Statement st = con.createStatement();

        //region id 1 olan "country name"değerlerini çağırın

        String sql1 = "SELECT country_name FROM countries WHERE region_id = 1;";
        boolean r1 = st. execute(sql1);
        System.out.println("r1 = " + r1);
        System.out.println();
        //Recordları görmek için ExecuteQuery() methodunu kullanmalıyız.
        ResultSet resultSet1 = st.executeQuery(sql1);

        while (resultSet1.next()){
            System.out.println(resultSet1.getString(1));
        }
        System.out.println();
        //region id 2 den büyük olduğu countr_id ve country_name değerlerini çağırınız
        String sql2 = "SELECT country_name, country_id FROM countries WHERE region_id>2;";
        ResultSet resultSet2 = st.executeQuery(sql2);

        while ( resultSet2.next()){
            System.out.println(resultSet2.getString("country_name") + " " + resultSet2.getString("country_id"));
        }


        //Bağlantıyı kapat.
        con.close();
        st.close();

    }
}


