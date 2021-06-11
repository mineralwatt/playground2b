package team.spring.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PdsController {

    @GetMapping("/pds/list")
    public String list(){
        return "/pds/list";
    }

    @GetMapping("/pds/write")
    public String write(){
        return "/pds/write";
    }

    @GetMapping("/pds/view")
    public String view(){
        return "/pds/view";
    }


}
