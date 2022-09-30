package modelo;

public class Cliente {
    int idCliente;
    String cc_Cliente;
    String nom_cliente;
    String cel_cliente;
    String email_cliente;
    String dir_cliente;
    String empresa_cliente;
    String univ_cliente;

    public Cliente() {
    }

    public Cliente(int idCliente, String cc_Cliente, String nom_cliente, String cel_cliente, String email_cliente, String dir_cliente, String empresa_cliente, String univ_cliente) {
        this.idCliente = idCliente;
        this.cc_Cliente = cc_Cliente;
        this.nom_cliente = nom_cliente;
        this.cel_cliente = cel_cliente;
        this.email_cliente = email_cliente;
        this.dir_cliente = dir_cliente;
        this.empresa_cliente = empresa_cliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCc_Cliente() {
        return cc_Cliente;
    }

    public void setCc_Cliente(String cc_Cliente) {
        this.cc_Cliente = cc_Cliente;
    }

    public String getNom_cliente() {
        return nom_cliente;
    }

    public void setNom_cliente(String nom_cliente) {
        this.nom_cliente = nom_cliente;
    }

    public String getCel_cliente() {
        return cel_cliente;
    }

    public void setCel_cliente(String cel_cliente) {
        this.cel_cliente = cel_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public String getDir_cliente() {
        return dir_cliente;
    }

    public void setDir_cliente(String dir_cliente) {
        this.dir_cliente = dir_cliente;
    }
    
    public String getEmpresa_cliente() {
        return empresa_cliente;
    }

    public void setEmpresa_cliente(String empresa_cliente) {
        this.empresa_cliente = empresa_cliente;
    }
    
    public String getUniv_cliente() {
        return univ_cliente;
    }

    public void setUniv_cliente(String univ_cliente) {
        this.univ_cliente = univ_cliente;
    }
    
    
}
