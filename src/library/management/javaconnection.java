package library.management;


import java.sql.*;  

public class javaconnection{
    Connection c;
    Statement s;
    public javaconnection(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///librarymanagement","root","");    
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  

