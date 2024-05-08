package com.pratical.student.controller;

import com.pratical.student.entiity.studentDetails;
import com.pratical.student.services.studentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class studentDetailController {
    private studentService studentservice;
    public studentDetailController(studentService studentservice){
        this.studentservice=studentservice;
    }
    @GetMapping("/save")
    public studentDetails saveStudent(@RequestBody studentDetails studentdetails){
        return studentservice.saveStudent(studentdetails);
    }

    @GetMapping("/All")
    List<studentDetails> getAllStudets(){
        return studentservice.getAllStudets();
    }
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id ) {
        studentservice.deleteStudent(id);
        return "student data is deleted";
    }
    @PutMapping("/update/{id}")
    public studentDetails updateStudentData(@RequestBody studentDetails studentdetails, @PathVariable  Long id){
        return studentservice.updateStudentData(studentdetails,id);
    }
}
