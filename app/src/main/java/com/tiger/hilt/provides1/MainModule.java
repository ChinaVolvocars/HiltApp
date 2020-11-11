package com.tiger.hilt.provides1;

import com.tiger.hilt.binds.AmericaEngine;
import com.tiger.hilt.binds.ChinaCar;
import com.tiger.hilt.binds.ChinaEngine;
import com.tiger.hilt.binds.Engine;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public class MainModule {

    @Provides
    @MadeInCN
    public ChinaCar provideChinaCar() {
        return new ChinaCar(new ChinaEngine());
    }

    @Provides
    @MadeInUSA
    public ChinaCar provideChinaCar2() {
        return new ChinaCar(new AmericaEngine());
    }
}
