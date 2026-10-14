package ru.lkodos.proginservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name", nullable = false)
    @NotNull(message = "The Field cannot be empty")
    private String firstName;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "position")
    @Enumerated(EnumType.STRING)
    private Position position;
}
