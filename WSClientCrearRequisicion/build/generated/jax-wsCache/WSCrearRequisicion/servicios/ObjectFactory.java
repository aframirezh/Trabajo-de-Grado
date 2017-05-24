
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

    private final static QName _ParseException_QNAME = new QName("http://Servicios/", "ParseException");
    private final static QName _InsertarDB_QNAME = new QName("http://Servicios/", "insertarDB");
    private final static QName _InsertarDBResponse_QNAME = new QName("http://Servicios/", "insertarDBResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertarDB }
     * 
     */
    public InsertarDB createInsertarDB() {
        return new InsertarDB();
    }

    /**
     * Create an instance of {@link InsertarDBResponse }
     * 
     */
    public InsertarDBResponse createInsertarDBResponse() {
        return new InsertarDBResponse();
    }

    /**
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "insertarDB")
    public JAXBElement<InsertarDB> createInsertarDB(InsertarDB value) {
        return new JAXBElement<InsertarDB>(_InsertarDB_QNAME, InsertarDB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarDBResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "insertarDBResponse")
    public JAXBElement<InsertarDBResponse> createInsertarDBResponse(InsertarDBResponse value) {
        return new JAXBElement<InsertarDBResponse>(_InsertarDBResponse_QNAME, InsertarDBResponse.class, null, value);
    }

}
