package sample.demo.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public String index() {
        return "Hi I'm demo";
    }

}