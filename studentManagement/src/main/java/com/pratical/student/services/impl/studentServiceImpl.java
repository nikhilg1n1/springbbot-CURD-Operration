package com.pratical.student.services.impl;

import com.pratical.student.Repository.studentRepository;
import com.pratical.student.entiity.studentDetails;
import com.pratical.student.services.studentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class studentServiceImpl implements studentService {

    private studentRepository studentrepository;
    public studentServiceImpl(studentRepository studentrepository){
        this.studentrepository=studentrepository;
    }
    @Override
    public studentDetails saveStudent(studentDetails studentdetails) {
        return studentrepository.save(studentdetails);
    }


    @Override
    public List<studentDetails> getAllStudets() {
        return studentrepository.findAll();
    }

    @Override
    public void deleteStudent(Long id) {
        studentrepository.deleteById(id);
    }

    @Override
    public studentDetails updateStudentData(studentDetails studentdetails,Long id) {
        studentDetails studentDB= studentrepository.findById(id).get();

        if (Objects.nonNull(studentdetails.getStudentName()) && !"".equalsIgnoreCase(studentdetails.getStudentName())){
            studentDB.setStudentName(studentdetails.getStudentName());
        }
        if (Objects.nonNull(studentdetails.getStudentDepartment()) && !"".equalsIgnoreCase(studentdetails.getStudentDepartment())){
            studentDB.setStudentDepartment(studentdetails.getStudentDepartment());
        }

            return studentrepository.save(studentDB);
    }


}
