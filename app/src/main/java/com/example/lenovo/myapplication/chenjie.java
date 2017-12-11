package com.example.lenovo.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import layout.BlankFragment;
import layout.BlankFragment2;
import layout.BlankFragment3;

public class chenjie extends AppCompatActivity implements View.OnClickListener{


    String titleS;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chenjie);
        Button btn = (Button) findViewById(R.id.btn2);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn3 = (Button) findViewById(R.id.btn3);
        btn.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn3.setOnClickListener(this);
        replaceFragment(new BlankFragment());
    }
    public void onClick(View v) {
        TextView title = (TextView) findViewById(R.id.title);
        switch (v.getId()){
            case R.id.btn2:
                replaceFragment(new BlankFragment());
                titleS="消息";
                title.setText(titleS);
                break;
            case R.id.btn1:
                replaceFragment(new BlankFragment2());
                titleS="朋友";
                title.setText(titleS);
                break;
            case R.id.btn3:
                replaceFragment(new BlankFragment3());
                titleS="自己";
                title.setText(titleS);
                break;

            default:
                break;
        }
    }

    public void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment, fragment);
        transaction.commit();
    }
}

