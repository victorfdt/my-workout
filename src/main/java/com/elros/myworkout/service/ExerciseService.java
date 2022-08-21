package com.elros.myworkout.service;

import com.elros.myworkout.config.MyWorkoutEntityManagerFactory;
import com.elros.myworkout.entity.Exercise;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;

import java.util.List;

@ApplicationScoped
public class ExerciseService {

    private EntityManager em = MyWorkoutEntityManagerFactory.getFactory().createEntityManager();

    public Exercise insert(final Exercise exercise) {
        begin();
        em.persist(exercise);
        commitClose();
        return exercise;
    }

    private void begin() {
        em = MyWorkoutEntityManagerFactory.getFactory().createEntityManager();
        em.getTransaction().begin();
    }

    private void commitClose() {
        em.getTransaction().commit();
        em.close();
    }

    public List<Exercise> getAll() {
        begin();
        final List<Exercise> exercises = em.createQuery("SELECT e From Exercise e", Exercise.class).getResultList();
        close();
        return exercises;
    }

    private void close() {
        em.close();
    }
}
