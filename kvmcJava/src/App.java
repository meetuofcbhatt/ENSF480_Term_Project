import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/kvmcairlines"; //url for connection; kvmcairlines is the database
        String uname = "root";
        String pass = "Mmysql#123";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();


        String query = "select * from FLIGHTS;";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            System.out.println("crewID: " + rs.getString("date_leaves"));
        }
        st.close();
        con.close();
    }
}
