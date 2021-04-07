package lyh7712.javapractice.chapter9;

public class Main {

    public static void main(String args[]) {
        AccessModifier acc = new AccessModifier();
        acc.publicMethod();
        acc.protectedMethod();
        acc.packagePrivateMethod();
//        acc.privateMethod(); //Error 같은 클래스 안에서만 접근가능
    }
}
