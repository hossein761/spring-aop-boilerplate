package nl.hossein.boilerplate;

import org.springframework.stereotype.Component;


@Component
public class HelloService {

    @Secured(SecurityLevel.HIGH)
    public String sayHello() {
        return "Hello world!";
    }
}
