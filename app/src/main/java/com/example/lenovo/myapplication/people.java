package com.example.lenovo.myapplication;

import android.widget.ArrayAdapter;

/**
 * Created by 胥尹辉 on 2017/12/9.
 */

public class people{
    String name;
    int ImageId;
    public people(String name,int ImageId){
        this.name=name;
        this.ImageId=ImageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return ImageId;
    }
}
