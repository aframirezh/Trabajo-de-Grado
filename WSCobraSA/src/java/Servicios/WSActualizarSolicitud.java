/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Material;
import Entidades.Solicitud;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.xml.ws.BindingType;

/**
 *
 * @author usuario
 */
@WebService(serviceName = "WSActualizarSolicitud")
@BindingType(value = "http://java.sun.com/xml/ns/jaxws/2003/05/soap/bindings/HTTP/")
public class WSActualizarSolicitud {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "actualizarSolicitud")
    public String actualizarSolicitud(@WebParam(name = "solicitud") Solicitud solicitud) {
      Solicitud s = new Solicitud();
      Material mat = new Material();
      Material mat2 = new Material();
      s = solicitud;
      Date cumpleanos = new Date("August 17, 1990 03:24:00");  
      Date fMaterial = new Date("October 31, 1999 03:24:00");
      int d = 0;
      
      //requi.setIdRequisicion(3);
      
      
      /*s.setNombreCoordinadorS("JAMES BOND ");
      s.setNumeroOrden("ARMACASAS");
      s.setFechaS(cumpleanos);
      s.setComentariosCompra("LLEGARA PRONTO");
      s.setFechallegadaS(fMaterial);
      
      
      mat.setCodigo("15686245");
      mat.setDescripcion("HAMBURGUESA CORRAL  ");
      mat.setUnidad("BSS");
      mat.setCantidad(4);
      mat.setObservaciones("TODO TERRENO");
      mat.setFecha(fMaterial);
      mat.setIdOrdenR(s.getNumeroOrden());
      
      
      mat2.setCodigo("15689");
      mat2.setDescripcion("SAMSUNG GALAXY  ");
      mat2.setUnidad("TS");
      mat2.setCantidad(21);
      mat2.setObservaciones("PAN");
      mat2.setFecha(fMaterial);
      mat2.setIdOrdenR(s.getNumeroOrden());
      
      
      List <Material> m = new ArrayList<Material>();
      m.add(mat);
      //m.add(mat2);
      s.setMateriales(m);*/
      
      EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("WSCobraSAPU");
      EntityManager em = emf2.createEntityManager();
      em.getTransaction().begin();
      javax.persistence.Query query7 = em.createNativeQuery("UPDATE SOLICITUD SET NOMBRE_COORDINADORS = ?, FECHA_SOLICITUD = ?, COMENTARIOS_COMPRA = ?, FECHA_LLEGADAS = ? WHERE NUMERO_ORDEN = ?");
      query7.setParameter(1,s.getNombreCoordinadorS());
      query7.setParameter(2,s.getFechaS());
      query7.setParameter(3,s.getComentariosCompra());
      query7.setParameter(4,s.getFechallegadaS());
      query7.setParameter(5,s.getNumeroOrden());
      query7.executeUpdate();
      
      javax.persistence.Query query8 = em.createNativeQuery("SELECT ID_SOLICITUD FROM SOLICITUD WHERE NUMERO_ORDEN = ?");
      query8.setParameter(1,s.getNumeroOrden());
      List<Object []> result2 = query8.getResultList();
        for (Object f: result2)
        {
            //Integer.parseInt(a[1].toString()
            System.out.println("RESULTADO " + f.toString());
            d = Integer.parseInt(f.toString()); 
            
        }
        
        s.setIdSolicitud(d);
        System.out.println("D " + d + "ID SOLICITUD " + s.getIdSolicitud()); 
        
      
      javax.persistence.Query query9 = em.createNativeQuery("DELETE FROM (SELECT * FROM SOLICITUD INNER JOIN MATERIALSOLICITUD ON SOLICITUD.ID_SOLICITUD = MATERIALSOLICITUD.ID_SOL WHERE SOLICITUD.NUMERO_ORDEN = ?)");  
      query9.setParameter(1, s.getNumeroOrden());
      query9.executeUpdate();
      
      javax.persistence.Query query5 = em.createNativeQuery("select count (*) FROM MATERIALSOLICITUD");
      int nMat =0;
      int idMat = 0;
        
        List<Object []> result3 = query5.getResultList();
        for (Object f: result3)
        {
            //Integer.parseInt(a[1].toString()
            System.out.println("RESULTADO COUNT MATERIAL " + f.toString());
            nMat = Integer.parseInt(f.toString()); 
        }
        idMat = nMat+1;
      
        for (Material x: s.getMateriales())
            {
                x.setIdMaterial(idMat);
                x.setIdRequisicion(s.getIdSolicitud());
                x.setIdOrdenR(s.getNumeroOrden());
                idMat++;
            }
        for (Material t:s.getMateriales())
        {
            //INSERT MATERIAL 
            javax.persistence.Query query3 = em.createNativeQuery("INSERT INTO MATERIALSOLICITUD VALUES (?,?,?,?,?,?,?,?,?)");
            query3.setParameter(1,t.getIdMaterial());
            query3.setParameter(2,t.getCodigo());
            query3.setParameter(3,t.getDescripcion());
            query3.setParameter(4,t.getUnidad());
            query3.setParameter(5,t.getCantidad());
            query3.setParameter(6,t.getObservaciones());
            query3.setParameter(7,t.getFecha());
            query3.setParameter(8,t.getIdRequisicion());
            query3.setParameter(9,t.getIdOrdenR());
            query3.executeUpdate();
        }
      
      
      
      
        em.getTransaction().commit();
        em.close();
        return "SIRVIO";
    }
}
