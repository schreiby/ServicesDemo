package com.example.ettie.servicesdemo;

/**
 * Created by Ettie on 7/9/2015.
 */

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyServices extends Service{

    @Override
    public IBinder onBind(Intent arg0) {
        //TODO
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service Stopped", Toast.LENGTH_LONG).show();
    }

}
