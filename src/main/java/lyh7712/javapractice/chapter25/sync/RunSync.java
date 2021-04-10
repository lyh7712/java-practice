package lyh7712.javapractice.chapter25.sync;

public class RunSync {
    public static void main(String args[]) {
        RunSync runSync = new RunSync();
//        for(int loop = 0; loop < 5; loop++) {
//            runSync.runCommonCalculate();
//        }
//        runSync.checkThreadState1();
        runSync.groupThread();
    }

    public void runCommonCalculate() {
        CommonCalculate calc = new CommonCalculate();
        ModifyAmountThread thread1 = new ModifyAmountThread(calc, true);
        ModifyAmountThread thread2 = new ModifyAmountThread(calc, true);

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
            System.out.println("Final value is " + calc.getAmount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void checkThreadState1() {
        SleepThread thread = new SleepThread(2000);
        try {
            System.out.println("thread state = " + thread.getState());
            thread.start();
            System.out.println("thread state(after start = " + thread.getState());

            Thread.sleep(1000);
            System.out.println("thread state(after 1sec) = " + thread.getState());

            thread.join();
            thread.interrupt();
            System.out.println("thread state(after join) = " + thread.getState());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkThreadState2() {
        Object moniter = new Object();
        StateThread thread = new StateThread(moniter);

        try {
            System.out.println("thread state = " + thread.getState());
            thread.start();
            System.out.println("thread state(after start) = " + thread.getState());

            Thread.sleep(100);
            System.out.println("thread state(after 0.1 sec) = " + thread.getState());

            synchronized (moniter) {
                moniter.notify();
            }

            Thread.sleep(100);
            System.out.println("thread state(after notify) = " + thread.getState());

            thread.join();
            System.out.println("thread state(after join) = " + thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkThreadState3() {
        Object moniter = new Object();
        StateThread thread = new StateThread(moniter);
        StateThread thread2 = new StateThread(moniter);

        try {
            System.out.println("thread state = " + thread.getState());
            thread.start();
            thread2.start();
            System.out.println("thread state(after start) = " + thread.getState());

            Thread.sleep(100);
            System.out.println("thread state(after 0.1 sec) = " + thread.getState());

            synchronized (moniter) {
//                moniter.notify();
//                moniter.notify();
                moniter.notifyAll();
            }

            Thread.sleep(100);
            System.out.println("thread state(after notify) = " + thread.getState());

            thread.join();
            System.out.println("thread state(after join) = " + thread.getState());
            thread2.join();
            System.out.println("thread2 state(after join) = " + thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void groupThread() {
        try {
            SleepThread sleep1 = new SleepThread(5000);
            SleepThread sleep2 = new SleepThread(5000);

            ThreadGroup group = new ThreadGroup("Group1");
            Thread thread1 = new Thread(group, sleep1);
            Thread thread2 = new Thread(group, sleep2);

            thread1.start();
            thread2.start();

            System.out.println("Group name = " + group.getName());
            int activeCount = group.activeCount();
            System.out.println("Active count= " + activeCount);
            group.list();

            Thread[] tempThreadList = new Thread[activeCount];
            int result = group.enumerate(tempThreadList);
            System.out.println("Enumerate result = " + result);
            for (Thread thread : tempThreadList) {
                System.out.println(thread);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
