package com.example.lenovo.myapplication;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 胥尹辉 on 2017/12/9.
 */

public class messageAdapter extends ArrayAdapter {
    private int resourceId;
    public messageAdapter(Context context, int textViewResourceId, List<Message> objects) {
        super(context,textViewResourceId, objects);
        resourceId = textViewResourceId;
    }



    public View getView(int position, View convertView, ViewGroup parent){
        Message message;
        message = (Message) getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        ImageView imageView = (ImageView)view.findViewById(R.id.touxiang);
        TextView textView = (TextView)view.findViewById(R.id.mname);
        TextView textView1 = (TextView)view.findViewById(R.id.explain);
        imageView.setImageResource(message.getImageId());
        textView.setText(message.getName());
        textView1.setText(message.getMessage());
        return view;
    }

}
