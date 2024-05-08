package com.pratical.student.Repository;

import com.pratical.student.entiity.studentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends JpaRepository<studentDetails,Long> {
}
