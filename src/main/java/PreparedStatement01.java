import java.sql.*;

public class PreparedStatement01 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/techproed", "postgres", "Sercan91$");
        Statement st = con.createStatement();

        /*
        PreparedStatement01 interface , birden çok kez çalıştırılabilen, önceden derlenmiş bir SQL kodunu temsil eder.
        Parametrelendirilmiş SQL sorguları(query) ile çalışır.
        Bu sorguya 0 veya daha fazla parametre ile kullanabiliriz
         */

        //1. Örnek: Prepared statement kullanarak company adı IBM olan number_of_employees değerini 9999 olarak güncelleyin.
        //1. Adım: PreparedStatement query'sini oluştur.
        String sql1 = "UPDATE companies SET number_of_employees = ? WHERE company = ? ";

        //2. Adım: PreparedStatement objesini oluştur.
        PreparedStatement pst1 = con.prepareStatement(sql1);

        //3. Adım: setInt(), setString(), ... methodlarını kullanarak soru işaretleri yerlerine değer gir.
        pst1.setInt(1, 9999);
        pst1.setString(2, "IBM");

        //4. Adım: Query'yi çalıştır.

        int guncellenenSatirSayisi = pst1.executeUpdate();
        System.out.println("guncellenenSatirSayisi = " + guncellenenSatirSayisi);










    }

}
