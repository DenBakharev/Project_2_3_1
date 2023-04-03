package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiseIml implements CarServise {
    List<Car> listByCars = new ArrayList<>();

    public CarServiseIml() {

        Car car1 = new Car(1, "BMW", 1);
        Car car2 = new Car(2, "BMW", 3);
        Car car3 = new Car(3, "BMW", 5);
        Car car4 = new Car(4, "BMW", 6);
        Car car5 = new Car(5, "BMW", 7);

        listByCars.add(car1);
        listByCars.add(car2);
        listByCars.add(car3);
        listByCars.add(car4);
        listByCars.add(car5);
    }

    @Override
    public List<Car> getCountOfCars(int count) {
        List<Car> getCount = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            getCount.add(listByCars.get(i));
        }
        return getCount;
    }
}
