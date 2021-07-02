package edu.mum.cs.cs425.studentmgmt.model;

import java.time.LocalDate;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;
    @Column(nullable = false)
    private String studentNumber;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = true)
    private String middleName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = true)
    private double cgpa;
    @Column(nullable = true)
    private LocalDate dateOfEnrollment;

    @OneToOne(cascade = CascadeType.ALL)
    private Transcript transcript;

    @ManyToMany
    private List<Classroom> classroom;

    public Student() {

    }

    public Student(String studentNumber, String firstName, String middleName, String lastName, Double cgpa, LocalDate dateOfEnrollment, Transcript transcript) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
        this.transcript=transcript;
        this.classroom = new ArrayList<Classroom>();
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }


    public void setClassroom(Classroom classroom) {
        this.classroom.add(classroom);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cgpa=" + cgpa +
                ", dateOfEnrollment=" + dateOfEnrollment +
                ", transcript=" + transcript +
                ", classrooms=" + classroom +
                '}';
    }
}
