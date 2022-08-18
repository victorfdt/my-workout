package com.elros.myworkout.bean.exercise;

import com.elros.myworkout.entity.Exercise;
import com.elros.myworkout.service.Service;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

@RequestScoped
@Named
public class ExerciseBean {

    private final SeContainer container = SeContainerInitializer.newInstance().initialize();

    public String create() {
        final Service service = container.select(Service.class).get();
        service.getExerciseRepository().save(Exercise.builder().name("Run").build());
        return "../index.xhtml?faces-redirect=true";
    }
}
