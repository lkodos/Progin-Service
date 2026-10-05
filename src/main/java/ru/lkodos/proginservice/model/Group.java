package ru.lkodos.proginservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Entity
@Table(name = "groups")
@NoArgsConstructor
@Getter
@Setter
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private Integer id;

    @Column(name = "group_name")
    @NotBlank(message = "The field cannot be empty")
    @Size(min = 3, max = 30, message = "The name must be between 3 and 30 characters long")
    private String name;

    @Column(name = "location")
    @Enumerated(EnumType.STRING)
    @NotNull(message = "The field cannot be empty")
    private Location location;

    @Column(name = "day")
    @Enumerated(EnumType.STRING)
    @NotNull(message = "The field cannot be empty")
    private Day day;

    @Column(name = "time")
    @NotNull(message = "The field cannot be empty")
    private LocalTime time;
}
