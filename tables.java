/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;

public class tables {
    public static void main(String args[])
    {
        Connection con=null;
        Statement st=null;
        try{
           con=connprovider.getCon();
           st=con.createStatement();
           st.executeUpdate("create table users(name varchar(200),email varchar(200),password varchar(50),securityQuestion varchar(500) ,answer varchar(200),status varchar(20))");
           st.executeUpdate("create table visitors(id int(5),name varchar(50),mobileNumber varchar(10),address varchar(500),gender varchar(8) ,email varchar(50),dept varchar(50),pvisit varchar(200),idtype varchar(50),idnumber varchar(20),checkin varchar(50),personvisit int,checkout varchar(50))");
           JOptionPane.showMessageDialog(null,"Table created successfully");
    }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        finally{
            try{
                con.close();
                st.close();
                
            }
            catch(Exception e){
                
            }
        }
        }
}
