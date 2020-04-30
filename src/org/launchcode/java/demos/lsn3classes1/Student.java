package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    //Constructor
    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    //Overloaded Constructor
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        
    }

    //Setters
    public void setName(String aName) {
        name = aName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public void gpa(double gpa) {
        this.gpa = gpa;
    }

    //Getters

    public String getName(){
        return name;
    }

    public int getStudentId(){
        return studentId;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }

    public double getGpa(){
        return gpa;
    }

}