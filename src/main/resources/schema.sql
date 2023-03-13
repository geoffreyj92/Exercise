

create table if not exists workout (
   workout_id BIGSERIAL NOT NULL,
   workout_name VARCHAR(100),
   workout_date date,
   completed boolean,
	CONSTRAINT PK_workout PRIMARY KEY (workout_id)
 );

create table if not exists exercise (
    exercise_id BIGSERIAL NOT NULL,
    exercise_name VARCHAR(50) NOT NULL,
    type VARCHAR(50) NOT NULL,
    muscle VARCHAR(50) NOT NULL,
    equipment VARCHAR(100) NOT NULL,
    difficulty VARCHAR(20) NOT NULL,
    instructions VARCHAR(1000) NOT NULL,
	work_id INT NOT NULL,
	CONSTRAINT PK_exercise PRIMARY KEY (exercise_id),
    CONSTRAINT FK_workout_exercise FOREIGN KEY (work_id) REFERENCES workout(workout_id)
 );

