/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Pc
 */
public class Connector {
   public static Connection connector(){
       Connection con = null;
try {        
    Class.forName("com.mysql.cj.jdbc.Driver");
    //con = DriverManager.getConnection("jdbc:apache:commons:dbcp:fithness_center");
    
    con= DriverManager.getConnection("jdbc:mysql://localhost:3306/fithness_center?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
    //jdbc:mysql://localhost:3306/fithness_center?zeroDateTimeBehavior=CONVERT_TO_NULL
    if(con!=null){
            System.out.println("connection reussie");
            return con;
    } 
    }catch(Exception e){
            System.out.println("echec de connection");
            e.printStackTrace();
    JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
    }
    return null;
   }
   
    
}
