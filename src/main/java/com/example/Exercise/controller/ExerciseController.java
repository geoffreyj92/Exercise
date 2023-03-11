package com.example.Exercise.controller;

import com.example.Exercise.model.Exercise;
import com.example.Exercise.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/v1/exercises/")
public class ExerciseController {

    private final ExerciseService exerciseService;

    @Autowired
    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

//    @GetMapping("/random")
//    public ResponseEntity<?> allExercisesFromEndoint() {
//       return ResponseEntity.ok(exerciseService.allExcercises());
//    }

    @GetMapping("{muscle}")
//    @ResponseBody
    public ResponseEntity<?> getExercisesByMuscle(@PathVariable("muscle") String muscle) {
         return ResponseEntity.ok(exerciseService.allExcercises(muscle));
    }
}
