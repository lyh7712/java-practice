package lyh7712.javapractice.chapter3;

public class CarManager {

    public static void main(String[] args) {

        Car dogCar = new Car();
        Car cowCar = new Car();

        dogCar.speedUp();
        cowCar.speedUp();
        System.out.println(dogCar.currentSpeed());
        cowCar.breakDown();
        System.out.println(cowCar.currentSpeed());
    }
}
