package com.example.Exercise.controller;

import com.example.Exercise.model.Exercise;
import com.example.Exercise.repo.ExerciseRepository;
import com.example.Exercise.service.ExerciseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/v1/exercises/")
public class ExerciseController {

    private static final Logger LOG = LoggerFactory.getLogger(ExerciseService.class);
    private final ExerciseService exerciseService;
    private final ExerciseRepository repository;
    @Autowired
    public ExerciseController(ExerciseService exerciseService, ExerciseRepository repository) {
        this.exerciseService = exerciseService;
        this.repository = repository;
    }

//    @GetMapping("/random")
//    public ResponseEntity<?> allExercisesFromEndoint() {
//       return ResponseEntity.ok(exerciseService.allExcercises());
//    }

    @GetMapping("{muscle}")
    public ResponseEntity<?> getExercisesByMuscle(@PathVariable("muscle") String muscle) {
        ResponseEntity<List<Exercise>> response = ResponseEntity.ok(exerciseService.allExcercises(muscle));

//        return repository.saveAll(response)
         return ResponseEntity.ok(exerciseService.allExcercises(muscle));
    }

    @PostMapping(path = "/savedExercises")
    public List<Exercise> saveExercises(@RequestBody Exercise exercise, @PathVariable String name) {
        List<Exercise> exerciseList = exerciseService.allExcercises(name);

        if (exerciseList.size() == 0) {
            exercise.setExerciseName("");
            exercise.setDifficulty("");
            exercise.setType("");
            exercise.setEquipment("");
            exercise.setMuscle("");
            exercise.setInstructions("");
        }
        // need to create a jdbcExerciseService to add these values to the database

//        List<Exercise> exerciseList = exerciseService.allExcercises(name);
//        LOG.info("Exercises saved {} to the database", exerciseList.size());
//
        return repository.saveAll(exerciseList);

//        return null;
    }
}
