package ru.HomeWork5.HomeWork5.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "text", nullable = false)
    private String text;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "status")
    private TaskStatus status;
    @Column(name = "create_date")
    private LocalDateTime createDate = LocalDateTime.now();

}