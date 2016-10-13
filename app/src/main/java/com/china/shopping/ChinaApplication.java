package com.china.shopping;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by kunwe on 2016/10/13.
 */

public class ChinaApplication extends Application {
    /**
     * context 上下文
     * SharedPreferences  存储sp
     * edit sp 提交
     */
    public static Context context = null;
    public static SharedPreferences sharedPreferences;
    public static SharedPreferences.Editor edit;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        sharedPreferences = getSharedPreferences("config", Context.MODE_PRIVATE);
        edit = sharedPreferences.edit();
    }
}
