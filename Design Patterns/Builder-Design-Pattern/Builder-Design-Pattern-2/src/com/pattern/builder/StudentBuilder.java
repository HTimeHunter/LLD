package com.pattern.builder;

import com.pattern.Student;

import java.util.List;

public abstract class StudentBuilder {
    public String name;
    public int age;
    public List<String> subjects;

    public StudentBuilder setName(String name){
        this.name=name;
        return this;
    }

    public StudentBuilder setAge(int age){
        this.age=age;
        return this;
    }

    public abstract StudentBuilder setSubjects();

    public Student build(){
//        System.out.println(this.subjects.size());
        return new Student(this);
    }
}
