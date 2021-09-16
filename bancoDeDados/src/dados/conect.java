
package dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conect {
    
    public Connection conn;
    public PreparedStatement st;
    public ResultSet rs;
    
    private final String URL    = "jdbc:mysql://localhost:3306/teste?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=felse&serverTimezone=UTC";
    private final String USER   = "root";
    private final String PASS   = "";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    public boolean conectar(){
        try{
            Class.forName(DRIVER);
            conn=DriverManager.getConnection(URL,USER,PASS);
            return true;
        }catch(ClassNotFoundException | SQLException ex){
            return false;
        }
    }
}