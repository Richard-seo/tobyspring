package tobyspring.helloboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloServiceTest {
    @Test
    void SimpleHelloService() {
        SimpleHelloService helloService = new SimpleHelloService();

        String ret = helloService.sayHello("Test");
        Assertions.assertThat(ret).isEqualTo("Hello Test");
    }

    @Test
    void helloDecorator() {
        HelloController decorator = new HelloController(name -> name);

        String ret = decorator.hello("Test");
        Assertions.assertThat(ret).isEqualTo("Test");
    }

    @Test
    void 데코레이터_테스트() {
        HelloDecorator decorator = new HelloDecorator(name -> name);
        String ret = decorator.sayHello("test");

        Assertions.assertThat(ret).isEqualTo("*test*");
    }
}
