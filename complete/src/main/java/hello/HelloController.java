package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "This is my Page MSK";
    }
    
    @RequestMapping("/tcs")
    public String index2() {
        return "You are on TCS";
    }
    
}
