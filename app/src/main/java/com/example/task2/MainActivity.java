package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount;
    private Button btn_1,btn_2;

    {
        mCount = 0;
    }
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        btn_1= findViewById(R.id.button3);
        btn_2=findViewById(R.id.button2);
    }
    public void showToast(View view){
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show();

    }
    public void countUp(View view){

        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
         btn_1.setBackgroundResource(R.color.pink);
         btn_2.setBackgroundResource(R.color.green);

    }

    public void Zero(View view) {
        mCount=0;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
         btn_1.setBackgroundResource(R.color.grey);

    }

    }
