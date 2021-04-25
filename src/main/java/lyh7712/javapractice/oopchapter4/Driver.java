package lyh7712.javapractice.oopchapter4;

public class Driver {
    public static void main(String args[]) {
//        Animal animal = new Animal(); 추상 클래스는 인스턴스(객체)를 만들 수 없는 클래스가 된다.

        Animal[] animals = new Animal[2];

        animals[0] = new Cat();
        animals[1] = new Dog();

        for (int i = 0; i < animals.length; i++) {
            animals[i].cry();
        }
    }
}
