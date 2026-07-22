package org.example.coursemanagement.models;

import org.example.coursemanagement.enums.CourseStatus;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="courses")
public class Course {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String title;

    @Enumerated(EnumType.STRING)
    @Column(nullable=false)
    private CourseStatus status;

    @ManyToOne
    @JoinColumn(name="instructor_id")
    private Instructor instructor;

    @OneToMany(mappedBy="course")
    private List<StudentEnrollment> enrollments=new ArrayList<>();

    public Course(){}

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(CourseStatus status) {
        this.status = status;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void setEnrollments(List<StudentEnrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public CourseStatus getStatus() {
        return status;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public List<StudentEnrollment> getEnrollments() {
        return enrollments;
    }
}