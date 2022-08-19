package com.elros.myworkout.config;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MyWorkoutEntityManagerFactory {

    public static EntityManagerFactory getFactory() {
        return Persistence.createEntityManagerFactory("default");
    }
}
