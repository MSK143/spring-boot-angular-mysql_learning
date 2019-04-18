package hello.controller;

import org.springframework.web.bind.annotation.RestController;

import hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/")
    public String index() {
        return "This is my Page MSK";
    }

    @RequestMapping("/add")
    public int index2(@RequestBody String bean) {
        return helloService.add(bean);
    }

    @RequestMapping("/get")
    public String index3() {
        return helloService.get();
    }

}
