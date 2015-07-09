package com.example.ettie.servicesdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startService(View view) {
        Intent intent = new Intent(this, MyServices.class);
        startService(intent);
    }

    public void stopService(View view) {
        Intent intent = new Intent(this, MyServices.class);
        startService(intent);
    }
}
