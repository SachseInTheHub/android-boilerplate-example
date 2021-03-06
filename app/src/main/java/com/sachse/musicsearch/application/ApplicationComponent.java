package com.sachse.musicsearch.application;

import android.content.Context;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    Context getContext();
}
