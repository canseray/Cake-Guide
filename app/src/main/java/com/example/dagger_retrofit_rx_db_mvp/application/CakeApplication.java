package com.example.dagger_retrofit_rx_db_mvp.application;

import android.app.Application;

public class CakeApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override //finish? about life cycle
    public void onTerminate() {
        super.onTerminate();
    }
}
