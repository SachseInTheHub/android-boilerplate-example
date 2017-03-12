package com.sachse.musicsearch.feature.home;

import com.sachse.musicsearch.application.ApplicationComponent;
import com.sachse.musicsearch.base.PerViewScope;
import dagger.Component;

@PerViewScope
@Component(dependencies = ApplicationComponent.class)
interface HomeComponent {
    void inject(HomeActivity activity);
}
