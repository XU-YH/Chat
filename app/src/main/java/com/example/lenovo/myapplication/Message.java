package com.example.lenovo.myapplication;

/**
 * Created by 胥尹辉 on 2017/12/9.
 */

public class Message {
    String name;
    int ImageId;
    String message;
    public Message(String name,int ImageId,String message){
        this.name=name;
        this.ImageId=ImageId;
        this.message=message;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return ImageId;
    }
    public String getMessage(){
        return message;
    }
}
