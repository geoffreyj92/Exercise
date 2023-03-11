package com.example.Exercise.model;

import java.util.Objects;

public class Exercise {

    private String name;
    private String type;
    private String muscle;
    private String equipment;
    private String difficulty;
    private String instructions;

    public Exercise(String name, String type, String muscle, String equipment, String difficulty, String instructions) {
        this.name = name;
        this.type = type;
        this.muscle = muscle;
        this.equipment = equipment;
        this.difficulty = difficulty;
        this.instructions = instructions;
    }

    public Exercise() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return name.equals(exercise.name) && type.equals(exercise.type) && muscle.equals(exercise.muscle) && equipment.equals(exercise.equipment) && difficulty.equals(exercise.difficulty) && instructions.equals(exercise.instructions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, muscle, equipment, difficulty, instructions);
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", muscle='" + muscle + '\'' +
                ", equipment='" + equipment + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", instructions='" + instructions + '\'' +
                '}';
    }
}
