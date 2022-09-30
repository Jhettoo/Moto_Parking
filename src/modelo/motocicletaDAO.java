
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class motocicletaDAO implements CRUD {
    int r;
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion acceso = new Conexion();
    motocicleta moto = new motocicleta();
    
    
    public motocicleta listarID(String placa){
        motocicleta m=new motocicleta();
        String sql="select * from motocicleta where placa_moto=?";
        try {
            con=acceso.Conectar();
            ps=con.prepareStatement(sql);
             ps.setString(1, placa);
            rs=ps.executeQuery();
            while (rs.next()) {
                m.setId_motocicleta(rs.getInt(1));
                m.setPlaca_moto(rs.getString(2));
                m.setMarca_moto(rs.getString(3));
                m.setRef_moto(rs.getString(4));
                m.setCilindrada_moto(rs.getInt(5));
                m.setColor_moto(rs.getString(6));
                m.setObservaciones_moto(rs.getString(7));
                m.setEstado_moto(rs.getString(8));
            }
        } catch (Exception e) {
        }return m;
    }

    @Override
    public List listar() {
        List<motocicleta> listamoto = new ArrayList();
        String sql="select * from motocicleta";
        try {
            con=acceso.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                motocicleta m =new motocicleta();
                m.setId_motocicleta(rs.getInt(1));
                m.setPlaca_moto(rs.getString(2));
                m.setMarca_moto(rs.getString(3));
                m.setRef_moto(rs.getString(4));
                m.setCilindrada_moto(rs.getInt(5));
                m.setColor_moto(rs.getString(6));
                m.setObservaciones_moto(rs.getString(7));
                m.setEstado_moto(rs.getString(8));
                listamoto.add(m);
            }
        } catch (Exception e) {
        }return listamoto;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into motocicleta(placa_moto,marca_moto,ref_moto,cilindrada_moto,color_moto,observaciones_moto,estado_moto)values(?,?,?,?,?,?,?)"; 
        try {
            con=acceso.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            r=ps.executeUpdate();
        } catch (Exception e) {e.printStackTrace();
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
         int r=0;
        String sql="update motocicleta set placa_moto=?,marca_moto=?,ref_moto=?,cilindrada_moto=?,color_moto=?,observaciones_moto=?,estado_moto=? where IdCliente=?";
        try {
            con=acceso.Conectar();
            ps=con.prepareCall(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            ps.setObject(8, o[7]);
            r=ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
        }

    @Override
    public void eliminar(int id) {
        String sql="delete from motocicleta where id_motocicleta=?";
        try {
            con=acceso.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }


    
  
    
}
