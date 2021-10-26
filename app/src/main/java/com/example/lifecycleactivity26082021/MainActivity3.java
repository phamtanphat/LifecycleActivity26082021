package com.example.lifecycleactivity26082021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d("BBB","Screen 3 : onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","Screen 33 : onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","Screen 3 : onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","Screen 3 : onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","Screen 3 : onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","Screen 3 : onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","Screen 3 : onDestroy");
    }
}