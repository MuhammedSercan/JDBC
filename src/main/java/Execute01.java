import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
  Class.forName("org.postgresql.Driver");

  Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/techproed","postgres","Sercan91$");

  Statement st = con.createStatement();

  /*
    execute() methodu DDL(create, drop, alter table) ve DQL(select) için kullanılabilir.
    1) Eğer execute() methodu DDL için kullanılırsa 'false' return yapar.
    2) Eğer execute() methodu DQL için kullanılırsa ResultSet alındığında 'true' aksi hale 'false' verir.
 */

  //1.Örnek: "workers" adında bir table oluşturup "worker_id,worker_name, worker_salary" sütunlarını ekleyin.
  boolean sql1 = st.execute("CREATE TABLE workers(worker_id VARCHAR(20),worker_name VARCHAR(20), worker_salary INT );");
        System.out.println("sql1=" + sql1);

        //2.Örnek: Table'a worker_address sütunu ekleyerek alter yapın.


    }
}
