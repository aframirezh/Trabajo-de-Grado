
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

    private final static QName _ActualizarSolicitud_QNAME = new QName("http://Servicios/", "actualizarSolicitud");
    private final static QName _ActualizarSolicitudResponse_QNAME = new QName("http://Servicios/", "actualizarSolicitudResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarSolicitudResponse }
     * 
     */
    public ActualizarSolicitudResponse createActualizarSolicitudResponse() {
        return new ActualizarSolicitudResponse();
    }

    /**
     * Create an instance of {@link ActualizarSolicitud }
     * 
     */
    public ActualizarSolicitud createActualizarSolicitud() {
        return new ActualizarSolicitud();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarSolicitud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "actualizarSolicitud")
    public JAXBElement<ActualizarSolicitud> createActualizarSolicitud(ActualizarSolicitud value) {
        return new JAXBElement<ActualizarSolicitud>(_ActualizarSolicitud_QNAME, ActualizarSolicitud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarSolicitudResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "actualizarSolicitudResponse")
    public JAXBElement<ActualizarSolicitudResponse> createActualizarSolicitudResponse(ActualizarSolicitudResponse value) {
        return new JAXBElement<ActualizarSolicitudResponse>(_ActualizarSolicitudResponse_QNAME, ActualizarSolicitudResponse.class, null, value);
    }

}
