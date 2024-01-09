package com.example.schooltargil2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;



public class MainActivity extends AppCompatActivity
{
    private Button btn;
    private int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= findViewById(R.id.button);
    }

    public void go(View view)
    {
        counter++;
        btn.setText("This is click number: " + counter);
    }
}