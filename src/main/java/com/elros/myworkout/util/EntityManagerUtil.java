package com.elros.myworkout.util;

import com.elros.myworkout.config.MyWorkoutEntityManagerFactory;
import jakarta.persistence.EntityManager;

public abstract class EntityManagerUtil {

    protected EntityManager em;

    protected void begin() {
        em = MyWorkoutEntityManagerFactory.getFactory().createEntityManager();
        em.getTransaction().begin();
    }

    protected void commitClose() {
        em.getTransaction().commit();
        em.close();
    }

    protected void close() {
        em.close();
    }

}
