/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsclientcrearsolicitud;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import servicios.Material;
import servicios.Solicitud;

/**
 *
 * @author usuario
 */
public class WSClientCrearSolicitud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Solicitud s = new Solicitud();
        Material mat = new Material();
        Material mat2 = new Material();
        Date cumpleanos = new Date("December 17, 1995 03:24:00");
        
      s.setNombreCoordinadorS("JOJOJOJO");
      s.setNumeroOrden("AODISAIWSERDSE");
      s.setFechaS(cumpleanos);
      s.setComentariosCompra("PAPAPAPAPA");
      s.setFechallegadaS(cumpleanos);
      
      
      mat.setCodigo("156801");
      mat.setDescripcion("GRPADORA");
      mat.setUnidad("MTS");
      mat.setCantidad(3);
      mat.setObservaciones("SE NECESITA CON URGENCIA");
      mat.setFecha(cumpleanos);
      mat.setIdOrdenR(s.getNumeroOrden());
      
      
      
      
      mat2.setCodigo("12001");
      mat2.setDescripcion("CORTA CABLES");
      mat2.setUnidad("CMS");
      mat2.setCantidad(1);
      mat2.setObservaciones("URGENTE");
      mat2.setFecha(cumpleanos);
      mat2.setIdOrdenR(s.getNumeroOrden());
      
      
      List <Material> m = new ArrayList<Material>();
      m.add(mat);
      m.add(mat2);
      s.setMateriales(m);
        
      String g = crearSolicitud(s);
    }

    private static String crearSolicitud(servicios.Solicitud solicitud) {
        servicios.WSCrearSolicitud_Service service = new servicios.WSCrearSolicitud_Service();
        servicios.WSCrearSolicitud port = service.getWSCrearSolicitudPort();
        return port.crearSolicitud(solicitud);
    }
    
}
