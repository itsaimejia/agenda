/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.crud;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author itsai
 */
public class Conexion {
    
    private static Connection con; 
    private static final String driver= "com.mysql.jdbc.Driver";
    private static final String user= "root";
    private static final String password= "";
    private static final String url= "jdbc:mysql://localhost:8080/agenda";

    public Conexion() {
        con=null;
        try{
            Class.forName(driver);
            con=(Connection) DriverManager.getConnection(url, user, password);
        }catch(Exception ex){
            
        }
    }
    
    public Connection getConnection(){
        return con;
    }
    
    
    
}
