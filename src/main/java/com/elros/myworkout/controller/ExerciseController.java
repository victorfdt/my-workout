package com.elros.myworkout.controller;

import com.elros.myworkout.dto.ExerciseDTO;
import com.elros.myworkout.service.ExerciseService;
import com.elros.myworkout.util.EntityDTOMapper;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;


@RequestScoped
@Named
public class ExerciseController {

    @Inject
    ExerciseService exerciseService;

    public String create(final ExerciseDTO dto) {
        exerciseService.insert(EntityDTOMapper.getExercise(dto));
        return "exercise/createExercise.xhtml.xhtml?faces-redirect=true";
    }
}
