package lyh7712.javapractice.oopchapter6.factoryMethodPattern;

public class Dog extends Animal {
    //추상 펙터리 메서드 오버라이딩
    AnimalToy getToy() {
        return new DogToy();
    }
}
