package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements CRUD{
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    
    public Cliente listarID(String dni){
        Cliente c=new Cliente();
        String sql="select * from cliente where cc_cliente=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, dni);
            rs=ps.executeQuery();
            while (rs.next()) {
                c.setIdCliente(rs.getInt(1));
                c.setCc_Cliente(rs.getString(2));
                c.setNom_cliente(rs.getString(3));
                c.setCel_cliente(rs.getString(4));
                c.setEmail_cliente(rs.getString(5));
                c.setDir_cliente(rs.getString(6));
                c.setEmpresa_cliente(rs.getString(7));
                c.setUniv_cliente(rs.getString(8));
            }
        } catch (Exception e) {
        }return c;
    }

    @Override
    public List listar() {
        List<Cliente> lista = new ArrayList<>();
        String sql="select * from cliente";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Cliente c=new Cliente();
                c.setIdCliente(rs.getInt(1));
                c.setCc_Cliente(rs.getString(2));
                c.setNom_cliente(rs.getString(3));
                c.setCel_cliente(rs.getString(4));
                c.setEmail_cliente(rs.getString(5));
                c.setDir_cliente(rs.getString(6));
                c.setEmpresa_cliente(rs.getString(7));
                c.setUniv_cliente(rs.getString(8));
                lista.add(c);
                
                
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into cliente(cc_cliente,nom_cliente,cel_cliente,email_cliente,dir_cliente,empresa_cliente,univ_cliente)values(?,?,?,?,?,?,?)"; 
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);//JOptionPane.showMessageDialog(null, "Hello World");
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
        String sql="update cliente set Dni=?,Nombre=?,Direccion=?,Estado=? where IdCliente=?";
        try {
            con=cn.Conectar();
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
        String sql="delete from cliente where IdCliente=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
