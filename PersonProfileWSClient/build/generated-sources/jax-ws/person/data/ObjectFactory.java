
package person.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the person.data package. 
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

    private final static QName _InsertPersonProfileResponse_QNAME = new QName("http://data.person/", "insertPersonProfileResponse");
    private final static QName _SelectAllPersonInformation_QNAME = new QName("http://data.person/", "selectAllPersonInformation");
    private final static QName _GetAge_QNAME = new QName("http://data.person/", "getAge");
    private final static QName _GetAgeResponse_QNAME = new QName("http://data.person/", "getAgeResponse");
    private final static QName _SelectPersonInformationByFilterByFullname_QNAME = new QName("http://data.person/", "selectPersonInformationByFilterByFullname");
    private final static QName _SelectPersonInformationByFilterByFullnameResponse_QNAME = new QName("http://data.person/", "selectPersonInformationByFilterByFullnameResponse");
    private final static QName _SelectPersonInformationById_QNAME = new QName("http://data.person/", "selectPersonInformationById");
    private final static QName _SelectPersonInformationByIdResponse_QNAME = new QName("http://data.person/", "selectPersonInformationByIdResponse");
    private final static QName _SelectAllPersonInformationResponse_QNAME = new QName("http://data.person/", "selectAllPersonInformationResponse");
    private final static QName _InsertPersonProfile_QNAME = new QName("http://data.person/", "insertPersonProfile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: person.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SelectPersonInformationByFilterByFullname }
     * 
     */
    public SelectPersonInformationByFilterByFullname createSelectPersonInformationByFilterByFullname() {
        return new SelectPersonInformationByFilterByFullname();
    }

    /**
     * Create an instance of {@link GetAge }
     * 
     */
    public GetAge createGetAge() {
        return new GetAge();
    }

    /**
     * Create an instance of {@link GetAgeResponse }
     * 
     */
    public GetAgeResponse createGetAgeResponse() {
        return new GetAgeResponse();
    }

    /**
     * Create an instance of {@link SelectAllPersonInformation }
     * 
     */
    public SelectAllPersonInformation createSelectAllPersonInformation() {
        return new SelectAllPersonInformation();
    }

    /**
     * Create an instance of {@link InsertPersonProfileResponse }
     * 
     */
    public InsertPersonProfileResponse createInsertPersonProfileResponse() {
        return new InsertPersonProfileResponse();
    }

    /**
     * Create an instance of {@link InsertPersonProfile }
     * 
     */
    public InsertPersonProfile createInsertPersonProfile() {
        return new InsertPersonProfile();
    }

    /**
     * Create an instance of {@link SelectAllPersonInformationResponse }
     * 
     */
    public SelectAllPersonInformationResponse createSelectAllPersonInformationResponse() {
        return new SelectAllPersonInformationResponse();
    }

    /**
     * Create an instance of {@link SelectPersonInformationByIdResponse }
     * 
     */
    public SelectPersonInformationByIdResponse createSelectPersonInformationByIdResponse() {
        return new SelectPersonInformationByIdResponse();
    }

    /**
     * Create an instance of {@link SelectPersonInformationByFilterByFullnameResponse }
     * 
     */
    public SelectPersonInformationByFilterByFullnameResponse createSelectPersonInformationByFilterByFullnameResponse() {
        return new SelectPersonInformationByFilterByFullnameResponse();
    }

    /**
     * Create an instance of {@link SelectPersonInformationById }
     * 
     */
    public SelectPersonInformationById createSelectPersonInformationById() {
        return new SelectPersonInformationById();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPersonProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.person/", name = "insertPersonProfileResponse")
    public JAXBElement<InsertPersonProfileResponse> createInsertPersonProfileResponse(InsertPersonProfileResponse value) {
        return new JAXBElement<InsertPersonProfileResponse>(_InsertPersonProfileResponse_QNAME, InsertPersonProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectAllPersonInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.person/", name = "selectAllPersonInformation")
    public JAXBElement<SelectAllPersonInformation> createSelectAllPersonInformation(SelectAllPersonInformation value) {
        return new JAXBElement<SelectAllPersonInformation>(_SelectAllPersonInformation_QNAME, SelectAllPersonInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.person/", name = "getAge")
    public JAXBElement<GetAge> createGetAge(GetAge value) {
        return new JAXBElement<GetAge>(_GetAge_QNAME, GetAge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.person/", name = "getAgeResponse")
    public JAXBElement<GetAgeResponse> createGetAgeResponse(GetAgeResponse value) {
        return new JAXBElement<GetAgeResponse>(_GetAgeResponse_QNAME, GetAgeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectPersonInformationByFilterByFullname }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.person/", name = "selectPersonInformationByFilterByFullname")
    public JAXBElement<SelectPersonInformationByFilterByFullname> createSelectPersonInformationByFilterByFullname(SelectPersonInformationByFilterByFullname value) {
        return new JAXBElement<SelectPersonInformationByFilterByFullname>(_SelectPersonInformationByFilterByFullname_QNAME, SelectPersonInformationByFilterByFullname.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectPersonInformationByFilterByFullnameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.person/", name = "selectPersonInformationByFilterByFullnameResponse")
    public JAXBElement<SelectPersonInformationByFilterByFullnameResponse> createSelectPersonInformationByFilterByFullnameResponse(SelectPersonInformationByFilterByFullnameResponse value) {
        return new JAXBElement<SelectPersonInformationByFilterByFullnameResponse>(_SelectPersonInformationByFilterByFullnameResponse_QNAME, SelectPersonInformationByFilterByFullnameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectPersonInformationById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.person/", name = "selectPersonInformationById")
    public JAXBElement<SelectPersonInformationById> createSelectPersonInformationById(SelectPersonInformationById value) {
        return new JAXBElement<SelectPersonInformationById>(_SelectPersonInformationById_QNAME, SelectPersonInformationById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectPersonInformationByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.person/", name = "selectPersonInformationByIdResponse")
    public JAXBElement<SelectPersonInformationByIdResponse> createSelectPersonInformationByIdResponse(SelectPersonInformationByIdResponse value) {
        return new JAXBElement<SelectPersonInformationByIdResponse>(_SelectPersonInformationByIdResponse_QNAME, SelectPersonInformationByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectAllPersonInformationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.person/", name = "selectAllPersonInformationResponse")
    public JAXBElement<SelectAllPersonInformationResponse> createSelectAllPersonInformationResponse(SelectAllPersonInformationResponse value) {
        return new JAXBElement<SelectAllPersonInformationResponse>(_SelectAllPersonInformationResponse_QNAME, SelectAllPersonInformationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPersonProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.person/", name = "insertPersonProfile")
    public JAXBElement<InsertPersonProfile> createInsertPersonProfile(InsertPersonProfile value) {
        return new JAXBElement<InsertPersonProfile>(_InsertPersonProfile_QNAME, InsertPersonProfile.class, null, value);
    }

}
