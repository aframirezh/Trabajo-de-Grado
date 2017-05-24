/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author usuario
 */
public class Solicitud {
    int idSolicitud;
    String nombreCoordinadorS;
    String numeroOrden;
    Date fechaS;
    List <Material> materiales; 
    String comentariosCompra;
    Date fechallegadaS;

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getNombreCoordinadorS() {
        return nombreCoordinadorS;
    }

    public void setNombreCoordinadorS(String nombreCoordinadorS) {
        this.nombreCoordinadorS = nombreCoordinadorS;
    }

    public String getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(String numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public Date getFechaS() {
        return fechaS;
    }

    public void setFechaS(Date fechaS) {
        this.fechaS = fechaS;
    }

    public List<Material> getMateriales() {
        return materiales;
    }

    public void setMateriales(List<Material> materiales) {
        this.materiales = materiales;
    }

    public String getComentariosCompra() {
        return comentariosCompra;
    }

    public void setComentariosCompra(String comentariosCompra) {
        this.comentariosCompra = comentariosCompra;
    }

    public Date getFechallegadaS() {
        return fechallegadaS;
    }

    public void setFechallegadaS(Date fechallegadaS) {
        this.fechallegadaS = fechallegadaS;
    }

    
    
    
    
    
    
}
