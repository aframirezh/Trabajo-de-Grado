/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Material;
import Entidades.Requisicion;
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
import javax.persistence.Query;
import javax.xml.ws.BindingType;

/**
 *
 * @author usuario
 */
@WebService(serviceName = "WSCrearSolicitud")
@BindingType(value = "http://java.sun.com/xml/ns/jaxws/2003/05/soap/bindings/HTTP/")
public class WSCrearSolicitud {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "crearSolicitud")
    public String crearSolicitud(@WebParam(name = "solicitud") Solicitud solicitud) {
      Solicitud s = new Solicitud();
      Material mat = new Material();
      Material mat2 = new Material();
      s = solicitud;
      Date cumpleanos = new Date("August 17, 1990 03:24:00");  
      Date fMaterial = new Date("October 31, 1999 03:24:00");
      
      
      
      
      
      
      
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("WSCobraSAPU");
      EntityManager em2 = emf.createEntityManager();
      Query query = em2.createNativeQuery("select count (*) FROM SOLICITUD");
      int b =0;
        
        List<Object []> result = query.getResultList();
        for (Object a: result)
        {
            //Integer.parseInt(a[1].toString()
            System.out.println("RESULTADO " + a.toString());
            b = Integer.parseInt(a.toString()); 
        }
    //int c = b+1;
    System.out.println("CANTIDAD REQUISICIONES " + b);
    Query query4 = em2.createNativeQuery("select count (*) FROM MATERIALSOLICITUD");
    int d =0;
        
        List<Object []> result2 = query4.getResultList();
        for (Object f: result2)
        {
            //Integer.parseInt(a[1].toString()
            System.out.println("RESULTADO " + f.toString());
            d = Integer.parseInt(f.toString()); 
        }
        System.out.println("CANTIDAD MATERIALSOLICITUD " + d);
        //System.out.println("b"+ b);
        //System.out.println("b + 1 "+ c);
        int idS = b+1;
        int idMat = d+1;
        System.out.println(" id req " + idS + " id Mat " + idMat);
      
      s.setIdSolicitud(idS);
      /*
      s.setNombreCoordinadorS("JUANA BANANA LA DEL BARRIO ");
      s.setNumeroOrden("ARMACASAS");
      s.setFechaS(cumpleanos);
      s.setComentariosCompra("LLEGARA PRONTO");
      s.setFechallegadaS(fMaterial);
      
      
      mat.setCodigo("15686245");
      mat.setDescripcion("PLAY ");
      mat.setUnidad("BBS");
      mat.setCantidad(4);
      mat.setObservaciones("URGENCIA");
      mat.setFecha(fMaterial);
      mat.setIdOrdenR(s.getNumeroOrden());
      
      
      mat2.setCodigo("15689");
      mat2.setDescripcion("IHPONE ");
      mat2.setUnidad("TS");
      mat2.setCantidad(21);
      mat2.setObservaciones("AREPA");
      mat2.setFecha(fMaterial);
      mat2.setIdOrdenR(s.getNumeroOrden());
      
      
      List <Material> m = new ArrayList<Material>();
      m.add(mat);
      m.add(mat2);
      s.setMateriales(m);*/
      
      
      
      
      
      
        
      //if(requi.getMateriales().size() > 0){
      
        for (Material x: s.getMateriales())
            {
                x.setIdMaterial(idMat);
                x.setIdRequisicion(idS);
                x.setIdOrdenR(s.getNumeroOrden());
                idMat++;
            }
      //}
      
      
      
      
      for(Material ma:s.getMateriales())
      {
          System.out.println(" INICIO ");
          System.out.println("ID MATERIAL " + ma.getIdMaterial());
          System.out.println("CODIGO " + ma.getCodigo());
          System.out.println("DESCRIPCION " + ma.getDescripcion());
          System.out.println("OBERVACIONES " + ma.getObservaciones());
          System.out.println("UNIDAD " + ma.getUnidad());
          System.out.println("CANTIDAD " + ma.getCantidad());
          System.out.println("FECHA " + ma.getFecha());
          System.out.println("ID SOLICITUD " + ma.getIdRequisicion());
          System.out.println("ID ORDEN + " + ma.getIdOrdenR());
          System.out.println("     NEXT                         ");
       }
      
        
      
      
      //EntityManagerFactory factory = Persistence.createEntityManagerFactory("WSCobraSAPU");
      EntityManager em = emf.createEntityManager();
      em.getTransaction().begin();
      javax.persistence.Query query2 = em.createNativeQuery("INSERT INTO SOLICITUD VALUES (?,?,?,?,?,?)");
      query2.setParameter(1,s.getIdSolicitud());
      query2.setParameter(2,s.getNombreCoordinadorS());
      query2.setParameter(3,s.getNumeroOrden());
      query2.setParameter(4,s.getFechaS());
      query2.setParameter(5,s.getComentariosCompra());
      query2.setParameter(6,s.getFechallegadaS());
      
      query2.executeUpdate();
      
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
