package com.min.aiproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.ToString;

@ToString
@Entity
@Table(name = "test1")
public class TestEntity {
    @Id
    private int id;

    private String name;

    private String content;
}
