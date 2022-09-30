package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    Connection con;
    private String url="jdbc:mysql://localhost:3306/parkiadito";
    String user="root";
    String pass="";
    public Connection Conectar(){       //EntidadUsuario eu=new EntidadUsuario();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            
            con=DriverManager.getConnection(url,user,pass);
            //JOptionPane.showMessageDialog(null,"Conexion exitosa "+eu.getDni()+" "+eu.getId(), "Conexión", JOptionPane.INFORMATION_MESSAGE);
        /*} catch (ClassNotFoundException | SQLException  e) {
            JOptionPane.showMessageDialog(null,"Sin conexion "+e, "Conexión", JOptionPane.ERROR_MESSAGE);
        */
        } catch (Exception e){
          
        }
      return con; 
    }
}
