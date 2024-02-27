package com.spring.news.domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity

public class Level {

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer levelId;
    private String levelName;

    @ManyToMany(mappedBy = "levels")
    private Set<Course> courses;
}