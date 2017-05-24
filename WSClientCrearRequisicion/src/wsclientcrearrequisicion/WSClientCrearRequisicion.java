/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsclientcrearrequisicion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import servicios.Material;
import servicios.ParseException_Exception;
import servicios.Requisicion;


/**
 *
 * @author usuario
 */
public class WSClientCrearRequisicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException_Exception {
      Requisicion requi = new Requisicion();
      Material mat = new Material();
      Material mat2 = new Material();
      Date cumpleanos = new Date("December 17, 1995 03:24:00");
      Date fMaterial = new Date("October 17, 1995 03:24:00");
      Date fMat = new Date("November 23, 1980 03:24:00");
      
      requi.setNombreCoordinador("ARMANDO CASAS ");
      requi.setFecha(cumpleanos);
      requi.setNumeroOrden("ARMACASAS");
      requi.setRequerimiento("MATERIALES");
      requi.setCliente("ETB");
      
      mat.setCodigo("1568233");
      mat.setDescripcion("PLAY ");
      mat.setUnidad("MTS");
      mat.setCantidad(1);
      mat.setObservaciones("SE NECESITA CON URGENCIA");
      mat.setFecha(fMaterial);
      mat.setIdOrdenR(requi.getNumeroOrden());
      
      
      mat2.setCodigo("123456");
      mat2.setDescripcion("XXX");
      mat2.setUnidad("CMS");
      mat2.setCantidad(1);
      mat2.setObservaciones("URGENTE");
      mat2.setFecha(fMat);
      mat2.setIdOrdenR(requi.getNumeroOrden());
      
      List <Material> m = new ArrayList<Material>();
      m.add(mat);
      m.add(mat2);
      requi.setMateriales(m);
      
      System.out.println("REQUISICION");
      System.out.println("RR " + requi.getNombreCoordinador());
      System.out.println("RR " + requi.getNumeroOrden());
      System.out.println("RR " + requi.getCliente());
      System.out.println("RR " + requi.getRequerimiento());
      System.out.println("RR " + requi.getFecha());
      System.out.println("                         ");
      
      
      
      /*for(Material r:requi.getMateriales())
      {
          System.out.println("CODIGO " + r.getCodigo());
          System.out.println("DESCRIPCION " + r.getDescripcion());
          System.out.println("OBERVACIONES " + r.getObservaciones());
          System.out.println("UNIDAD " + r.getUnidad());
          System.out.println("CANTIDAD " + r.getCantidad());
          System.out.println("FECHA " + r.getFecha());
          System.out.println("      ");
      }*/
      int a = insertarDB(requi);
      
      
    }

    private static int insertarDB(servicios.Requisicion requisicion) throws ParseException_Exception {
        servicios.WSCrearRequisicion_Service service = new servicios.WSCrearRequisicion_Service();
        servicios.WSCrearRequisicion port = service.getWSCrearRequisicionPort();
        return port.insertarDB(requisicion);
    }

    
   
}
