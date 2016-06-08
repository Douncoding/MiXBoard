package com.douncoding.mixboard;

import android.content.Context;
import android.support.annotation.NonNull;

import com.douncoding.mixboard.UseCaseHandler;
import com.douncoding.mixboard.data.source.PostsRepository;
import com.douncoding.mixboard.data.source.PostsDataSource;
import com.douncoding.mixboard.data.source.local.PostsLocalDataSource;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Enables injection of mock implementations for
 * {@link PostsDataSource} at compile time. This is useful for testing, since it allows us to use
 * a fake instance of the class to isolate the dependencies and run a test hermetically.
 */
public class Injection {

    public static UseCaseHandler provideUseCaseHandler() {
        return UseCaseHandler.getInstance();
    }

    /*
    public static PostsRepository provideTasksRepository(@NonNull Context context) {
        checkNotNull(context);
        return PostsRepository.getInstance(FakeTasksRemoteDataSource.getInstance(),
                PostsLocalDataSource.getInstance(context));
    }
    */
}

