package com.sachse.boilerplate.application;

import com.sachse.musicsearch.application.ApplicationComponent;

import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {TestApplicationModule.class})
public interface TestApplicationComponent extends ApplicationComponent {
}
