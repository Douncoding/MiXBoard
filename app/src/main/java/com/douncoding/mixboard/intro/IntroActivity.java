package com.douncoding.mixboard.intro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.douncoding.mixboard.R;
import com.douncoding.mixboard.util.ActivityUtils;
import com.douncoding.mixboard.Injection;;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

public class IntroActivity extends AppCompatActivity {

    private static final String SAVE_INSTANCE_KEY = "INTRO_INSTANCE_KEY";

    private LoginPresenter mLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize facebook sdk.
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.intro_act);
        AppEventsLogger.activateApp(this);

        // Create the fragment.
        LoginFragment loginFragment =
                (LoginFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);
        if (loginFragment == null) {
            loginFragment = LoginFragment.newInstance();
            ActivityUtils.addFragmentToActivity(
                    getSupportFragmentManager(), loginFragment, R.id.contentFrame);
        }

        // Create the presenter
        mLoginPresenter = new LoginPresenter(
                Injection.provideUseCaseHandler(), loginFragment);

        /*
        // Load previously saved state. if available.
        if (savedInstanceState != null) {
            //notify to presenter.
        }
        */
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
