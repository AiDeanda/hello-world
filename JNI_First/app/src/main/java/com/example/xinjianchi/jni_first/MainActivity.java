package com.example.xinjianchi.jni_first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView = (TextView) findViewById(R.id.tv);
        String s = HelloWorld.helloWorld();
        int add = HelloWorld.add(3, 66);
        textView.setText(s+"\n"+"我是一个加法: "+add);
    }
    static {

        //名字必须和build.gradle中的moduleName一致
        System.loadLibrary("Hello");

    }
}
