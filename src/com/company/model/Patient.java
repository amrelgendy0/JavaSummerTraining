package com.company.model;

public class Patient {

String firstname;
String lastname;
int id;
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public double getAge() {
        return age;
    }

    public String getPrescribeMedicine() {
        return prescribeMedicine;
    }

    public String getAddress() {
        return address;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getDate() {
        return date;
    }

    public Patient(String firstname, String lastname, int age, String prescribeMedicine, String address, String doctor, String date,int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.prescribeMedicine = prescribeMedicine;
        this.address = address;
        this.doctor = doctor;
        this.date = date;
        this.id=id;
    }

    double age;
String prescribeMedicine;
String address;
String doctor;

    public int getId() {
        return id;
    }

    String date;




}
