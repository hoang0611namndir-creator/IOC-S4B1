package org.example.coursemanagement.repositories;

import org.example.coursemanagement.models.StudentEnrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentEnrollmentRepository
        extends JpaRepository<StudentEnrollment,Long> {
}