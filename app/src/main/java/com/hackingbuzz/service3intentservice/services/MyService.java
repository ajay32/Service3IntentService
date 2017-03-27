package com.hackingbuzz.service3intentservice.services;

import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

// register the service class in manifest

//Intent Service has got its worker thread..
/**
 * Created by Avi Hacker on 11/15/2016.
 */

public class MyService extends IntentService {     // require two things 1 ..Implementation method 2. Constructor..just click ALt+ insert..

    public MyService() {
        super("hi intent service");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Toast.makeText(this, "onStartMethod invoked", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {                                       // this method will call automatically.. in IntentService
        super.onDestroy();
        Toast.makeText(this,"Service automatically Destroyed",Toast.LENGTH_SHORT).show();
    }
}

// advantege..using IntentService ..you no need to stop the service..it will automatically stop it after its job done..
//onCreate method will surely called to create a service in Service or IntentService.
