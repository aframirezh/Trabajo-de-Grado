/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsclientactualizarsolicitud;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import servicios.Material;
import servicios.Solicitud;

/**
 *
 * @author usuario
 */
public class WSClientActualizarSolicitud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Solicitud s = new Solicitud();
      Material mat = new Material();
      Material mat2 = new Material();
      Date cumpleanos = new Date("December 17, 1995 03:24:00");
      Date fMaterial = new Date("October 17, 1995 03:24:00");
      Date fMat = new Date("November 23, 1980 03:24:00");
      
      s.setNombreCoordinadorS("JUAN PEREZ");
      s.setNumeroOrden("AODISAIWSERDSE");
      s.setFechaS(cumpleanos);
      s.setComentariosCompra("BLABLABLABLABLABLA");
      s.setFechallegadaS(cumpleanos);
      
      
      mat.setCodigo("15689");
      mat.setDescripcion("ESCALERA 12X24");
      mat.setUnidad("MTS");
      mat.setCantidad(1);
      mat.setObservaciones("SE NECESITA CON URGENCIA");
      mat.setFecha(cumpleanos);
      
      
      
      mat2.setCodigo("123456");
      mat2.setDescripcion("CABLE DE MEDIDA");
      mat2.setUnidad("CMS");
      mat2.setCantidad(1);
      mat2.setObservaciones("URGENTE");
      mat2.setFecha(cumpleanos);
      
      
      List <Material> m = new ArrayList<Material>();
      m.add(mat);
      m.add(mat2);
      s.setMateriales(m);
      
      
      
      
      
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
      
      String h = actualizarSolicitud(s);
    }

    private static String actualizarSolicitud(servicios.Solicitud solicitud) {
        servicios.WSActualizarSolicitud_Service service = new servicios.WSActualizarSolicitud_Service();
        servicios.WSActualizarSolicitud port = service.getWSActualizarSolicitudPort();
        return port.actualizarSolicitud(solicitud);
    }
    
}
