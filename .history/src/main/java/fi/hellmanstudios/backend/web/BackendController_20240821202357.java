package fi.hellmanstudios.backend.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BackendController {

    @RequestMapping("/")
    @ResponseBody
    public String showMessage() {
        return "Eka SB Sovellukseni";
    }

    @RequestMapping("/index")
    @ResponseBody
    public String showIndex() {
        return "This is the main page";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String showHello(@RequestParam (defaultValue = "nowhere") String location, @RequestParam (defaultValue = "nobody") String name) {
        String message = (location.equalsIgnoreCase("nowhere")) ? location : "to the " + location;
        return "Welcome " + message + " " + name + "!";
    }
    

}
