
package wsejb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsejb package. 
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

    private final static QName _SumaDos_QNAME = new QName("http://WSejb/", "sumaDos");
    private final static QName _HelloResponse_QNAME = new QName("http://WSejb/", "helloResponse");
    private final static QName _GetResultEjbResponse_QNAME = new QName("http://WSejb/", "getResult_ejbResponse");
    private final static QName _Hello_QNAME = new QName("http://WSejb/", "hello");
    private final static QName _SumaDosResponse_QNAME = new QName("http://WSejb/", "sumaDosResponse");
    private final static QName _GetResultEjb_QNAME = new QName("http://WSejb/", "getResult_ejb");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SumaDos }
     * 
     */
    public SumaDos createSumaDos() {
        return new SumaDos();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link GetResultEjbResponse }
     * 
     */
    public GetResultEjbResponse createGetResultEjbResponse() {
        return new GetResultEjbResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link SumaDosResponse }
     * 
     */
    public SumaDosResponse createSumaDosResponse() {
        return new SumaDosResponse();
    }

    /**
     * Create an instance of {@link GetResultEjb }
     * 
     */
    public GetResultEjb createGetResultEjb() {
        return new GetResultEjb();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumaDos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSejb/", name = "sumaDos")
    public JAXBElement<SumaDos> createSumaDos(SumaDos value) {
        return new JAXBElement<SumaDos>(_SumaDos_QNAME, SumaDos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSejb/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultEjbResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSejb/", name = "getResult_ejbResponse")
    public JAXBElement<GetResultEjbResponse> createGetResultEjbResponse(GetResultEjbResponse value) {
        return new JAXBElement<GetResultEjbResponse>(_GetResultEjbResponse_QNAME, GetResultEjbResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSejb/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumaDosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSejb/", name = "sumaDosResponse")
    public JAXBElement<SumaDosResponse> createSumaDosResponse(SumaDosResponse value) {
        return new JAXBElement<SumaDosResponse>(_SumaDosResponse_QNAME, SumaDosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultEjb }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSejb/", name = "getResult_ejb")
    public JAXBElement<GetResultEjb> createGetResultEjb(GetResultEjb value) {
        return new JAXBElement<GetResultEjb>(_GetResultEjb_QNAME, GetResultEjb.class, null, value);
    }

}
