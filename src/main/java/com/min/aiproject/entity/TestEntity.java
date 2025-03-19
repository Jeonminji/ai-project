package com.min.aiproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "test1")
public class TestEntity {       // Spring Boot 3 이상부터는 jakarta로 변경
    @Id
    private int id;

    private String name;

    private String content;
}
