package com.example.lifecycleactivity26082021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button mBtnNavigateScreen3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mBtnNavigateScreen3 = findViewById(R.id.buttonNavigateScreen3);

        mBtnNavigateScreen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });

        Log.d("BBB","Screen 2 : onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","Screen 2 : onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","Screen 2 : onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","Screen 2 : onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","Screen 2 : onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","Screen 2 : onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","Screen 2 : onDestroy");
    }
}