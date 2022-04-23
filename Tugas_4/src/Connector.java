import java.sql.*;
import java.util.ArrayList;


public class Connector {
    String DBUrl = "jdbc:mysql://localhost:3306/tugasjdbc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String DBUsername = "root";
    String DBPassword = "";
    Connection koneksi;
    Statement statement;
    public Connector() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        koneksi = DriverManager.getConnection(DBUrl,DBUsername,DBPassword);
        statement = koneksi.createStatement();
    }

    public void insert(ArrayList<String> data) throws SQLException{
        statement.executeUpdate("INSERT INTO `user` (`username`, `password`) VALUES ('"+ data.get(0) +"', '"+ data.get(1) +"')");
    }

    public ResultSet search(ArrayList<String> data) throws SQLException{
        return statement.executeQuery("SELECT * FROM `user` WHERE `username` = '"+ data.get(0) +"' AND `password` = '"+ data.get(1) +"' ");
    }
}
