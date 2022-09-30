
package modelo;

public class EntidadUsuario {
    int id;
    String dni;
    String nom;
    String tel;
    String tipo;
    String pass;
    String est;

    public EntidadUsuario() {
    }

    public EntidadUsuario(int id, String dni, String nom, String tel, String tipo, String pass, String est) {
        this.id = id;
        this.dni = dni;
        this.nom = nom;
        this.tel = tel;
        this.tipo = tipo;
        this.pass = pass;
        this.est = est;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }

    
    
}
