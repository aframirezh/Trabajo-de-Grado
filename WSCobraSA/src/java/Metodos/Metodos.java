/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Entidades.Material;
import Entidades.Requisicion;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author usuario
 */
public class Metodos {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("WSCobraSAPU");
    EntityManager em = factory.createEntityManager();
    
    
    public void insertarRequisicion(Requisicion requi)
    {
        //EntityManagerFactory factory = Persistence.createEntityManagerFactory("WSCrearRequisicionNPU");
        //EntityManager em = factory.createEntityManager();
        int idReq = 0;
        int idMat = 0;
        em.getTransaction().begin();
        javax.persistence.Query query2 = em.createNativeQuery("INSERT INTO REQUISICION VALUES (?,?,?,?,?,?,?,?)");
        query2.setParameter(1,idReq);
        query2.setParameter(2,"kakaka");
        query2.setParameter(3,"kakaka");
        query2.setParameter(4,"kakaka");
        query2.setParameter(5,"kakaka");
        query2.setParameter(6,"kakaka");
        query2.setParameter(7,"kakaka");
        query2.setParameter(8,"kakaka");
        /*query2.setParameter(2,requi.getNombreCoordinador());
        query2.setParameter(3,requi.getFecha());
        query2.setParameter(4,requi.getNumeroOrden());
        query2.setParameter(5,requi.getRequerimiento());
        query2.setParameter(6,requi.getOtrosServicios());
        query2.setParameter(7,requi.getCliente());
        query2.setParameter(8,requi.getFechaLlegada());*/
        query2.executeUpdate();
        /*for (Material mat: requi.getMateriales())
        {
            //INSERT MATERIAL 
            javax.persistence.Query query3 = em.createNativeQuery("INSERT INTO MATERIAL VALUES (?,?,?,?,?,?,?)");
            query3.setParameter(1,idMat);
            query3.setParameter(2,"SSSS");
            query3.setParameter(3,"SSSS");
            query3.setParameter(4,"SSSS");
            query3.setParameter(5,"SSSS");
            query3.setParameter(6,"SSSS");
            query3.setParameter(7,"SSSS");
            query3.setParameter(8,idReq);
            
            /*query3.setParameter(2,mat.getCodigo());
            query3.setParameter(3,mat.getDescripcion());
            query3.setParameter(4,mat.getUnidad());
            query3.setParameter(5,mat.getCantidad());
            query3.setParameter(6,mat.getObservaciones());
            query3.setParameter(7,mat.getFecha());
            query3.setParameter(8,idReq);
            query3.executeUpdate();
        }*/
        //query2.setParameter(7,"PEPE"); ESTADO REQUISICION
        em.getTransaction().commit();
        em.close();
    }
    
    /*public void insertarMaterial(Material mate)
    {
        //EntityManagerFactory fac = Persistence.createEntityManagerFactory("ServicioRequisicionPU");
        //EntityManager em = fac.createEntityManager();
        em.getTransaction().begin();
        javax.persistence.Query query3 = em.createNativeQuery("INSERT INTO MATERIALES VALUES (?,?,?,?,?,?,?,?)");
        /*query3.setParameter(1,mate.getIdMaterial());
        query3.setParameter(2,mate.getCodMaterial());
        query3.setParameter(3,mate.getDescripcionServicio());
        query3.setParameter(4,mate.getUnidad());
        query3.setParameter(5,mate.getCantidadRequerida());
        query3.setParameter(6,mate.getObservacion());
        query3.setParameter(7,mate.getDescripcionServicio());
        query3.setParameter(8,mate.getFechaRequerida());*/
        /*query3.executeUpdate();
        em.getTransaction().commit();
        em.close();
    }*/
    
    public void insertar_requisicionxmaterial(String id_R, String id_M)
    {
        em.getTransaction().begin();
        javax.persistence.Query query8 = em.createNativeQuery("INSERT INTO REQUISICIONXMATERIALES VALUES (?,?)");
        query8.setParameter(1,id_R);
        query8.setParameter(2,id_M);
        query8.executeUpdate();
        em.getTransaction().commit();
        em.close();
    }
    
    public void insertarPrueba(String n1, String n2, String n3)
    {
        //EntityManagerFactory factory = Persistence.createEntityManagerFactory("WSCrearRequisicionNPU");
        //EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        javax.persistence.Query query4 = em.createNativeQuery("INSERT INTO PRUEBA VALUES (,?,?)");
        //avax.persistence.Query query4 = em.createNativeQuery("INSERT INTO PRUEBA VALUES (PEPE,SANCHEZ,MORENO)");
        /*query4.setParameter(1,n1);
        query4.setParameter(2,n2);
        query4.setParameter(3,n3);
        query4.executeUpdate();*/
        em.getTransaction().commit();
        em.close();
    }
    
