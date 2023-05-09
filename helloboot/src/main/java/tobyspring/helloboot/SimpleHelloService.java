package tobyspring.helloboot;

import org.springframework.stereotype.Service;

@Service
public class SimpleHelloService implements HelloService {
    //단일 주입 후보
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
