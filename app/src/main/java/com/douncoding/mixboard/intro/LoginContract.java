package com.douncoding.mixboard.intro;

import com.douncoding.mixboard.BasePresenter;
import com.douncoding.mixboard.BaseView;

/**
 * This specifies the contract between the view and the presenter.
 */

public interface LoginContract {

    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {

    }
}
