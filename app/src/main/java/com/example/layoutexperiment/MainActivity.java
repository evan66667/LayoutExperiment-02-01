package com.example.layoutexperiment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 注意！布局文件名 activity_space_flight
        setContentView(R.layout.activity_space_flight);
    }
}