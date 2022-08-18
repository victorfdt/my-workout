package com.elros.myworkout.service;

import com.elros.myworkout.entity.Exercise;
import jakarta.nosql.mapping.document.DocumentTemplate;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ExerciseService {

    @Inject
    @ConfigProperty(name = "db1")
    private DocumentTemplate template;

    public Exercise insert(final Exercise exercise) {
        return template.insert(exercise);
    }
}
