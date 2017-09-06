package pl.oskarpolak.automatic.models.soap.clients;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import pl.oskarpolak.automatic.models.soap.basicservice.Login;
import pl.oskarpolak.automatic.models.soap.basicservice.LoginRequest;
import pl.oskarpolak.automatic.models.soap.basicservice.LoginResponse;
import pl.oskarpolak.automatic.models.soap.basicservice.LoginResponse2;

import javax.xml.transform.Result;


@Service
public class BasicClient extends WebServiceGatewaySupport {


    public BasicClient(){

        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("pl.oskarpolak.automatic.models.soap.basicservice");
        setDefaultUri("http://www.fleetboard.com/soap_v1_1/services/BasicService");
        setMarshaller(marshaller);
        setUnmarshaller(marshaller);

    }

    public LoginResponse login() {

        Login login = new Login();
        LoginRequest request = new LoginRequest();
        request.setUser("****");
        request.setFleetname("*****");
        request.setPassword("****");
        login.setLoginRequest(request);

        LoginResponse response = (LoginResponse) getWebServiceTemplate().marshalSendAndReceive(login);
      //  setDefaultUri("http://www.fleetboard.com/soap_v1_1/services/BasicService");
        return response;
    }




}