package com.hackingbuzz.service3intentservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hackingbuzz.service3intentservice.services.MyService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startMethod(View view) {

        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }
}
