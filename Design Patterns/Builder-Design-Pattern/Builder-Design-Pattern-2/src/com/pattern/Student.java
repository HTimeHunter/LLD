package com.pattern;

import com.pattern.builder.StudentBuilder;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<String> subjects;

    public Student(StudentBuilder studentBuilder){
        this.name=studentBuilder.name;
        this.age=studentBuilder.age;
        this.subjects=studentBuilder.subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public String toString(){
        return "age: [" + this.age +
                "]\nname: [" + this.name +
                "]\nsubjects: [" + subjects.get(0) + "," +
                subjects.get(1) + "," +
                subjects.get(2)+"]\n";
    }
}
