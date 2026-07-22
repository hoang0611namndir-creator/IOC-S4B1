package org.example.coursemanagement.controllers;

import org.example.coursemanagement.services.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/instructors")
public class InstructorController {

    private final InstructorService service;

    @Autowired
    public InstructorController(InstructorService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<com.example.coursemanagement.models.Instructor>> getAll() {

        return ResponseEntity.ok(service.getAllInstructor());

    }

}