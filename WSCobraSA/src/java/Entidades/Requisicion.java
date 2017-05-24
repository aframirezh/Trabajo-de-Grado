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
public class Requisicion {
   
   int idRequisicion; 
   String nombreCoordinador;
   Date fecha;
   String numeroOrden;
   String requerimiento;
   String otrosServicios;
   String cliente;
   List <Material> materiales; 
   

    public String getNombreCoordinador() {
        return nombreCoordinador;
    }

    public int getIdRequisicion() {
        return idRequisicion;
    }

    public void setIdRequisicion(int idRequisicion) {
        this.idRequisicion = idRequisicion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    

    

    public void setNombreCoordinador(String nombreCoordinador) {
        this.nombreCoordinador = nombreCoordinador;
    }


    public String getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(String numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public String getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(String requerimiento) {
        this.requerimiento = requerimiento;
    }

    public String getOtrosServicios() {
        return otrosServicios;
    }

    public void setOtrosServicios(String otrosServicios) {
        this.otrosServicios = otrosServicios;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Material> getMateriales() {
        return materiales;
    }

    public void setMateriales(List<Material> materiales) {
        this.materiales = materiales;
    }

  
   
    
    
    
   
}
