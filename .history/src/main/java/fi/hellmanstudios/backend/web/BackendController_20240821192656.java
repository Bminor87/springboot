package fi.hellmanstudios.backend.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BackendController {

    @RequestMapping("/main")
    @ResponseBody
    public String showMessage() {
        return "Eka SB Sovellukseni";
    }
    

}
