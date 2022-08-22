package com.elros.myworkout.util;

import com.elros.myworkout.dto.ExerciseDTO;
import com.elros.myworkout.entity.Exercise;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class EntityDTOMapper {

    public static Exercise getExercise(final ExerciseDTO dto) {
        return Exercise.builder()
                .name(dto.getName())
                .build();
    }

    public static List<ExerciseDTO> getExerciseDTOList(final List<Exercise> exercises) {
        return exercises.stream().map(
                        exercise -> ExerciseDTO.builder()
                                .id(exercise.getId())
                                .name(exercise.getName())
                                .build())
                .collect(Collectors.toList());
    }
}
