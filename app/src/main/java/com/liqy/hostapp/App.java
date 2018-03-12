package com.liqy.hostapp;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.didi.virtualapk.PluginManager;

/**
 * Created by liqy on 2018/3/12.
 */

public class App extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        long start = System.currentTimeMillis();
        PluginManager.getInstance(base).init();
        Log.d("ryg", "use time:" + (System.currentTimeMillis() - start));
    }
}
