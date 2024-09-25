package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService {

    private List<Car> cars ;


    {
        cars= new ArrayList<>();
        cars.add(new Car("Camry", 2020, 4));
        cars.add(new Car("Civic", 2019, 4));
        cars.add(new Car("A4", 2019, 4));
        cars.add(new Car("Model X", 2021, 4));
        cars.add(new Car("Harley-Davidson", 2021, 2));

    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= 5) return cars;
        else return cars.subList(0, count);
    }
}
