/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libreria.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */

@Entity

public class Editorial implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String nombre;

    public Editorial() {
    }

    public Editorial(String nombre) {
     
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
    
    
}
