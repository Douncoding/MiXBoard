package com.douncoding.mixboard.intro;

import android.nfc.Tag;
import android.support.annotation.NonNull;
import android.util.Log;

import com.douncoding.mixboard.UseCaseHandler;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Listens to use action from the UI {@link LoginFragment}, retrieves the data and updates the
 * UI as required.
 */
public class LoginPresenter implements LoginContract.Presenter {

    private final LoginContract.View mLoginView;
    //UseCase Function List..
    private final UseCaseHandler mUseCaseHandler;

    public LoginPresenter(@NonNull UseCaseHandler useCaseHandler,
                          @NonNull LoginContract.View loginView) {
        mLoginView = checkNotNull(loginView);
        mUseCaseHandler = checkNotNull(useCaseHandler);

        mLoginView.setPresenter(this);
    }

    @Override
    public void start() {
        Log.e("CHECK", "start()");
    }
}
