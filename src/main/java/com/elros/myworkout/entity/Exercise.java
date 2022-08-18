package com.elros.myworkout.entity;

import jakarta.nosql.mapping.Column;
import jakarta.nosql.mapping.Entity;
import jakarta.nosql.mapping.Id;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@EqualsAndHashCode
public class Exercise {

    @Id
    private long id;

    @Column
    private String name;

    @Column
    private ExerciseType type;
}
