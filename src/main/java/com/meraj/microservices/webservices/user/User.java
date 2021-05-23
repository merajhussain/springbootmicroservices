package com.meraj.microservices.webservices.user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {

    private int id;
    private String name;
    private Date birthdate;


    public User(int id, String name, String birthdate) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        this.id = id;
        this.name = name;

        this.birthdate = format.parse(birthdate);
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
