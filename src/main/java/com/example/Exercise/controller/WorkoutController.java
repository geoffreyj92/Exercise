package com.example.Exercise.controller;

import com.example.Exercise.model.Workout;
import com.example.Exercise.repo.WorkoutRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {

    private final WorkoutRepository repository;

    public WorkoutController(WorkoutRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/workouts")
    public List<Workout> getWorkouts() {
        return repository.findAll();
    }



}
