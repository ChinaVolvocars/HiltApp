package com.tiger.hilt.binds;

import android.util.Log;

import javax.inject.Inject;

public class ChinaEngine implements Engine {

    @Inject
    public ChinaEngine() {
    }

    @Override
    public void on() {
        Log.e("zrm", "ChinaEngine on");
    }

    @Override
    public void off() {
        Log.e("zrm", "ChinaEngine off");
    }
}
