package com.example.lifecycles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {
    MyChronometer chronometer;
    //private long elapsedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chronometer = findViewById(R.id.ch);
        getLifecycle().addObserver(chronometer);
        //chronometer.setBase(SystemClock.elapsedRealtime());
    }

    @Override
    protected void onPause() {
        super.onPause();
        //elapsedTime = SystemClock.elapsedRealtime()-chronometer.getBase();
        //chronometer.stop();   //不会停止计数，只是暂停显示效果
    }

    @Override
    protected void onResume() {
        super.onResume();
        //chronometer.setBase(SystemClock.elapsedRealtime()-elapsedTime);
        //chronometer.start();
    }
}
