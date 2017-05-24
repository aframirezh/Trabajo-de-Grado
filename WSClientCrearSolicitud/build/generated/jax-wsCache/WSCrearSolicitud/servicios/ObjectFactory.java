
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

    private final static QName _CrearSolicitudResponse_QNAME = new QName("http://Servicios/", "crearSolicitudResponse");
    private final static QName _CrearSolicitud_QNAME = new QName("http://Servicios/", "crearSolicitud");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearSolicitud }
     * 
     */
    public CrearSolicitud createCrearSolicitud() {
        return new CrearSolicitud();
    }

    /**
     * Create an instance of {@link CrearSolicitudResponse }
     * 
     */
    public CrearSolicitudResponse createCrearSolicitudResponse() {
        return new CrearSolicitudResponse();
    }

    /**
     * Create an instance of {@link Material }
     * 
     */
    public Material createMaterial() {
        return new Material();
    }

    /**
     * Create an instance of {@link Solicitud }
     * 
     */
    public Solicitud createSolicitud() {
        return new Solicitud();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearSolicitudResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "crearSolicitudResponse")
    public JAXBElement<CrearSolicitudResponse> createCrearSolicitudResponse(CrearSolicitudResponse value) {
        return new JAXBElement<CrearSolicitudResponse>(_CrearSolicitudResponse_QNAME, CrearSolicitudResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearSolicitud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "crearSolicitud")
    public JAXBElement<CrearSolicitud> createCrearSolicitud(CrearSolicitud value) {
        return new JAXBElement<CrearSolicitud>(_CrearSolicitud_QNAME, CrearSolicitud.class, null, value);
    }

}
