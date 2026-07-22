package org.example.coursemanagement.controllers;

import org.example.coursemanagement.models.Student;
import org.example.coursemanagement.response.ApiResponse;
import org.example.coursemanagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    @Autowired
    public StudentController(StudentService service){
        this.service=service;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<Student>>> getAll(){

        return ResponseEntity.ok(
                new ApiResponse<>(
                        true,
                        "Success",
                        service.getAllStudents()
                )
        );

    }

}