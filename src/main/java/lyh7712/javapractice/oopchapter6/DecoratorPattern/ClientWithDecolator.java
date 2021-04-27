package lyh7712.javapractice.oopchapter6.DecoratorPattern;

public class ClientWithDecolator {
    public static void main(String args[]) {
        IService decorator = new Decorator();
        System.out.println(decorator.runSomething());
    }
}
