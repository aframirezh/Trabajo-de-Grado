
package servicios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para solicitud complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="solicitud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comentariosCompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaS" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechallegadaS" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idSolicitud" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="materiales" type="{http://Servicios/}material" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nombreCoordinadorS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroOrden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitud", propOrder = {
    "comentariosCompra",
    "fechaS",
    "fechallegadaS",
    "idSolicitud",
    "materiales",
    "nombreCoordinadorS",
    "numeroOrden"
})
public class Solicitud {

    protected String comentariosCompra;
    @XmlSchemaType(name = "dateTime")
    protected Date fechaS;
    @XmlSchemaType(name = "dateTime")
    protected Date fechallegadaS;
    protected int idSolicitud;
    @XmlElement(nillable = true)
    protected List<Material> materiales;
    protected String nombreCoordinadorS;
    protected String numeroOrden;

    /**
     * Obtiene el valor de la propiedad comentariosCompra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentariosCompra() {
        return comentariosCompra;
    }

    /**
     * Define el valor de la propiedad comentariosCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentariosCompra(String value) {
        this.comentariosCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaS.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getFechaS() {
        return fechaS;
    }

    /**
     * Define el valor de la propiedad fechaS.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaS(Date value) {
        this.fechaS = value;
    }

    /**
     * Obtiene el valor de la propiedad fechallegadaS.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getFechallegadaS() {
        return fechallegadaS;
    }

    /**
     * Define el valor de la propiedad fechallegadaS.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechallegadaS(Date value) {
        this.fechallegadaS = value;
    }

    /**
     * Obtiene el valor de la propiedad idSolicitud.
     * 
     */
    public int getIdSolicitud() {
        return idSolicitud;
    }

    /**
     * Define el valor de la propiedad idSolicitud.
     * 
     */
    public void setIdSolicitud(int value) {
        this.idSolicitud = value;
    }

    /**
     * Gets the value of the materiales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materiales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMateriales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Material }
     * 
     * 
     */
     public List<Material> getMateriales() {
        return materiales;
    }

    public void setMateriales(List<Material> materiales) {
        this.materiales = materiales;
    }

    /**
     * Obtiene el valor de la propiedad nombreCoordinadorS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCoordinadorS() {
        return nombreCoordinadorS;
    }

    /**
     * Define el valor de la propiedad nombreCoordinadorS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCoordinadorS(String value) {
        this.nombreCoordinadorS = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroOrden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroOrden() {
        return numeroOrden;
    }

    /**
     * Define el valor de la propiedad numeroOrden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroOrden(String value) {
        this.numeroOrden = value;
    }

}
