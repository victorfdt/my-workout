package com.elros.myworkout;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@RequestScoped
@Named
@Getter
@Setter
public class PersonEdit {

    private String name;
    private int age;
}
