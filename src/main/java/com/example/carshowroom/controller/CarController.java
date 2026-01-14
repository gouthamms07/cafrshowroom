package com.example.carshowroom.controller;

import com.example.carshowroom.model.Car;
import com.example.carshowroom.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping
    public List<Car> getCars() {
        return service.getAllCars();
    }

    @PostMapping
    public Car addCar(@RequestBody Car car) {
        return service.saveCar(car);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id) {
        service.deleteCar(id);
    }
}
