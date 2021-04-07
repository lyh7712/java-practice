package lyh7712.javapractice.chapter8;

public class PassBy {

    public static void main(String args[]) {
        PassBy reference = new PassBy();
        reference.callPassByValue();
    }

    public void callPassByValue() {
        int a = 10;
        String b = "b";
        MemberDTO member = new MemberDTO("Lee");
        PassByValue(a, b, member); // PassByValue 메소드 호출
        System.out.println("CallPassByValue method result");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("member.name = " + member.name);
    }

    public void PassByValue(int a, String b, MemberDTO member) {
        a = 20;
        b = "c";
        member.name = "Sim";
        System.out.println("PassByValue method result");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("member.name = " + member.name);
    }
}
