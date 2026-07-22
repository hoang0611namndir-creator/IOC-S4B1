package org.example.coursemanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService {

    private final org.example.coursemanagement.repositories.InstructorRepository repository;

    @Autowired
    public InstructorService(org.example.coursemanagement.repositories.InstructorRepository repository) {
        this.repository = repository;
    }

    public List<org.example.coursemanagement.models.Instructor> getAllInstructor() {
        return repository.findAll();
    }
}