package com.elros.myworkout.controller;

import com.elros.myworkout.dto.ExerciseDTO;
import com.elros.myworkout.service.ExerciseService;
import com.elros.myworkout.util.EntityDTOMapper;
import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


//@RequestScoped
@Named
@RequestScoped
@ManagedBean
public class ExerciseController {

    @Inject
    ExerciseService exerciseService;

    @Getter
    @Setter
    private ExerciseDTO exerciseDTO = new ExerciseDTO();

    public String create() {
        exerciseService.insert(EntityDTOMapper.getExercise(exerciseDTO));
        return "/exercise/home.xhtml?faces-redirect=true";
    }

    public List<ExerciseDTO> getExercises() {
        return EntityDTOMapper.getExerciseDTOList(exerciseService.getAll());
    }

    public String delete(final Long id) {
        exerciseService.delete(id);
        return "/exercise/home.xhtml?faces-redirect=true";
    }
}
