package com.elros.myworkout.repository;

import com.elros.myworkout.entity.Exercise;
import jakarta.nosql.mapping.Repository;

import javax.enterprise.context.ApplicationScoped;
import java.util.stream.Stream;

@ApplicationScoped
public interface ExerciseRepository extends Repository<Exercise, Long> {
    Stream<Exercise> findAll();
}
