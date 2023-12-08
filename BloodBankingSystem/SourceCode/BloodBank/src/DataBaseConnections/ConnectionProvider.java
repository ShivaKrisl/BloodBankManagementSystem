/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBaseConnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SHIVA KRISHNA
 */
public class ConnectionProvider {
    public static Connection getCon() throws ClassNotFoundException
    {
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbanksystem","root","shiva@05082003");
            return con;
        }
        catch (SQLException e) {
            System.out.print(e);
            return null;
        }
    }
}
