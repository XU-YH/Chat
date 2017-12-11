package com.example.lenovo.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 胥尹辉 on 2017/12/9.
 */

public class PeopleAdapter extends ArrayAdapter {
    private int resourceId;
    public PeopleAdapter(Context context, int textViewResourceId, List<people> objects) {
        super(context,textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        people p = (people) getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        ImageView imageView = (ImageView)view.findViewById(R.id.pImg);
        TextView textView = (TextView)view.findViewById(R.id.name);
        imageView.setImageResource(p.getImageId());
        textView.setText(p.getName());
        return view;
    }
}
