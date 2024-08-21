package fi.hellmanstudios.backend.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BackendController {

    @RequestMapping("/main")
    @ResponseBody
    public String showMessage() {
        return "Eka SB Sovellukseni";
    }

    @RequestMapping("/index")
    @ResponseBody
    public String showIndex() {
        return "Tämä on index";
    }

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(@RequestParam(defaultValue="Stranger") String name) {
        return "Hello " + name;
    }
    

}
