package pl.oskarpolak.automatic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.oskarpolak.automatic.models.soap.clients.BasicClient;

@Controller
public class MainController {


    @Autowired
    BasicClient basicClient;

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return basicClient.login().getLoginResponse().getSessionid();
    }

}
