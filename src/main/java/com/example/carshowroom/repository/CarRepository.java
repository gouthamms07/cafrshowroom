package com.example.carshowroom.repository;

import com.example.carshowroom.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
