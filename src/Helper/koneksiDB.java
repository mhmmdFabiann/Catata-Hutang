/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victus 16
 */
public class koneksiDB {
    static Connection con;
    
    public static Connection getConnection(){
        if(con == null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("hutang_piutang");
            data.setUser("root");
            data.setPassword("");
            
            try{
                con = data.getConnection();
                System.out.println("Connection Success!!");
            }catch(SQLException e)
            {
                System.out.println("Not Connected");
            }
        }
        return con;
    }
   
}