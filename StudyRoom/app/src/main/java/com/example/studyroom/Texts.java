package com.example.studyroom;


public class Texts {
    private String threadTitle;
    private String threadText;

    public Texts(String threadTitle,String threadText) {
        this.threadText = threadText;
        this.threadTitle= threadTitle;

    }
    public String getThreadTitle(){
        return threadTitle;
    }
    public String getThreadText(){
        return threadText;
    }
    public void setThreadTitle(String threadTitle){
        this.threadTitle = threadTitle;
    }
    public void setThreadText(String threadText){
        this.threadText = threadText;
    }
}
