package com.tiger.hilt.provides;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public class DogModule {

    @Provides
    public Dog provideDog() {
        return new Dog("京巴犬");
    }

}
