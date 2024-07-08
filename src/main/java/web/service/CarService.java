package web.service;

import web.domain.Car;

import java.util.List;

public interface CarService {

    public List<Car> getCars(int count);
}
