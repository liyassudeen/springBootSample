package sample.demo.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class mainBean
{
    @Autowired
    subBean subbean;
    public String mainBean()
    {
        return subbean.subBean();
    }
}