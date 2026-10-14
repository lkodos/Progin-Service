package ru.lkodos.proginservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Entity
@Table(name = "groups",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"location", "day", "time"})})
@NoArgsConstructor
@Getter
@Setter
public class Group {

    @Id
    @Column(name = "group_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "group_name", unique = true, nullable = false)
    @NotBlank(message = "The Field cannot be empty")
    @NotNull
    private String name;

    @Column(name = "location", nullable = false)
    @NotNull(message = "The Field cannot be empty")
    @Enumerated(EnumType.STRING)
    private Location location;

    @Column(name = "day", nullable = false)
    @NotNull(message = "The Field cannot be empty")
    @Enumerated(EnumType.STRING)
    private Day day;

    @Column(name = "time", nullable = false)
    @NotNull(message = "The Field cannot be empty")
    private LocalTime time;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}
