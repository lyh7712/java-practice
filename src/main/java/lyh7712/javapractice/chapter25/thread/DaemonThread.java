package lyh7712.javapractice.chapter25.thread;

public class DaemonThread extends Thread {

    public void run() {
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
