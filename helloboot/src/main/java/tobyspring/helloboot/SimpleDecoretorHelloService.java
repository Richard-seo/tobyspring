package tobyspring.helloboot;

public class SimpleDecoretorHelloService extends HelloDecorator{
    public SimpleDecoretorHelloService(HelloService helloService) {
        super(helloService);
    }

    @Override
    public String sayHello(String name) {
        logPrint();
        return name + " add decorator";
    }

    public void logPrint() {
        System.out.println("print");
    }
}
