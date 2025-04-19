package com.springboot.starter.firstWork;

public class Responses {

    private String answer;

    public Responses(String answer){
        this.answer = answer;
    }

    public String getResponse (){
        return answer;
    }

    public void setResponse (String message){
        this.answer = message;
    }
}
