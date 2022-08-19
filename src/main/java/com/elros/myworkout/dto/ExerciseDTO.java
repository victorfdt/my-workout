package com.elros.myworkout.dto;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.*;

@Getter
@Setter
@RequestScoped
@Named
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExerciseDTO {
    private String name;
}
