package springBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JustController {

    @GetMapping("/")
    public String index() {
        return "Main page!";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello!!!!";
    }
}
