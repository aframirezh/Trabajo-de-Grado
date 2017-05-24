/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsclientactualizarrequisicion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import servicios.Material;
import servicios.Requisicion;

/**
 *
 * @author usuario
 */
public class WSClientActualizarRequisicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Requisicion requi = new Requisicion();
      Material mat = new Material();
      Material mat2 = new Material();
      Date cumpleanos = new Date("December 17, 1995 03:24:00");
      Date fMaterial = new Date("October 17, 1995 03:24:00");
      Date fMat = new Date("November 23, 1980 03:24:00");
      
      requi.setNombreCoordinador("PEPITA RIOS ");
      requi.setFecha(cumpleanos);
      requi.setNumeroOrden("ARMACASAS");
      requi.setRequerimiento("OTROS");
      requi.setCliente("COBRA");
      
      mat.setCodigo("15686245");
      mat.setDescripcion("XBOX V45554 ");
      mat.setUnidad("BBS");
      mat.setCantidad(4);
      mat.setObservaciones("URGENCIA");
      mat.setFecha(fMaterial);
      //mat.setIdOrdenR(requi.getNumeroOrden());
      
      
      /*mat2.setCodigo("15689");
      mat2.setDescripcion("FIFA ");
      mat2.setUnidad("TS");
      mat2.setCantidad(21);
      mat2.setObservaciones("AREPA");
      mat2.setFecha(fMaterial);*/
      //mat2.setIdOrdenR(requi.getNumeroOrden());
      
      
      List <Material> m = new ArrayList<Material>();
      m.add(mat);
      //m.add(mat2);
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
      String z = actualizarRequisicionDB(requi);
        
    }

    private static String actualizarRequisicionDB(servicios.Requisicion requisicion) {
        servicios.WSActualizarRequisicion_Service service = new servicios.WSActualizarRequisicion_Service();
        servicios.WSActualizarRequisicion port = service.getWSActualizarRequisicionPort();
        return port.actualizarRequisicionDB(requisicion);
    }
    
}
