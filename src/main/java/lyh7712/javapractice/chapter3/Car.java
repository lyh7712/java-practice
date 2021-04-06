package lyh7712.javapractice.chapter3;

public class Car {

    int speed;
    int distance;
    String color;

    public void speedUp() {
        speed = speed + 5;
    }

    public void breakDown() {
        speed = speed - 10;
    }

    public int currentSpeed() {
        return speed;
    }
}
