/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;

public class select {
    public static ResultSet getData(String Query){
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        try{
            con=connprovider.getCon();
            st=con.createStatement();
            rs=st.executeQuery(Query);
            return rs;
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
}
