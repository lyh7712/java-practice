package lyh7712.javapractice.chapter25.thread;

public class OtherLogic {
    public void printMyNumber() {
        System.out.println(Thread.currentThread().getName() + " OtherLogic value = " + ThreadLocalSample.get());
    }
}