    public void actualizarRequisicion(String id, String campo, String nuevoValor)
    {
        //EntityManagerFactory factory = Persistence.createEntityManagerFactory("WSCrearRequisicionNPU");
        //EntityManager em = factory.createEntityManager();
        if (campo.equalsIgnoreCase("FECHA_REQUERIDA"))
        {
            em.getTransaction().begin();
            javax.persistence.Query query5 = em.createNativeQuery("UPDATE REQUISICION SET FECHA_REQ = ? WHERE ID_REQ = ?");
            query5.setParameter(1,nuevoValor);
            query5.setParameter(2,id);
            query5.executeUpdate();
            em.getTransaction().commit();
            em.close();
        }
        
        if (campo.equalsIgnoreCase("NUMERO_ORDEN_REQ"))
        {
            em.getTransaction().begin();
            javax.persistence.Query query5 = em.createNativeQuery("UPDATE REQUISICION SET NUMERO_ORDENREQ = ? WHERE ID_REQ = ?");
            query5.setParameter(1,nuevoValor);
            query5.setParameter(2,id);
            query5.executeUpdate();
            em.getTransaction().commit();
            em.close();
        }
        
        if (campo.equalsIgnoreCase("NOMBRE_COORDINADOR"))
        {
            em.getTransaction().begin();
            javax.persistence.Query query5 = em.createNativeQuery("UPDATE REQUISICION SET NOMBRE_COORDINADOR = ? WHERE ID_REQ = ?");
            query5.setParameter(1,nuevoValor);
            query5.setParameter(2,id);
            query5.executeUpdate();
            em.getTransaction().commit();
            em.close();
        }
        
        if (campo.equalsIgnoreCase("REQUERIMIENTO_REQ"))
        {
            em.getTransaction().begin();
            javax.persistence.Query query5 = em.createNativeQuery("UPDATE REQUISICION SET REQUERIMIENTO_REQ = ? WHERE ID_REQ = ?");
            query5.setParameter(1,nuevoValor);
            query5.setParameter(2,id);
            query5.executeUpdate();
            em.getTransaction().commit();
            em.close();
        }
        
        if (campo.equalsIgnoreCase("CLIENTE_REQ"))
        {
            em.getTransaction().begin();
            javax.persistence.Query query5 = em.createNativeQuery("UPDATE REQUISICION SET CLIENTE_REQ = ? WHERE ID_REQ = ?");
            query5.setParameter(1,nuevoValor);
            query5.setParameter(2,id);
            query5.executeUpdate();
            em.getTransaction().commit();
            em.close();
        }
        
        if (campo.equalsIgnoreCase("ESTADO_REQ"))
        {
            em.getTransaction().begin();
            javax.persistence.Query query5 = em.createNativeQuery("UPDATE REQUISICION SET ESTADO_REQ = ? WHERE ID_REQ = ?");
            query5.setParameter(1,nuevoValor);
            query5.setParameter(2,id);
            query5.executeUpdate();
            em.getTransaction().commit();
            em.close();
        }
    }
    
