package com.debug_ing.mvpsample.presenter;

import com.debug_ing.mvpsample.contract.MainContract;

public class MainPresenter implements MainContract.Presenter {
    MainContract.View view;
    public MainPresenter(MainContract.View _view) {
        view = _view;
    }

    @Override
    public void change() {
        view.changeTextView();
    }
}
