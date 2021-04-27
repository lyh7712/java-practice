package lyh7712.javapractice.oopchapter6.adapterPattern;

public class AdapterServiceA {
    ServiceA sa1 = new ServiceA();

    void runService() {
        sa1.runServiceA();
    }
}
