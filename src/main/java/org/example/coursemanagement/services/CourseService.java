package org.example.coursemanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final com.example.coursemanagement.repositories.CourseRepository repository;

    @Autowired
    public CourseService(com.example.coursemanagement.repositories.CourseRepository repository) {
        this.repository = repository;
    }

    public List<com.example.coursemanagement.models.Course> getAllCourse() {
        return repository.findAll();
    }
}