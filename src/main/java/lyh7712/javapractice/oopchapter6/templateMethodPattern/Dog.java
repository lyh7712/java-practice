package lyh7712.javapractice.oopchapter6.templateMethodPattern;

public class Dog extends Animal {
    //추상 메소드 오버라이딩
    void play() {
        System.out.println("멍! 멍!");
    }

    //hook(갈고리) 메소드 오버라이
    void runSomething() {
        System.out.println("멍! 멍!~ 꼬리 살랑 살랑~");
    }
}
