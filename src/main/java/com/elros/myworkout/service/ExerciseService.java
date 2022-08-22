package com.elros.myworkout.service;

import com.elros.myworkout.entity.Exercise;
import com.elros.myworkout.util.EntityManagerUtil;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class ExerciseService extends EntityManagerUtil {

    public Exercise insert(final Exercise exercise) {
        begin();
        em.persist(exercise);
        commitClose();
        return exercise;
    }


    public List<Exercise> getAll() {
        begin();
        final List<Exercise> exercises = em.createQuery("SELECT e From Exercise e", Exercise.class).getResultList();
        close();
        return exercises;
    }

    public void delete(final Long id) {
        begin();
        em.createQuery("DELETE FROM Exercise e WHERE e.id = " + id).executeUpdate();
        commitClose();
    }
}
