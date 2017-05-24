
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicios package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ActualizarRequisicionDBResponse_QNAME = new QName("http://Servicios/", "actualizarRequisicionDBResponse");
    private final static QName _ActualizarRequisicionDB_QNAME = new QName("http://Servicios/", "actualizarRequisicionDB");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarRequisicionDB }
     * 
     */
    public ActualizarRequisicionDB createActualizarRequisicionDB() {
        return new ActualizarRequisicionDB();
    }

    /**
     * Create an instance of {@link ActualizarRequisicionDBResponse }
     * 
     */
    public ActualizarRequisicionDBResponse createActualizarRequisicionDBResponse() {
        return new ActualizarRequisicionDBResponse();
    }

    /**
     * Create an instance of {@link Material }
     * 
     */
    public Material createMaterial() {
        return new Material();
    }

    /**
     * Create an instance of {@link Requisicion }
     * 
     */
    public Requisicion createRequisicion() {
        return new Requisicion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarRequisicionDBResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "actualizarRequisicionDBResponse")
    public JAXBElement<ActualizarRequisicionDBResponse> createActualizarRequisicionDBResponse(ActualizarRequisicionDBResponse value) {
        return new JAXBElement<ActualizarRequisicionDBResponse>(_ActualizarRequisicionDBResponse_QNAME, ActualizarRequisicionDBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarRequisicionDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "actualizarRequisicionDB")
    public JAXBElement<ActualizarRequisicionDB> createActualizarRequisicionDB(ActualizarRequisicionDB value) {
        return new JAXBElement<ActualizarRequisicionDB>(_ActualizarRequisicionDB_QNAME, ActualizarRequisicionDB.class, null, value);
    }

}
