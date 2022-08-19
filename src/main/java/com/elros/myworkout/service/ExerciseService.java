package com.elros.myworkout.service;

import com.elros.myworkout.config.MyWorkoutEntityManagerFactory;
import com.elros.myworkout.entity.Exercise;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class ExerciseService {

    private final EntityManagerFactory entityManagerFactory = MyWorkoutEntityManagerFactory.getFactory();

    public Exercise insert(final Exercise exercise) {
        final EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(exercise);
        em.getTransaction().commit();
        em.close();
        return exercise;
    }
}
