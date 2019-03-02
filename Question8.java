package com.DesignPatterns;

interface StudentRecord {
    void info();
}

class People {
    String accessType;

    People(String accessType) {
        this.accessType = accessType;
    }
}

class ClassStudent implements StudentRecord {
    People people;
    String name;
    int id;
    String course;

    ClassStudent(People people, String name, int id, String course) {
        this.people = people;
        this.name = name;
        this.id = id;
        this.course = course;
    }

    @Override
    public void info() {
        System.out.println("Name: " + name + " Id: " + id + " Course: " + course);
    }
}

class ClassStudentProxy extends ClassStudent {

    ClassStudentProxy(People people, String name, int id, String course) {
        super(people, name, id, course);
    }

    @Override
    public void info() {
        if (people.accessType.equals("admin")) {
            System.out.println("Name: " + name + " Id: " + id + " Course: " + course);
        } else {
            System.out.println("Access not allowed..");
        }
    }
}

public class Question8 {

    public static void main(String[] args) {
        People Sam = new People("admin");
        StudentRecord student = new ClassStudentProxy(Sam, "John", 11, "Computer Science");
        student.info();
    }
}
