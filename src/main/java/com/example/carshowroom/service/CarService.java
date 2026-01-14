package com.example.carshowroom.service;

import com.example.carshowroom.model.Car;
import com.example.carshowroom.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepository repo;

    public CarService(CarRepository repo) {
        this.repo = repo;
    }

    public List<Car> getAllCars() {
        return repo.findAll();
    }

    public Car saveCar(Car car) {
        return repo.save(car);
    }

    public void deleteCar(Long id) {
        repo.deleteById(id);
    }
}
