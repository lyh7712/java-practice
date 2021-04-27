package lyh7712.javapractice.oopchapter6.templateMethodPattern;

public class Cat extends Animal {
    void play() {
        System.out.println("야옹~ 야옹~");
    }

    //hook(갈고리) 메소드 오버라이
    void runSomething() {
        System.out.println("야옹~ 야옹~ 꼬리 살랑 살랑~");
    }
}
