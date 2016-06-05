package com.douncoding.mixboard;


public interface BaseView<T extends BasePresenter> {

    void setPresenter(T presenter);

}