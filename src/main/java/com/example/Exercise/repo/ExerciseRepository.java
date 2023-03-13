package com.example.Exercise.repo;

import com.example.Exercise.model.Exercise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.yaml.snakeyaml.events.Event;

public interface ExerciseRepository extends ListCrudRepository<Exercise, Integer> {
}
