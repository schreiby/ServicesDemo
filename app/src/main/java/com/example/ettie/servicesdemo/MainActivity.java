package com.example.ettie.servicesdemo;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.widget.Toast;

public class MainActivity extends Activity {
    IntentFilter intentFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        intentFilter = new IntentFilter();
        intentFilter.addAction("FILE_DOWNLOAD_ACTION");

        registerReceiver(receiver, intentFilter);
    }

    @Override
    protected void onPause() {
        super.onPause();

        unregisterReceiver(receiver);
    }

    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(getBaseContext(), "File download completed!", Toast.LENGTH_LONG).show();
        }
    };

    public void startService(View view) {
        //Intent intent = new Intent(this, MyServices.class);
        //startService(intent);
        startService(new Intent(getBaseContext(), MyIntentService.class));
    }

    public void stopService(View view) {
        Intent intent = new Intent(this, MyServices.class);
        startService(intent);
    }
}
