
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
 * <p>Clase Java para requisicion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="requisicion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idRequisicion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="materiales" type="{http://Servicios/}material" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nombreCoordinador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroOrden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otrosServicios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requerimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requisicion", propOrder = {
    "cliente",
    "fecha",
    "idRequisicion",
    "materiales",
    "nombreCoordinador",
    "numeroOrden",
    "otrosServicios",
    "requerimiento"
})
public class Requisicion {

    protected String cliente;
    @XmlSchemaType(name = "dateTime")
    protected Date fecha;
    protected int idRequisicion;
    @XmlElement(nillable = true)
    protected List<Material> materiales;
    protected String nombreCoordinador;
    protected String numeroOrden;
    protected String otrosServicios;
    protected String requerimiento;

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliente(String value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(Date value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad idRequisicion.
     * 
     */
    public int getIdRequisicion() {
        return idRequisicion;
    }

    /**
     * Define el valor de la propiedad idRequisicion.
     * 
     */
    public void setIdRequisicion(int value) {
        this.idRequisicion = value;
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
   

    /**
     * Obtiene el valor de la propiedad nombreCoordinador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCoordinador() {
        return nombreCoordinador;
    }

    /**
     * Define el valor de la propiedad nombreCoordinador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCoordinador(String value) {
        this.nombreCoordinador = value;
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

    /**
     * Obtiene el valor de la propiedad otrosServicios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtrosServicios() {
        return otrosServicios;
    }

    /**
     * Define el valor de la propiedad otrosServicios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtrosServicios(String value) {
        this.otrosServicios = value;
    }

    /**
     * Obtiene el valor de la propiedad requerimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequerimiento() {
        return requerimiento;
    }

    /**
     * Define el valor de la propiedad requerimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequerimiento(String value) {
        this.requerimiento = value;
    }

         public List<Material> getMateriales() {
        return materiales;
    }

    public void setMateriales(List<Material> materiales) {
        this.materiales = materiales;
    }
}
