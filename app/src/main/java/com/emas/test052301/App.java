package com.emas.test052301;

import android.app.Application;

/**
 * Created by andy on 2018/5/23.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        EmasInit emas = new EmasInit(this);
        //初始化高可用
        emas.initHA();
        //初始化应用更新
        emas.initUpdate();
        //初始化Weex
        emas.initWeex();
        emas.initPush(this);
    }
}
