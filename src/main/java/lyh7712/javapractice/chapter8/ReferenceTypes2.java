package lyh7712.javapractice.chapter8;

public class ReferenceTypes2 {
    public static void main(String args[]) {
        ReferenceTypes2 reference = new ReferenceTypes2();

        System.out.println(reference.intReturn());
    }

    //메소드에서 값을 넘겨주기
    public int intReturn() {
        int intVal = 0;
        if (intVal == 0) {
            return ++intVal;
        } else {
            return --intVal;
        }
    }
}
