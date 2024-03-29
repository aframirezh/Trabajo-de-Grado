
package servicios;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSActualizarRequisicion", targetNamespace = "http://Servicios/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSActualizarRequisicion {


    /**
     * 
     * @param requisicion
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "actualizarRequisicionDB", targetNamespace = "http://Servicios/", className = "servicios.ActualizarRequisicionDB")
    @ResponseWrapper(localName = "actualizarRequisicionDBResponse", targetNamespace = "http://Servicios/", className = "servicios.ActualizarRequisicionDBResponse")
    @Action(input = "http://Servicios/WSActualizarRequisicion/actualizarRequisicionDBRequest", output = "http://Servicios/WSActualizarRequisicion/actualizarRequisicionDBResponse")
    public String actualizarRequisicionDB(
        @WebParam(name = "requisicion", targetNamespace = "")
        Requisicion requisicion);

}
