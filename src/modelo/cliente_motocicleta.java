
package modelo;

public class cliente_motocicleta {
    int idCliente_Motocicleta;
    int IdCliente;
    int id_motocicleta;

    public cliente_motocicleta() {
    }

    public cliente_motocicleta(int idCliente_Motocicleta, int IdCliente, int id_motocicleta) {
        this.idCliente_Motocicleta = idCliente_Motocicleta;
        this.IdCliente = IdCliente;
        this.id_motocicleta = id_motocicleta;
    }

    public int getIdCliente_Motocicleta() {
        return idCliente_Motocicleta;
    }

    public void setIdCliente_Motocicleta(int idCliente_Motocicleta) {
        this.idCliente_Motocicleta = idCliente_Motocicleta;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public int getId_motocicleta() {
        return id_motocicleta;
    }

    public void setId_motocicleta(int id_motocicleta) {
        this.id_motocicleta = id_motocicleta;
    }
    
    
}  
