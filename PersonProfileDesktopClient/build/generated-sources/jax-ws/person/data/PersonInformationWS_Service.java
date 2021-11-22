
package person.data;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PersonInformationWS", targetNamespace = "http://data.person/", wsdlLocation = "http://localhost:8084/PersonProfilesWS/PersonInformationWS?wsdl")
public class PersonInformationWS_Service
    extends Service
{

    private final static URL PERSONINFORMATIONWS_WSDL_LOCATION;
    private final static WebServiceException PERSONINFORMATIONWS_EXCEPTION;
    private final static QName PERSONINFORMATIONWS_QNAME = new QName("http://data.person/", "PersonInformationWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8084/PersonProfilesWS/PersonInformationWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PERSONINFORMATIONWS_WSDL_LOCATION = url;
        PERSONINFORMATIONWS_EXCEPTION = e;
    }

    public PersonInformationWS_Service() {
        super(__getWsdlLocation(), PERSONINFORMATIONWS_QNAME);
    }

    public PersonInformationWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PERSONINFORMATIONWS_QNAME, features);
    }

    public PersonInformationWS_Service(URL wsdlLocation) {
        super(wsdlLocation, PERSONINFORMATIONWS_QNAME);
    }

    public PersonInformationWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PERSONINFORMATIONWS_QNAME, features);
    }

    public PersonInformationWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonInformationWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PersonInformationWS
     */
    @WebEndpoint(name = "PersonInformationWSPort")
    public PersonInformationWS getPersonInformationWSPort() {
        return super.getPort(new QName("http://data.person/", "PersonInformationWSPort"), PersonInformationWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PersonInformationWS
     */
    @WebEndpoint(name = "PersonInformationWSPort")
    public PersonInformationWS getPersonInformationWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://data.person/", "PersonInformationWSPort"), PersonInformationWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PERSONINFORMATIONWS_EXCEPTION!= null) {
            throw PERSONINFORMATIONWS_EXCEPTION;
        }
        return PERSONINFORMATIONWS_WSDL_LOCATION;
    }

}
