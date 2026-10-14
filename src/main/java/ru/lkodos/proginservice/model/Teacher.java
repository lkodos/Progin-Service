package ru.lkodos.proginservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "teachers")
@PrimaryKeyJoinColumn(name = "id")
@NoArgsConstructor
@Getter
@Setter
public class Teacher extends Employee {

    @Column(name = "grade", nullable = false)
    @NotNull(message = "The Field cannot be empty")
    @Enumerated(EnumType.STRING)
    private Grade grade = Grade.JUNIOR;
}
