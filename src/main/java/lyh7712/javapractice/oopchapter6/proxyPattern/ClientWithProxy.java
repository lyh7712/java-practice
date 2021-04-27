package lyh7712.javapractice.oopchapter6.proxyPattern;

public class ClientWithProxy {
    public static void main(String args[]) {
        //프록시를 이용한 호출
        IService proxy = new Proxy();
        System.out.println(proxy.runSomething());
    }
}
