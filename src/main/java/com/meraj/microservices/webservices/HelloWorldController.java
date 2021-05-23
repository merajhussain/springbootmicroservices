package com.meraj.microservices.webservices;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {



   // @RequestMapping(method= RequestMethod.GET,path="/hello-world")
    @GetMapping(path="/hello-world")
    public String HelloWorld( )
    {
        Logger log = LoggerFactory.getLogger(HelloWorldController.class);
        log.info("request received , hello world");
        return "hello word";
    }

    @GetMapping(path="hello-world-bean")
    public HelloWorldBean helloWorldBean()
    {
        return new HelloWorldBean("hello world bean");
    }

    @GetMapping(path="/hello-world-bean/var/{var}")
    public HelloWorldBean helloWorldBeanUsingPath(@PathVariable String var)
    {
        return new HelloWorldBean(String.format("hello world, %s",var));
    }


}
