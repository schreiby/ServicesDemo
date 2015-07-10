package com.example.ettie.servicesdemo;

/**
 * Created by Ettie on 7/9/2015.
 */
import java.net.MalformedURLException;
import java.net.URL;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyIntentService extends IntentService{

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        try{
            downloadFile(new URL("http://example.com/downloads/somefile.pdf"));
            Log.d("MyIntentService", "Download completed");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private void downloadFile(URL url) {
        try{
            //simulate download file task
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
