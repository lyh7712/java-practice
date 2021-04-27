package lyh7712.javapractice.oopchapter6.adapterPattern;

public class ClientWithNoAdapter {
    public static void main(String args[]) {
        AdapterServiceA asa1 = new AdapterServiceA();
        AdapterServiceB bsb1 = new AdapterServiceB();

        asa1.runService();
        bsb1.runService();
    }
}
