package com.pattern;

import com.pattern.builder.EngineeringStudentBuilder;
import com.pattern.builder.MBAStudentBuilder;

/**
 * The primary focus here is to understand the Chain of Responsibility (CoR) design pattern.
 * However, the code may contain potential pitfalls and areas for improvement which are out of scope.
 */
public class Main {
    public static void main(String[] args) {
        Director engineeringDirector=new Director(new EngineeringStudentBuilder());
        Director MBADirector=new Director(new MBAStudentBuilder());
        Student engineeringStudent = engineeringDirector.createStudent();
        Student MBAStudent=MBADirector.createStudent();
        System.out.println(engineeringStudent.toString());
        System.out.println(MBAStudent.toString());

    }
}