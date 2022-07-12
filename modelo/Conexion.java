/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author juanc
 */
public class Conexion 
{
  Connection connection;  
  public Conexion()
  {
      try 
      {
       Class.forName("com.mysql.cj.jdbc.Driver");
       //get conection (cadena coneccion , usuario , contraseña)
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/retomintic","root","");
       if(connection != null)
       {
           System.out.println("Conexion existosa");
       }
      }
      catch ( ClassNotFoundException | SQLException e)
      {
          System.out.println("Conexion fallida");
      }
      
  }
  public Connection getConnection()
  {
      return connection;
  }

  
}
