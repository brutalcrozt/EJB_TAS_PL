
package ws;

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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DataService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DataService {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "say", targetNamespace = "http://ws/", className = "ws.Say")
    @ResponseWrapper(localName = "sayResponse", targetNamespace = "http://ws/", className = "ws.SayResponse")
    @Action(input = "http://ws/DataService/sayRequest", output = "http://ws/DataService/sayResponse")
    public String say();

    /**
     * 
     * @param identifier
     * @param dataType
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getData", targetNamespace = "http://ws/", className = "ws.GetData")
    @ResponseWrapper(localName = "getDataResponse", targetNamespace = "http://ws/", className = "ws.GetDataResponse")
    @Action(input = "http://ws/DataService/getDataRequest", output = "http://ws/DataService/getDataResponse")
    public int getData(
        @WebParam(name = "dataType", targetNamespace = "")
        String dataType,
        @WebParam(name = "identifier", targetNamespace = "")
        String identifier);

}
