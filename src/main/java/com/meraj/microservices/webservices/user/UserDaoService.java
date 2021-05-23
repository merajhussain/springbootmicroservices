package com.meraj.microservices.webservices.user;

import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {

    private  static   List<User> myusers = new ArrayList<>();
    private static int userCount=4;


    static{

        try {

            myusers.add(new User(1,"Atheeb",   "24-11-2015"));
            myusers.add(new User(2,"Rafeeq",   "26-07-2016"));
            myusers.add(new User(3,"Fatima", "08-08-2019"));
            myusers.add(new User(4,"Afeef", "06-09-2020"));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }



    public List<User> findAll()
    {
        return myusers;
    }

    public User save(User user)
    {
        if( user.getId() == 0)
        {
            user.setId(++userCount);
        }

        myusers.add(user);
        return user;
    }

    public User findById(int id)
    {
        for( var user: myusers)
        {
            if(user.getId() == id) return user;
        }

        return null;
    }



}
