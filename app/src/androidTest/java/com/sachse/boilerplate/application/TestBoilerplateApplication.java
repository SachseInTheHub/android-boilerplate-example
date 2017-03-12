package com.sachse.boilerplate.application;

import com.sachse.musicsearch.application.ApplicationComponent;
import com.sachse.musicsearch.application.BoilerplateApplication;

public class TestBoilerplateApplication extends BoilerplateApplication {

    @Override
    protected ApplicationComponent createComponent() {
        return DaggerTestApplicationComponent.builder()
                .testApplicationModule(new TestApplicationModule(this)).build();
    }
}
