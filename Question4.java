package com.DesignPatterns;

class Student {
    private int studentId;
    private String fName;
    private String lName;
    private String courseName;
    private String session;
    private float marks;
    private String hobbies;

    Student(StudentBuilder studentBuilder) {
        this.studentId = studentBuilder.getStudentId();
        this.fName = studentBuilder.getfName();
        this.lName = studentBuilder.getlName();
        this.courseName = studentBuilder.getCourseName();
        this.session = studentBuilder.getSession();
        this.marks = studentBuilder.getMarks();
        this.hobbies = studentBuilder.getHobbies();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", session='" + session + '\'' +
                ", marks=" + marks +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }
}


class StudentBuilder {
    private int studentId;
    private String fName;
    private String lName;
    private String courseName;
    private String session;
    private float marks;
    private String hobbies;

    StudentBuilder(int studentId) {
        this.studentId = studentId;
    }

    int getStudentId() {
        return studentId;
    }


    String getfName() {
        return fName;
    }

    StudentBuilder setfName(String fName) {
        this.fName = fName;
        return this;
    }

    String getlName() {
        return lName;
    }

    StudentBuilder setlName(String lName) {
        this.lName = lName;
        return this;
    }

    String getCourseName() {
        return courseName;
    }

    StudentBuilder setCourseName(String courseName) {
        this.courseName = courseName;
        return this;
    }

    String getSession() {
        return session;
    }

    StudentBuilder setSession(String session) {
        this.session = session;
        return this;
    }

    float getMarks() {
        return marks;
    }

    StudentBuilder setMarks(float marks) {
        this.marks = marks;
        return this;
    }

    String getHobbies() {
        return hobbies;
    }

    StudentBuilder setHobbies(String hobbies) {
        this.hobbies = hobbies;
        return this;
    }

    Student build() {
        return new Student(this);
    }

    @Override
    public String toString() {
        return "StudentBuilder{" +
                "studentId=" + studentId +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", session='" + session + '\'' +
                ", marks=" + marks +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }
}


public class Question4 {

    public static void main(String[] args) {

        Student student = new StudentBuilder(11)
                .setfName("Rohit")
                .setlName("Verma")
                .setCourseName("MCA")
                .setSession("2016-19")
                .setMarks(88.75f)
                .setHobbies("Playing")
                .build();
        System.out.println(student);

    }
}
