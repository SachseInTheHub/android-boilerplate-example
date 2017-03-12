package com.sachse.musicsearch.feature.home;

import android.support.annotation.NonNull;
import com.sachse.boilerplate.R;
import com.sachse.musicsearch.base.BaseActivity;
import com.sachse.musicsearch.base.BasePresenter;

import javax.inject.Inject;

public class HomeActivity extends BaseActivity<HomePresenter.View>
        implements HomePresenter.View {

    @Inject HomePresenter presenter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_home;
    }

    @NonNull
    @Override
    protected BasePresenter<HomePresenter.View> getPresenter() {
        return presenter;
    }

    @NonNull
    @Override
    protected HomePresenter.View getPresenterView() {
        return this;
    }

    @Override
    protected void onInject() {
        DaggerHomeComponent.builder().applicationComponent(getApplicationComponent()).build()
                .inject(this);
    }
}
