package com.example.Exercise;

import com.example.Exercise.model.Exercise;
import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event;

public interface ExerciseRepository extends CrudRepository<Exercise, Integer> {
}