    public void actualizarMateriales(String id,String codigoMat, String campo, String nuevoValor,String id_REQ)
    {
        if (campo.equalsIgnoreCase("CODIGO_MATERIAL"))
        {
            em.getTransaction().begin();
            javax.persistence.Query query6 = em.createNativeQuery("UPDATE MATERIALES SET CODIGO_MAT = ? "
            + "WHERE ID_MAT = ?");
            query6.setParameter(1,nuevoValor);
            query6.setParameter(2,id);
            query6.executeUpdate();
            em.getTransaction().commit();
            em.close();
        }
        
        
        if (campo.equalsIgnoreCase("DESCRIPCION"))
        {
            em.getTransaction().begin();
            javax.persistence.Query query6 = em.createNativeQuery("UPDATE MATERIALES SET DESCRIPCION = ? "
            + "WHERE ID_MAT = ?");
            query6.setParameter(1,nuevoValor);
            query6.setParameter(2,id);
            query6.executeUpdate();
            em.getTransaction().commit();
            em.close();
        }
       
        if (campo.equalsIgnoreCase("UNIDAD"))
        {
            em.getTransaction().begin();
            javax.persistence.Query query6 = em.createNativeQuery("UPDATE MATERIALES SET UNIDAD = ? "
            + "WHERE ID_MAT = ?");
            query6.setParameter(1,nuevoValor);
            query6.setParameter(2,id);
            query6.executeUpdate();
            em.getTransaction().commit();
            em.close();
        }
        
        if (campo.equalsIgnoreCase("UNIDAD"))
        {
            em.getTransaction().begin();
            javax.persistence.Query query6 = em.createNativeQuery("UPDATE MATERIALES SET UNIDAD = ? "
            + "WHERE ID_MAT = ?");
            query6.setParameter(1,nuevoValor);
            query6.setParameter(2,id);
            query6.executeUpdate();
            em.getTransaction().commit();
            em.close();
        }
        
        if (campo.equalsIgnoreCase("CANTIDAD_REQUERIDA"))
        {
            em.getTransaction().begin();
            javax.persistence.Query query6 = em.createNativeQuery("UPDATE MATERIALES SET CANTIDAD_REQUERIDA = ? "
            + "WHERE ID_MAT = ?");
            query6.setParameter(1,nuevoValor);
            query6.setParameter(2,id);
            query6.executeUpdate();
            em.getTransaction().commit();
            em.close();
        }
        
        if (campo.equalsIgnoreCase("OBSERVACION"))
        {
            em.getTransaction().begin();
            javax.persistence.Query query6 = em.createNativeQuery("UPDATE MATERIALES SET OBSERVACION = ? "
            + "WHERE ID_MAT = ?");
            query6.setParameter(1,nuevoValor);
            query6.setParameter(2,id);
            query6.executeUpdate();
            em.getTransaction().commit();
            em.close();
        }
        
        if (campo.equalsIgnoreCase("DESCRIPCION_SERVICIO"))
        {
            em.getTransaction().begin();
            javax.persistence.Query query6 = em.createNativeQuery("UPDATE MATERIALES SET DESCRIPCION_SERVICIO = ? "
            + "WHERE ID_MAT = ?");
            query6.setParameter(1,nuevoValor);
            query6.setParameter(2,id);
            query6.executeUpdate();
            em.getTransaction().commit();
            em.close();
        }
        
        if (campo.equalsIgnoreCase("FECHA_REQUERIDA"))
        {
            em.getTransaction().begin();
            javax.persistence.Query query6 = em.createNativeQuery("UPDATE MATERIALES SET FECHA_REQUERIDA = ? "
            + "WHERE ID_MAT = ?");
            query6.setParameter(1,nuevoValor);
            query6.setParameter(2,id);
            query6.executeUpdate();
            em.getTransaction().commit();
            em.close();
        }
    }
    
    public List<Requisicion> consultarDB()  
    {
        em.getTransaction().begin();
        javax.persistence.Query query7 = em.createNativeQuery("select * FROM REQUISICION");
        List<Object[]> result = query7.getResultList();
        /*for (Object[] a: result)
        {
            System.out.println(a[0]+ " " + a[1] + " " +a[2] + " " +a[3] + " "+a[4]);
        }*/
         List<Requisicion> req = new ArrayList<Requisicion>();
         for (Object[] a: result)
        {
            Requisicion r = new Requisicion();
            
            /*r.setIdReq(a[0].toString());
            r.setFechaReq(a[1].toString());
            r.setNumOrden(a[2].toString());
            r.setNombreC(a[3].toString());
            r.setRequerimiento(a[4].toString());
            r.setClienteReq(a[5].toString());
            r.setEstadoReq(a[6].toString());*/
            req.add(r);
            //System.out.println(a[0] + " " + a[3] + " "+ a[6] + " " + a[8]);
        }
        return req;
    }
    
    
    /*EntityManagerFactory factory = Persistence.createEntityManagerFactory("WSCrearRequisicionNPU");
    EntityManager em = factory.createEntityManager();
    em.getTransaction().begin();
      //javax.persistence.Query query4 = em.createNativeQuery("INSERT INTO PRUEBA VALUES ('PEPE','PEREZ','MORENO')");
      javax.persistence.Query query4 = em.createNativeQuery("INSERT INTO PRUEBA VALUES (?,?,?)");
      String a = requisicion.getNombreCoordinador();
      String b = requisicion.getNombreCoordinador();
      String c = requisicion.getNombreCoordinador();
      query4.setParameter(1,a);
      query4.setParameter(2,b);
      query4.setParameter(3,c);
      
      query4.executeUpdate();
      em.getTransaction().commit();
      em.close();*/
}
