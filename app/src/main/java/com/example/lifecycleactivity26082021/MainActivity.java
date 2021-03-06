package com.example.lifecycleactivity26082021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mBtnNavigateScreen2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB","Screen 1 : onCreate");

        mBtnNavigateScreen2 = findViewById(R.id.buttonNavigateScreen2);

        mBtnNavigateScreen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // explicit
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","Screen 1 : onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","Screen 1 : onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","Screen 1 : onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","Screen 1 : onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","Screen 1 : onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","Screen 1 : onDestroy");
    }
}