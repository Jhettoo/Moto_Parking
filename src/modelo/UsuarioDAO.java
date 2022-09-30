
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    PreparedStatement ps;
    ResultSet rs;
    
    Conexion con=new Conexion();
    Connection acceso;
    
    public EntidadUsuario  ValidarUsuario(String cc_usuario, String nom_usuario){
        EntidadUsuario  eu=new EntidadUsuario();
        String sql="SELECT * FROM usuario  WHERE cc_usuario=? AND nom_usuario=?";
        try{
            acceso=con.Conectar();
            ps=acceso.prepareStatement(sql);
            ps.setString(1, cc_usuario);
            ps.setString(2, nom_usuario);
            rs=ps.executeQuery();
            while (rs.next()){
                eu.setId(rs.getInt(1));
                eu.setDni(rs.getString(2));
                eu.setNom(rs.getString(3));
                eu.setTel(rs.getString(4)); 
                eu.setTipo(rs.getString(5));
                eu.setPass(rs.getString(6));
                eu.setEst(rs.getString(7));
           }
        } catch (SQLException e) {
            //e.printStackTrace();
        }
        return eu;
    }
}
