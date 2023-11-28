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


        String query = "select * from STAFFS;";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            System.out.println("crewID: " + rs.getInt("crewID") + " firstName: " + rs.getString("firstName") +
                    " lastName: " + rs.getString("lastName") + " stafftype: " + rs.getString("stafftype"));
        }
        st.close();
        con.close();
    }
}
