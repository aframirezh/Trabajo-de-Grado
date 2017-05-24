/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Material;
import Entidades.Requisicion;
import Metodos.Metodos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.jws.Oneway;
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
@WebService(serviceName = "WSCrearRequisicion")
@BindingType(value = "http://java.sun.com/xml/ns/jaxws/2003/05/soap/bindings/HTTP/")
public class WSCrearRequisicion {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertarDB")
    
    public int insertarDB(@WebParam(name = "requisicion") Requisicion requisicion) throws ParseException {
      Requisicion requi = new Requisicion();
      Material mat = new Material();
      Material mat2 = new Material();
      //int idReq = 0;
      //int idMat = 0;
      Date cumpleanos = new Date("December 17, 1995 03:24:00");
      Date fMaterial = new Date("October 17, 1995 03:24:00");
      
      requi = requisicion;
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("WSCobraSAPU");
      EntityManager em2 = emf.createEntityManager();
      Query query = em2.createNativeQuery("select count (*) FROM REQUISICION");
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
    Query query4 = em2.createNativeQuery("select count (*) FROM MATERIAL");
    int d =0;
        
        List<Object []> result2 = query4.getResultList();
        for (Object f: result2)
        {
            //Integer.parseInt(a[1].toString()
            System.out.println("RESULTADO " + f.toString());
            d = Integer.parseInt(f.toString()); 
        }
        System.out.println("CANTIDAD MATERIALES " + d);
        //System.out.println("b"+ b);
        //System.out.println("b + 1 "+ c);
        int idReq = b+1;
        int idMat = d+1;
        System.out.println(" id req " + idReq + " id Mat " + idMat);
      
      requi.setIdRequisicion(idReq);
        
      
      
      
      
      /*requi.setNombreCoordinador("LUIS MURIEL");
      requi.setFecha(cumpleanos);
      requi.setNumeroOrden("1234AWDES");
      requi.setRequerimiento("MATERIALES");
      requi.setCliente("ETB");
      
      //mat.setIdMaterial(idMat);
      mat.setCodigo("15689");
      mat.setDescripcion("ESCALERA 12X24");
      mat.setUnidad("MTS");
      mat.setCantidad(1);
      mat.setObservaciones("SE NECESITA CON URGENCIA");
      mat.setFecha(fMaterial);
      mat.setIdRequisicion(idReq);
      //mat.setIdOrdenR(requi.getNumeroOrden());
      
      //mat2.setIdMaterial(idMat+1);
      mat2.setCodigo("123456");
      mat2.setDescripcion("CABLE DE MEDIDA");
      mat2.setUnidad("CMS");
      mat2.setCantidad(1);
      mat2.setObservaciones("URGENTE");
      mat2.setFecha(fMaterial);
      mat2.setIdRequisicion(idReq);
      //mat2.setIdOrdenR(requi.getNumeroOrden());
      
      List <Material> m = new ArrayList<Material>();
      m.add(mat);
      m.add(mat2);
      requi.setMateriales(m);*/
        
      //if(requi.getMateriales().size() > 0){
      
        for (Material x: requi.getMateriales())
            {
                x.setIdMaterial(idMat);
                x.setIdRequisicion(idReq);
                x.setIdOrdenR(requi.getNumeroOrden());
                idMat++;
            }
      //}
      
      
      
      
      for(Material ma:requi.getMateriales())
      {
          System.out.println(" INICIO ");
          System.out.println("ID MATERIAL " + ma.getIdMaterial());
          System.out.println("CODIGO " + ma.getCodigo());
          System.out.println("DESCRIPCION " + ma.getDescripcion());
          System.out.println("OBERVACIONES " + ma.getObservaciones());
          System.out.println("UNIDAD " + ma.getUnidad());
          System.out.println("CANTIDAD " + ma.getCantidad());
          System.out.println("FECHA " + ma.getFecha());
          System.out.println("ID REQUISICION " + ma.getIdRequisicion());
          System.out.println("ID ORDEN + " + ma.getIdOrdenR());
          System.out.println("     NEXT                         ");
       }
      
        
      

      //EntityManagerFactory factory = Persistence.createEntityManagerFactory("WSCobraSAPU");
      EntityManager em = emf.createEntityManager();
      em.getTransaction().begin();
      javax.persistence.Query query2 = em.createNativeQuery("INSERT INTO REQUISICION VALUES (?,?,?,?,?,?,?)");
      query2.setParameter(1,requi.getIdRequisicion());
      query2.setParameter(2,requi.getNombreCoordinador());
      query2.setParameter(3,requi.getFecha());
      query2.setParameter(4,requi.getNumeroOrden());
      query2.setParameter(5,requi.getRequerimiento());
      query2.setParameter(6,requi.getCliente());
      query2.setParameter(7,"APROBADA");
      query2.executeUpdate();
      
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
      
      
      return 1;
      
      
      
      
    }
}
