package com.example.Exercise.repo;

import com.example.Exercise.model.Workout;
import org.springframework.data.repository.ListCrudRepository;

public interface WorkoutRepository extends ListCrudRepository<Workout, Integer> {
}
