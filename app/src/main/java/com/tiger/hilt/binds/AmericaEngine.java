package com.tiger.hilt.binds;

import android.util.Log;

import javax.inject.Inject;

public class AmericaEngine implements Engine {

    @Inject
    public AmericaEngine() {
    }

    @Override
    public void on() {
        Log.e("zrm", "AmericaEngine on");
    }

    @Override
    public void off() {
        Log.e("zrm", "AmericaEngine off");
    }
}
