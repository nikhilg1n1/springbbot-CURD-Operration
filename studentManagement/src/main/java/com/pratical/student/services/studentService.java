package com.pratical.student.services;

import com.pratical.student.entiity.studentDetails;

import java.util.List;

public interface studentService {
    public studentDetails saveStudent(studentDetails studentdetails);

   public List<studentDetails> getAllStudets();

   public void deleteStudent(Long id);

    public  studentDetails updateStudentData(studentDetails studentdetails,Long id);
}

