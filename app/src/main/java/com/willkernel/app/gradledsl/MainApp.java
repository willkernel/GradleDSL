package com.willkernel.app.gradledsl;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by willkernel on 2017/12/4.
 */

public class MainApp extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
