package com.pattern;

import com.pattern.builder.EngineeringStudentBuilder;
import com.pattern.builder.MBAStudentBuilder;
import com.pattern.builder.StudentBuilder;

public class Director {
    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder){
        this.studentBuilder=studentBuilder;
    }

    /**
     * creating object based on condition
     * (factory design pattern)
     */
    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        } else if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }
        return null;
    }

    private Student createEngineeringStudent(){
        return studentBuilder.setAge(22).setName("harsh").setSubjects().build();
    }
    private Student createMBAStudent(){
        return studentBuilder.setAge(25).setName("harsh").setSubjects().build();
    }
}
