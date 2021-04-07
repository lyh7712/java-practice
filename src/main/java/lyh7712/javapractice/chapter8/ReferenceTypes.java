package lyh7712.javapractice.chapter8;

public class ReferenceTypes {
    public void print(int data) { //오버로딩

    }

    public void print(String data) { //오버로딩

    }

    public void print(int intData, String stringData) { //오버로딩

    }

    public void print(String stringData, int intData) { //오버로딩

    }
    //같은 이름의 메소드를 가지면서 다른 매게변수를 가진다.

    public static void main(String[] args) {
        ReferenceTypes reference = new ReferenceTypes(); //인스턴스 생성

    }
}
