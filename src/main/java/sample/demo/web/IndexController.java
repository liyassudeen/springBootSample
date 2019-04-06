package sample.demo.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import sample.demo.config.*;

@RestController
public class IndexController {

    @Autowired
    mainBean mainbean ;

    @GetMapping("/index")
    public String index() {
        return mainbean.mainBean();
    }

}