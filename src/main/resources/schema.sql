

create table if not exists exercise (
    id BIGSERIAL NOT NULL,
    exercise_name VARCHAR(50) NOT NULL,
    type VARCHAR(50) NOT NULL,
    muscle VARCHAR(50) NOT NULL,
    equipment VARCHAR(100) NOT NULL,
    difficulty VARCHAR(20) NOT NULL,
    instructions VARCHAR(1000) NOT NULL,
    workout_id BIGINT REFERENCES workout (id)
 );

create table if not exists workout (
   id BIGSERIAL NOT NULL,
   workout_name VARCHAR(100),
   workout_date date,
   completed boolean
 );
