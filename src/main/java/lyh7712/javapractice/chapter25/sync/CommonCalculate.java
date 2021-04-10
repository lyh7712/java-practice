package lyh7712.javapractice.chapter25.sync;

public class CommonCalculate {

    private int amount; //인스턴스 변수
    private int interest;

    private Object interestLock = new Object();
    private Object amountLock = new Object();

    public void addInterest(int value) {
        synchronized (interestLock) {
            interest += value;
        }
    }

    public void plus(int value) {
        synchronized (amountLock) {
            amount += value;
        }
    }

    public CommonCalculate() {
        amount = 0;
    }
//    public synchronized void plus(int value) {
//        amount += value;
//    }
//    public synchronized void minus(int value) {
//        amount -= value;
//    }


    public int getAmount() {
        return amount;
    }

    public int getInterest() {
        return interest;
    }
}
