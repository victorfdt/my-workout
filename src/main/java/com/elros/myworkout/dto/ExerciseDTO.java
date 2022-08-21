package com.elros.myworkout.dto;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.*;

@RequestScoped
@Named
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class ExerciseDTO {
    private String name;
}
