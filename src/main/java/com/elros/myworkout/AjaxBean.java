package com.elros.myworkout;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@RequestScoped
@Named
@Getter
@Setter
public class AjaxBean {

    private String message;

    public LocalDateTime now() {

        return LocalDateTime.now();
    }

    public String showMessage() {
        return message;
    }
}
