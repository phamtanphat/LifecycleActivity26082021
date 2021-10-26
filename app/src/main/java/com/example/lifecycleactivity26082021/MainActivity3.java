package com.example.lifecycleactivity26082021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button mBtnMain3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d("BBB","Screen 3 : onCreate");

        mBtnMain3 = findViewById(R.id.buttonNavigate3);

        // Nếu tồn tại rồi : đẩy lên đỉnh và xoa các activity sau no
        // Nếu chưa tồn tại thì tạo mới 1 task chưa riêng nó
        mBtnMain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","Screen 3 : onStart");
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