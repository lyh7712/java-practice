package lyh7712.javapractice.chapter22;

import java.util.HashSet;

public class SetSample {
    public static void main(String args[]) {
        SetSample sample = new SetSample();
        String[] cars = new String[]{
                "Tico", "Sonata", "BMW", "Benz",
                "Lexus", "Zeep", "Grandeure",
                "Morning", "Mini Cooper", "i30",
                "BMW", "Lexus", "Carnibal", "SM5",
                "SM7", "SM3", "Tico"
        };
        System.out.println(sample.getCarKinds(cars));
    }

    public int getCarKinds(String[] cars) {
        if (cars == null) return 0;
        if (cars.length == 1) return 1;

        //HashSet 클래스가 cars의 중복 값들을 걸러내고 카운트
        HashSet<String> carSet = new HashSet<String>();
        for (String car : cars) {
            carSet.add(car);
        }
        return carSet.size();
    }
}
