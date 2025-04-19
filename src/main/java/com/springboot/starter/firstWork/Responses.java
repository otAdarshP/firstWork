package com.springboot.starter.firstWork;

public class Responses {

    private String message;

    public Responses(String message){
        this.message = message;
    }

    public String getResponse (){
        return message;
    }

    public void setResponse (String message){
        this.message = message;
    }
}
