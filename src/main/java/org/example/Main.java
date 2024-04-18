package org.example;

import java.sql.Date;
public class Main {

    public static void main(String[] args) {
        StudentDao studentDao=new StudentDao();
        Student student = new Student(7L, "Ibrahim", "ASgarov", Date.valueOf("2009-04-20"), "Sumgait", Long.valueOf("0503229931"));
        studentDao.addStudent(student);
    }
}
