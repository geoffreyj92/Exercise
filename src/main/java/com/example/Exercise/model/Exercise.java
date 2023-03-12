package com.example.Exercise.model;

import org.springframework.data.annotation.Id;

import java.util.Objects;

public class Exercise {

    @Id
    private Integer id;
    private String exerciseName;
    private String type;
    private String muscle;
    private String equipment;
    private String difficulty;
    private String instructions;

    public Exercise(Integer id, String name, String type, String muscle, String equipment, String difficulty, String instructions) {
        this.id = id;
        this.exerciseName = name;
        this.type = type;
        this.muscle = muscle;
        this.equipment = equipment;
        this.difficulty = difficulty;
        this.instructions = instructions;
    }

    public Exercise() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMuscle() {
        return muscle;
    }

    public void setMuscle(String muscle) {
        this.muscle = muscle;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise exercise = (Exercise) o;
        return id.equals(exercise.id) && exerciseName.equals(exercise.exerciseName) && type.equals(exercise.type) && muscle.equals(exercise.muscle) && equipment.equals(exercise.equipment) && difficulty.equals(exercise.difficulty) && instructions.equals(exercise.instructions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, exerciseName, type, muscle, equipment, difficulty, instructions);
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", name='" + exerciseName + '\'' +
                ", type='" + type + '\'' +
                ", muscle='" + muscle + '\'' +
                ", equipment='" + equipment + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", instructions='" + instructions + '\'' +
                '}';
    }
}
