package com.elros.myworkout.config;

import jakarta.nosql.document.DocumentCollectionManager;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

@ApplicationScoped
public class ManagerProducer {

    @Inject
    @ConfigProperty(name = "db1")
    private DocumentCollectionManager manager;

    @ApplicationScoped
    @Produces
    public DocumentCollectionManager getManager() {
        return manager;
    }

    public void close(@Disposes @Any final DocumentCollectionManager manager) {
        manager.close();
    }
}
