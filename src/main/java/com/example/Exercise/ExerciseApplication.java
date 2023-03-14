package com.example.Exercise;

import com.example.Exercise.model.Exercise;
import com.example.Exercise.model.Workout;
import com.example.Exercise.repo.ExerciseRepository;
import com.example.Exercise.repo.WorkoutRepository;
import com.example.Exercise.service.ExerciseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class ExerciseApplication {

	private static final Logger LOG = LoggerFactory.getLogger(ExerciseService.class);

	public static void main(String[] args) {
		SpringApplication.run(ExerciseApplication.class, args);
	}

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	CommandLineRunner commandLineRunner(ExerciseService exerciseService, ExerciseRepository repository) {
		return args -> {

			List<Exercise> exerciseList = exerciseService.allExcercises();
			LOG.info("Exercises saved {} to the database", exerciseList.size());

			repository.saveAll(exerciseList);



		};
	}

//	@Bean
//	CommandLineRunner commandLineRunner1(WorkoutRepository workout) {
//		return args -> {
//			workout.save(new Workout(null, "biceps", true, LocalDate.of(2023, Month.MARCH, 13)));
//			LOG.info("Workout added to the DB");
//		};
//	}
//
//	@Bean
//	CommandLineRunner commandLineRunner(ExerciseRepository exercise, WorkoutRepository workoutRepository, Workout workout) {
//		return args -> {
//			exercise.save(new Exercise(null, "monday", "strength", "biceps", "dumbbells", "beginner", "stay seated and curl the weight", 1));
////			workoutRepository.save(new Workout(null, "back", LocalDate.now(), true));
//			LOG.info("Exercise added to the DB");
//		};
//
//	}



}
