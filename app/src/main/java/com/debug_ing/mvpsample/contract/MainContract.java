package com.debug_ing.mvpsample.contract;

public interface MainContract {
    interface View extends BaseViewContract{
        void changeTextView();
    }
    interface Presenter{
        void change();
    }
}
