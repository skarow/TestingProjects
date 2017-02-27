package com.example.adefault.testingprojects;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display("lalala");
    }

    protected  void display(String text) {
        TextView textView = (TextView) findViewById(R.id.text_view);
        textView.setText(text);
    }
}
