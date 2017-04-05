package com.demo.crashdemo;

import android.app.Application;

/**
 * Created by yufei0213 on 2017/4/3.
 */
public class CrashApplication extends Application {

    @Override
    public void onCreate() {

        super.onCreate();

        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
    }
}
