/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Material;
import Entidades.Requisicion;
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
@WebService(serviceName = "WSActualizarRequisicion")
@BindingType(value = "http://java.sun.com/xml/ns/jaxws/2003/05/soap/bindings/HTTP/")
public class WSActualizarRequisicion {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "actualizarRequisicionDB")
    public String actualizarRequisicionDB(@WebParam(name = "requisicion") Requisicion requisicion) {
      Requisicion requi = new Requisicion();
      Material mat = new Material();
      Material mat2 = new Material();
      requi = requisicion;
      Date cumpleanos = new Date("August 17, 1990 03:24:00");  
      Date fMaterial = new Date("October 31, 1999 03:24:00");
      int d = 0;
      
      //requi.setIdRequisicion(3);
      
      /*
      requi.setNombreCoordinador("JUANA BANANA LA DEL BARRIO ");
      requi.setFecha(cumpleanos);
      requi.setNumeroOrden("ARMACASAS");
      requi.setRequerimiento("DOTACION");
      requi.setCliente("ETB");
      
      mat.setCodigo("15686245");
      mat.setDescripcion("PLAY ");
      mat.setUnidad("BBS");
      mat.setCantidad(4);
      mat.setObservaciones("URGENCIA");
      mat.setFecha(fMaterial);
      mat.setIdOrdenR(requi.getNumeroOrden());
      
      
      mat2.setCodigo("15689");
      mat2.setDescripcion("IHPONE ");
      mat2.setUnidad("TS");
      mat2.setCantidad(21);
      mat2.setObservaciones("AREPA");
      mat2.setFecha(fMaterial);
      mat2.setIdOrdenR(requi.getNumeroOrden());
      
      
      List <Material> m = new ArrayList<Material>();
      m.add(mat);
      m.add(mat2);
      requi.setMateriales(m);*/
      
      EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("WSCobraSAPU");
      EntityManager em = emf2.createEntityManager();
      em.getTransaction().begin();
      
      
      javax.persistence.Query query8 = em.createNativeQuery("SELECT ID_REQ FROM REQUISICION WHERE NUMERO_ORDENREQ = ?");
      query8.setParameter(1,requi.getNumeroOrden());
      List<Object []> result2 = query8.getResultList();
        for (Object f: result2)
        {
            //Integer.parseInt(a[1].toString()
            System.out.println("RESULTADO " + f.toString());
            d = Integer.parseInt(f.toString()); 
            
        }
        
        requi.setIdRequisicion(d);
        System.out.println("D " + d + "ID REQUISICION " + requi.getIdRequisicion()); 
        
      
      javax.persistence.Query query9 = em.createNativeQuery("DELETE FROM (SELECT * FROM REQUISICION INNER JOIN MATERIAL ON REQUISICION.ID_REQ = MATERIAL.ID_REQUISICION WHERE REQUISICION.NUMERO_ORDENREQ = ?)");  
      query9.setParameter(1, requi.getNumeroOrden());
      query9.executeUpdate();
      
       System.out.println("EXITO ELIMINACION ");
      
      javax.persistence.Query query5 = em.createNativeQuery("select count (*) FROM MATERIAL");
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
        System.out.println("ID MATERIAL " + idMat);
        
        for(Material r:requi.getMateriales())
        {
          System.out.println("CODIGO " + r.getCodigo());
          System.out.println("DESCRIPCION " + r.getDescripcion());
          System.out.println("OBERVACIONES " + r.getObservaciones());
          System.out.println("UNIDAD " + r.getUnidad());
          System.out.println("CANTIDAD " + r.getCantidad());
          System.out.println("FECHA " + r.getFecha());
          System.out.println("      ");
        }
        
        
        for (Material x: requi.getMateriales())
            {
                x.setIdMaterial(idMat);
                x.setIdRequisicion(requi.getIdRequisicion());
                x.setIdOrdenR(requi.getNumeroOrden());
                idMat++;
            }
        for (Material t:requi.getMateriales())
        {
            //INSERT MATERIAL 
            javax.persistence.Query query3 = em.createNativeQuery("INSERT INTO MATERIAL VALUES (?,?,?,?,?,?,?,?,?)");
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
