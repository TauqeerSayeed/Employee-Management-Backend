package com.example.employee_management.Exception;

public class userNotFoundException extends RuntimeException{

    public userNotFoundException(String msg){
        super(msg);
    }
}
