package com.example.Exercise;

import com.example.Exercise.model.Exercise;
import com.example.Exercise.repo.ExerciseRepository;
import com.example.Exercise.service.ExerciseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

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

	CommandLineRunner commandLineRunner(ExerciseService exerciseService, String name, ExerciseRepository repository) {
		return args -> {
			List<Exercise> exerciseList = exerciseService.allExcercises(name);
			LOG.info("Exercises saved {} to the database", exerciseList.size());

			repository.saveAll(exerciseList);



		};
	}

}
