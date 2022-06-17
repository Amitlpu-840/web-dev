
package syntech;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the syntech package. 
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

    private final static QName _HelloResponse_QNAME = new QName("http://syntech/", "helloResponse");
    private final static QName _WidthdrawResponse_QNAME = new QName("http://syntech/", "widthdrawResponse");
    private final static QName _CardNo_QNAME = new QName("http://syntech/", "cardNo");
    private final static QName _Widthdraw_QNAME = new QName("http://syntech/", "widthdraw");
    private final static QName _UpdateResponse_QNAME = new QName("http://syntech/", "updateResponse");
    private final static QName _Update_QNAME = new QName("http://syntech/", "update");
    private final static QName _CardNoResponse_QNAME = new QName("http://syntech/", "cardNoResponse");
    private final static QName _Hello_QNAME = new QName("http://syntech/", "hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: syntech
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WidthdrawResponse }
     * 
     */
    public WidthdrawResponse createWidthdrawResponse() {
        return new WidthdrawResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link CardNoResponse }
     * 
     */
    public CardNoResponse createCardNoResponse() {
        return new CardNoResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link CardNo }
     * 
     */
    public CardNo createCardNo() {
        return new CardNo();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link Widthdraw }
     * 
     */
    public Widthdraw createWidthdraw() {
        return new Widthdraw();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://syntech/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WidthdrawResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://syntech/", name = "widthdrawResponse")
    public JAXBElement<WidthdrawResponse> createWidthdrawResponse(WidthdrawResponse value) {
        return new JAXBElement<WidthdrawResponse>(_WidthdrawResponse_QNAME, WidthdrawResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://syntech/", name = "cardNo")
    public JAXBElement<CardNo> createCardNo(CardNo value) {
        return new JAXBElement<CardNo>(_CardNo_QNAME, CardNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Widthdraw }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://syntech/", name = "widthdraw")
    public JAXBElement<Widthdraw> createWidthdraw(Widthdraw value) {
        return new JAXBElement<Widthdraw>(_Widthdraw_QNAME, Widthdraw.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://syntech/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://syntech/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardNoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://syntech/", name = "cardNoResponse")
    public JAXBElement<CardNoResponse> createCardNoResponse(CardNoResponse value) {
        return new JAXBElement<CardNoResponse>(_CardNoResponse_QNAME, CardNoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://syntech/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

}
