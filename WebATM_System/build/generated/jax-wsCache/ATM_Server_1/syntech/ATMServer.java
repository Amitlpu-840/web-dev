
package syntech;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ATM_Server", targetNamespace = "http://syntech/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ATMServer {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://syntech/", className = "syntech.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://syntech/", className = "syntech.HelloResponse")
    @Action(input = "http://syntech/ATM_Server/helloRequest", output = "http://syntech/ATM_Server/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param cardno
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cardNo", targetNamespace = "http://syntech/", className = "syntech.CardNo")
    @ResponseWrapper(localName = "cardNoResponse", targetNamespace = "http://syntech/", className = "syntech.CardNoResponse")
    @Action(input = "http://syntech/ATM_Server/cardNoRequest", output = "http://syntech/ATM_Server/cardNoResponse")
    public List<Object> cardNo(
        @WebParam(name = "cardno", targetNamespace = "")
        String cardno);

    /**
     * 
     * @param date
     * @param amount
     * @param des
     * @param time
     * @param acno
     */
    @WebMethod
    @RequestWrapper(localName = "widthdraw", targetNamespace = "http://syntech/", className = "syntech.Widthdraw")
    @ResponseWrapper(localName = "widthdrawResponse", targetNamespace = "http://syntech/", className = "syntech.WidthdrawResponse")
    @Action(input = "http://syntech/ATM_Server/widthdrawRequest", output = "http://syntech/ATM_Server/widthdrawResponse")
    public void widthdraw(
        @WebParam(name = "acno", targetNamespace = "")
        String acno,
        @WebParam(name = "amount", targetNamespace = "")
        String amount,
        @WebParam(name = "date", targetNamespace = "")
        String date,
        @WebParam(name = "time", targetNamespace = "")
        String time,
        @WebParam(name = "des", targetNamespace = "")
        String des);

}
