
package utng.pcamacho.services.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the utng.pcamacho.services.webservices package. 
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

    private final static QName _BuscarLibros_QNAME = new QName("http://webservices.services.pcamacho.utng/", "BuscarLibros");
    private final static QName _BuscarLibrosResponse_QNAME = new QName("http://webservices.services.pcamacho.utng/", "BuscarLibrosResponse");
    private final static QName _ConsultarLibros_QNAME = new QName("http://webservices.services.pcamacho.utng/", "ConsultarLibros");
    private final static QName _ConsultarLibrosResponse_QNAME = new QName("http://webservices.services.pcamacho.utng/", "ConsultarLibrosResponse");
    private final static QName _IngresarLibros_QNAME = new QName("http://webservices.services.pcamacho.utng/", "IngresarLibros");
    private final static QName _IngresarLibrosResponse_QNAME = new QName("http://webservices.services.pcamacho.utng/", "IngresarLibrosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: utng.pcamacho.services.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarLibros }
     * 
     */
    public BuscarLibros createBuscarLibros() {
        return new BuscarLibros();
    }

    /**
     * Create an instance of {@link BuscarLibrosResponse }
     * 
     */
    public BuscarLibrosResponse createBuscarLibrosResponse() {
        return new BuscarLibrosResponse();
    }

    /**
     * Create an instance of {@link ConsultarLibros }
     * 
     */
    public ConsultarLibros createConsultarLibros() {
        return new ConsultarLibros();
    }

    /**
     * Create an instance of {@link ConsultarLibrosResponse }
     * 
     */
    public ConsultarLibrosResponse createConsultarLibrosResponse() {
        return new ConsultarLibrosResponse();
    }

    /**
     * Create an instance of {@link IngresarLibros }
     * 
     */
    public IngresarLibros createIngresarLibros() {
        return new IngresarLibros();
    }

    /**
     * Create an instance of {@link IngresarLibrosResponse }
     * 
     */
    public IngresarLibrosResponse createIngresarLibrosResponse() {
        return new IngresarLibrosResponse();
    }

    /**
     * Create an instance of {@link Libros }
     * 
     */
    public Libros createLibros() {
        return new Libros();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarLibros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.pcamacho.utng/", name = "BuscarLibros")
    public JAXBElement<BuscarLibros> createBuscarLibros(BuscarLibros value) {
        return new JAXBElement<BuscarLibros>(_BuscarLibros_QNAME, BuscarLibros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarLibrosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.pcamacho.utng/", name = "BuscarLibrosResponse")
    public JAXBElement<BuscarLibrosResponse> createBuscarLibrosResponse(BuscarLibrosResponse value) {
        return new JAXBElement<BuscarLibrosResponse>(_BuscarLibrosResponse_QNAME, BuscarLibrosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarLibros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.pcamacho.utng/", name = "ConsultarLibros")
    public JAXBElement<ConsultarLibros> createConsultarLibros(ConsultarLibros value) {
        return new JAXBElement<ConsultarLibros>(_ConsultarLibros_QNAME, ConsultarLibros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarLibrosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.pcamacho.utng/", name = "ConsultarLibrosResponse")
    public JAXBElement<ConsultarLibrosResponse> createConsultarLibrosResponse(ConsultarLibrosResponse value) {
        return new JAXBElement<ConsultarLibrosResponse>(_ConsultarLibrosResponse_QNAME, ConsultarLibrosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarLibros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.pcamacho.utng/", name = "IngresarLibros")
    public JAXBElement<IngresarLibros> createIngresarLibros(IngresarLibros value) {
        return new JAXBElement<IngresarLibros>(_IngresarLibros_QNAME, IngresarLibros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarLibrosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.pcamacho.utng/", name = "IngresarLibrosResponse")
    public JAXBElement<IngresarLibrosResponse> createIngresarLibrosResponse(IngresarLibrosResponse value) {
        return new JAXBElement<IngresarLibrosResponse>(_IngresarLibrosResponse_QNAME, IngresarLibrosResponse.class, null, value);
    }

}
