package sample.demo.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class subBean
{
    
    public String subBean()
    {
        return "hello world";
    }
}