
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarRequisicionDB complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarRequisicionDB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requisicion" type="{http://Servicios/}requisicion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarRequisicionDB", propOrder = {
    "requisicion"
})
public class ActualizarRequisicionDB {

    protected Requisicion requisicion;

    /**
     * Obtiene el valor de la propiedad requisicion.
     * 
     * @return
     *     possible object is
     *     {@link Requisicion }
     *     
     */
    public Requisicion getRequisicion() {
        return requisicion;
    }

    /**
     * Define el valor de la propiedad requisicion.
     * 
     * @param value
     *     allowed object is
     *     {@link Requisicion }
     *     
     */
    public void setRequisicion(Requisicion value) {
        this.requisicion = value;
    }

}
