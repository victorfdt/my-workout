package com.elros.myworkout.service;

import com.elros.myworkout.repository.ExerciseRepository;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
@Getter
public class Service {

    @Inject
    private ExerciseRepository exerciseRepository;
}
