package lyh7712.javapractice.oopchapter6.singletonPattern;

public class Client {
    public static void main(String args[]) {
        //private 생성자이므로 new를 통해 인스턴스 생성 불가능
        //Singleton s = new Singleton();

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        s1 = null;
        s2 = null;
        s3 = null;
    }
}
