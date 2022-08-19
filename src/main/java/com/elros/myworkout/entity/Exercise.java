package com.elros.myworkout.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Entity
@Table(name = "exercise")
@Getter
@Setter
@EqualsAndHashCode
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Exercise implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @Column
    private ExerciseType type;

    public Exercise(final String name, final ExerciseType type) {
        this.name = name;
        this.type = type;
    }
}
