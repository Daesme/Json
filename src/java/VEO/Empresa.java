package VEO;


import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user7
 */
public class Empresa implements Serializable {
    
    private String nombre;
    private String direccion;

    public Empresa(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    //lol
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
