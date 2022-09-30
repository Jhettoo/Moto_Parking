
package modelo;
 
public class motocicleta {
    int id_motocicleta;
    String placa_moto;
    String marca_moto;
    String ref_moto;
    int cilindrada_moto;
    String color_moto;
    String observaciones_moto;
    String estado_moto;

    public motocicleta() {
    }

    public motocicleta(int id_motocicleta, String placa_moto, String marca_moto, String ref_moto, int cilindrada_moto, String color_moto, String observaciones_moto, String estado_moto) {
        this.id_motocicleta = id_motocicleta;
        this.placa_moto = placa_moto;
        this.marca_moto = marca_moto;
        this.ref_moto = ref_moto;
        this.cilindrada_moto = cilindrada_moto;
        this.color_moto = color_moto;
        this.observaciones_moto = observaciones_moto;
        this.estado_moto = estado_moto;
    }

    public int getId_motocicleta() {
        return id_motocicleta;
    }

    public void setId_motocicleta(int id_motocicleta) {
        this.id_motocicleta = id_motocicleta;
    }

    public String getPlaca_moto() {
        return placa_moto;
    }

    public void setPlaca_moto(String placa_moto) {
        this.placa_moto = placa_moto;
    }

    public String getMarca_moto() {
        return marca_moto;
    }

    public void setMarca_moto(String marca_moto) {
        this.marca_moto = marca_moto;
    }

    public String getRef_moto() {
        return ref_moto;
    }

    public void setRef_moto(String ref_moto) {
        this.ref_moto = ref_moto;
    }

    public int getCilindrada_moto() {
        return cilindrada_moto;
    }

    public void setCilindrada_moto(int cilindrada_moto) {
        this.cilindrada_moto = cilindrada_moto;
    }

    public String getColor_moto() {
        return color_moto;
    }

    public void setColor_moto(String color_moto) {
        this.color_moto = color_moto;
    }

    public String getObservaciones_moto() {
        return observaciones_moto;
    }

    public void setObservaciones_moto(String observaciones_moto) {
        this.observaciones_moto = observaciones_moto;
    }

    public String getEstado_moto() {
        return estado_moto;
    }

    public void setEstado_moto(String estado_moto) {
        this.estado_moto = estado_moto;
    }
    
    
    
}
