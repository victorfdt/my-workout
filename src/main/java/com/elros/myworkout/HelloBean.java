package com.elros.myworkout;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

// RequestScoped: It will be created for each user request and destroyed after the response is sent to the user.
// Named: It makes possible to use this bean in Expression Language. I can use value to specify a name.
@RequestScoped
@Named
public class HelloBean {

    @Inject
    private GreetingService greetingService;

    private String name;
    private String greeting;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }

    public void doGreeting() {
        greeting = String.format(greetingService.getGreetingTemplate(null), name);
    }
}
