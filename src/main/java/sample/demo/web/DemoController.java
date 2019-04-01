package sample.demo.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class DemoController {

    @GetMapping("/demo/{id}")
    public String index(@PathVariable String id) {
        return "Hi I'm demo with "+id+"";
    }

}