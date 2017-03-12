package com.sachse.musicsearch.feature.home;

import com.sachse.musicsearch.base.BasePresenter;
import com.sachse.musicsearch.base.PerViewScope;
import javax.inject.Inject;

@PerViewScope
class HomePresenter extends BasePresenter<HomePresenter.View> {

    @Inject
    HomePresenter() {
    }

    interface View {
    }
}
