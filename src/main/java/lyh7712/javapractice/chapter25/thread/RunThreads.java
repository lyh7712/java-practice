package lyh7712.javapractice.chapter25.thread;

public class RunThreads {

    public static void main(String args[]) {
        RunThreads threads = new RunThreads();
        threads.runLocalUserThread();


    }

    public void endless() {
        EndlessThread thread = new EndlessThread();
        thread.start();
    }

    public void checkThreadProperty() {
        ThreadSample thread1 = new ThreadSample();
        ThreadSample thread2 = new ThreadSample();
        ThreadSample thread3 = new ThreadSample();

        System.out.println("thread1 id = " + thread1.getId());
        System.out.println("thread2 id = " + thread2.getId());

        System.out.println("thread1 name = " + thread1.getName());
        System.out.println("thread2 name = " + thread2.getName());

        System.out.println("thread1 priority = " + thread1.getPriority());

    }

    public void runDaemonThread() {
        DaemonThread thread = new DaemonThread();
        thread.setDaemon(true);
        thread.start();
    }

    public void runLocalUserThread() {
        LocalUserThread threads[] = new LocalUserThread[3];
        for (LocalUserThread thread : threads) {
            thread = new LocalUserThread();
            thread.start();
        }
    }
}
