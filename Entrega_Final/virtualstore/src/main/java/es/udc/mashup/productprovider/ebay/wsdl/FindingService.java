
package es.udc.mashup.productprovider.ebay.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "FindingService", targetNamespace = "http://www.ebay.com/marketplace/search/v1/services", wsdlLocation = "file:/home/raicar/Desktop/Untitled%20Folder/tags/Entrega_Final/virtualstore/src/main/resources/FindingService.wsdl")
public class FindingService
    extends Service
{

    private final static URL FINDINGSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(es.udc.mashup.productprovider.ebay.wsdl.FindingService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = es.udc.mashup.productprovider.ebay.wsdl.FindingService.class.getResource(".");
            url = new URL(baseUrl, "file:/home/raicar/Desktop/Untitled%20Folder/tags/Entrega_Final/virtualstore/src/main/resources/FindingService.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/home/raicar/Desktop/Untitled%20Folder/tags/Entrega_Final/virtualstore/src/main/resources/FindingService.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        FINDINGSERVICE_WSDL_LOCATION = url;
    }

    public FindingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FindingService() {
        super(FINDINGSERVICE_WSDL_LOCATION, new QName("http://www.ebay.com/marketplace/search/v1/services", "FindingService"));
    }

    /**
     * 
     * @return
     *     returns FindingServicePortType
     */
    @WebEndpoint(name = "FindingServiceSOAPPort")
    public FindingServicePortType getFindingServiceSOAPPort() {
        return super.getPort(new QName("http://www.ebay.com/marketplace/search/v1/services", "FindingServiceSOAPPort"), FindingServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FindingServicePortType
     */
    @WebEndpoint(name = "FindingServiceSOAPPort")
    public FindingServicePortType getFindingServiceSOAPPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.ebay.com/marketplace/search/v1/services", "FindingServiceSOAPPort"), FindingServicePortType.class, features);
    }

}
