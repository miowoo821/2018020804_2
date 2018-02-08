package com.example.student.a2018020804_2;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MyReceiver receiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        receiver=new MyReceiver();
        IntentFilter filter=new IntentFilter();//新增IntentFilter來放
        filter.addAction(Intent.ACTION_SCREEN_ON);//填入要監聽的東西(要接收的廣播的action)
        filter.setPriority(500);
        registerReceiver(receiver,filter);

    }
    public void click1(View v){//寫在oncreate就免按唷
        receiver=new MyReceiver();
        IntentFilter filter=new IntentFilter();//新增IntentFilter來放
        filter.addAction(Intent.ACTION_SCREEN_ON);//填入要監聽的東西(要接收的廣播的action)
        filter.setPriority(500);
        registerReceiver(receiver,filter);

    }

}
