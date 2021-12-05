
package person.data;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import net.java.dev.jaxb.array.StringArray;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PersonInformationWS", targetNamespace = "http://data.person/")
@XmlSeeAlso({
    net.java.dev.jaxb.array.ObjectFactory.class,
    person.data.ObjectFactory.class
})
public interface PersonInformationWS {


    /**
     * 
     * @param id
     */
    @WebMethod
    @RequestWrapper(localName = "delete", targetNamespace = "http://data.person/", className = "person.data.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://data.person/", className = "person.data.DeleteResponse")
    @Action(input = "http://data.person/PersonInformationWS/deleteRequest", output = "http://data.person/PersonInformationWS/deleteResponse")
    public void delete(
        @WebParam(name = "id", targetNamespace = "")
        Integer id);

    /**
     * 
     * @param fullname
     * @return
     *     returns java.util.List<net.java.dev.jaxb.array.StringArray>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "selectPersonInformationByFilterByFullname", targetNamespace = "http://data.person/", className = "person.data.SelectPersonInformationByFilterByFullname")
    @ResponseWrapper(localName = "selectPersonInformationByFilterByFullnameResponse", targetNamespace = "http://data.person/", className = "person.data.SelectPersonInformationByFilterByFullnameResponse")
    @Action(input = "http://data.person/PersonInformationWS/selectPersonInformationByFilterByFullnameRequest", output = "http://data.person/PersonInformationWS/selectPersonInformationByFilterByFullnameResponse")
    public List<StringArray> selectPersonInformationByFilterByFullname(
        @WebParam(name = "fullname", targetNamespace = "")
        String fullname);

    /**
     * 
     * @param birtdate
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAge", targetNamespace = "http://data.person/", className = "person.data.GetAge")
    @ResponseWrapper(localName = "getAgeResponse", targetNamespace = "http://data.person/", className = "person.data.GetAgeResponse")
    @Action(input = "http://data.person/PersonInformationWS/getAgeRequest", output = "http://data.person/PersonInformationWS/getAgeResponse")
    public int getAge(
        @WebParam(name = "birtdate", targetNamespace = "")
        String birtdate);

    /**
     * 
     * @param firstname
     * @param birthdate
     * @param id
     * @param lastname
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updatePersonProfile", targetNamespace = "http://data.person/", className = "person.data.UpdatePersonProfile")
    @ResponseWrapper(localName = "updatePersonProfileResponse", targetNamespace = "http://data.person/", className = "person.data.UpdatePersonProfileResponse")
    @Action(input = "http://data.person/PersonInformationWS/updatePersonProfileRequest", output = "http://data.person/PersonInformationWS/updatePersonProfileResponse")
    public String updatePersonProfile(
        @WebParam(name = "id", targetNamespace = "")
        Integer id,
        @WebParam(name = "firstname", targetNamespace = "")
        String firstname,
        @WebParam(name = "lastname", targetNamespace = "")
        String lastname,
        @WebParam(name = "birthdate", targetNamespace = "")
        String birthdate);

    /**
     * 
     * @return
     *     returns java.util.List<net.java.dev.jaxb.array.StringArray>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "selectAllPersonInformation", targetNamespace = "http://data.person/", className = "person.data.SelectAllPersonInformation")
    @ResponseWrapper(localName = "selectAllPersonInformationResponse", targetNamespace = "http://data.person/", className = "person.data.SelectAllPersonInformationResponse")
    @Action(input = "http://data.person/PersonInformationWS/selectAllPersonInformationRequest", output = "http://data.person/PersonInformationWS/selectAllPersonInformationResponse")
    public List<StringArray> selectAllPersonInformation();

    /**
     * 
     * @param firstname
     * @param birthdate
     * @param lastname
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertPersonProfile", targetNamespace = "http://data.person/", className = "person.data.InsertPersonProfile")
    @ResponseWrapper(localName = "insertPersonProfileResponse", targetNamespace = "http://data.person/", className = "person.data.InsertPersonProfileResponse")
    @Action(input = "http://data.person/PersonInformationWS/insertPersonProfileRequest", output = "http://data.person/PersonInformationWS/insertPersonProfileResponse")
    public String insertPersonProfile(
        @WebParam(name = "firstname", targetNamespace = "")
        String firstname,
        @WebParam(name = "lastname", targetNamespace = "")
        String lastname,
        @WebParam(name = "birthdate", targetNamespace = "")
        String birthdate);

    /**
     * 
     * @param id
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "selectPersonInformationByID", targetNamespace = "http://data.person/", className = "person.data.SelectPersonInformationByID")
    @ResponseWrapper(localName = "selectPersonInformationByIDResponse", targetNamespace = "http://data.person/", className = "person.data.SelectPersonInformationByIDResponse")
    @Action(input = "http://data.person/PersonInformationWS/selectPersonInformationByIDRequest", output = "http://data.person/PersonInformationWS/selectPersonInformationByIDResponse")
    public List<String> selectPersonInformationByID(
        @WebParam(name = "id", targetNamespace = "")
        Integer id);

}
