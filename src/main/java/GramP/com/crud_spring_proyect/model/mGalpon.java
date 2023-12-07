
package GramP.com.crud_spring_proyect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//Anotaciones
@Entity
@Table(name="mGalpon")

public class mGalpon {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     private int id;
    private String temperaturaG;
    private String cantidadPollo;
    private String aseo;
    private String controlPlaga;
    private String estado;
    private String codMant;

    

    public mGalpon(int id, String temperaturaG, String cantidadPollo, String aseo, String controlPlaga, String estado, String codMant) {
        this.id = id;
        this.temperaturaG = temperaturaG;
        this.cantidadPollo = cantidadPollo;
        this.aseo = aseo;
        this.controlPlaga = controlPlaga;
        this.estado = estado;
        this.codMant = codMant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTemperaturaG() {
        return temperaturaG;
    }

    public void setTemperaturaG(String temperaturaG) {
        this.temperaturaG = temperaturaG;
    }

    public String getCantidadPollo() {
        return cantidadPollo;
    }

    public void setCantidadPollo(String cantidadPollo) {
        this.cantidadPollo = cantidadPollo;
    }

    public String getAseo() {
        return aseo;
    }

    public void setAseo(String aseo) {
        this.aseo = aseo;
    }

    public String getControlPlaga() {
        return controlPlaga;
    }

    public void setControlPlaga(String controlPlaga) {
        this.controlPlaga = controlPlaga;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodMant() {
        return codMant;
    }

    public void setCodMant(String codMant) {
        this.codMant = codMant;
    }
    
}
