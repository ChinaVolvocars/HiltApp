package com.tiger.hilt.binds;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)///告诉Hilt 这个module属于的Component,ActivityComponent是Hilt定义好的
public abstract class MainModule {

    @Binds
    public abstract Engine bindEngine(ChinaEngine chinaEngine);

}
