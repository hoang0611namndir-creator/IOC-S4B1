package org.example.coursemanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final org.example.coursemanagement.repositories.CourseRepository repository;

    @Autowired
    public CourseService(org.example.coursemanagement.repositories.CourseRepository repository) {
        this.repository = repository;
    }

    public List<org.example.coursemanagement.models.Course> getAllCourse() {
        return repository.findAll();
    }
}