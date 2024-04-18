package org.example;

import java.sql.Date;

public class Student {
    private Long id;
    private String name;
    private String surname;

    private Date dob;
    private String address;
    private Date datadate;
    private Long phone;
    private Integer active;


    public Student student;

    public Student(Long id, String name, String surname, Date dob, String address, Long phone) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.address = address;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDatadate() {
        return datadate;
    }

    public void setDatadate(Date datadate) {
        this.datadate = datadate;
    }

    public Long getPhone() {
        return phone;
    }

    public void setNumber(Long phone) {
        this.phone = phone;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Student() {

    }
}


