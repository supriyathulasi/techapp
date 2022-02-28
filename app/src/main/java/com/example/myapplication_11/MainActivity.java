package com.example.myapplication_11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void in(View view){
        c++;
        TextView b1=findViewById(R.id.textView);
        b1.setText(""+c);
    }
    public void out(View view){
        c--;
        TextView b1=findViewById(R.id.textView);
        b1.setText(""+c);
    }
}
