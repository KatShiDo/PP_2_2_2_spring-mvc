package web.service;

import org.springframework.stereotype.Service;
import web.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<Car>();

    public CarServiceImpl() {
        cars.add(Car.builder().id(1L).model("Kia Rio").year(2016).build());
        cars.add(Car.builder().id(2L).model("Hyundai Solaris").year(2018).build());
        cars.add(Car.builder().id(3L).model("Lada Vesta").year(2022).build());
        cars.add(Car.builder().id(4L).model("UAZ Patriot").year(2019).build());
        cars.add(Car.builder().id(5L).model("Volkswagen Polo").year(2023).build());
    }

    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
