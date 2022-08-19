package com.elros.myworkout.util;

import com.elros.myworkout.dto.ExerciseDTO;
import com.elros.myworkout.entity.Exercise;

public class EntityDTOMapper {

    public static Exercise getExercise(final ExerciseDTO dto) {
        return Exercise.builder().name(dto.getName()).build();
    }
}
