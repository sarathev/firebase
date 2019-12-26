package com.example.firebase;

public class kallan {

    String name,rollno,admno,clg;

    public kallan() {
    }

    public kallan(String name, String rollno, String admno, String clg) {
        this.name = name;
        this.rollno = rollno;
        this.admno = admno;
        this.clg = clg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getAdmno() {
        return admno;
    }

    public void setAdmno(String admno) {
        this.admno = admno;
    }

    public String getClg() {
        return clg;
    }

    public void setClg(String clg) {
        this.clg = clg;
    }
}
