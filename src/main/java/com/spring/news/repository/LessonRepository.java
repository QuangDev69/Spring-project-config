package com.spring.news.repository;

import com.spring.news.domain.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  LessonRepository extends JpaRepository<Lesson, Integer> {
}