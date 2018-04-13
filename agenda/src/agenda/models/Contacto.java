/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.models;

import java.util.Date;

/**
 *
 * @author itsai
 */
public class Contacto {
    private String nombre;
    private String telefono;
    private String direccion;
    private String fecha;
    private int idPedido;

    public Contacto() {
    }

    
    public Contacto(String nombre, String telefono, String direccion, String fecha, int idPedido) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fecha = fecha;
        this.idPedido = idPedido;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    
}
