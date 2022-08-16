package com.elros.myworkout;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    @PostConstruct
    public void init() {
        // ..
    }

    public String getGreetingTemplate(final String language) {
        return "Hello %s";
    }
}
