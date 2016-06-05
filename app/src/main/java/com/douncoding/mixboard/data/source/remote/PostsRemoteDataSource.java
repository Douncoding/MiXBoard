package com.douncoding.mixboard.data.source.remote;

import android.support.annotation.NonNull;

import com.douncoding.mixboard.data.Post;
import com.douncoding.mixboard.data.source.PostsDataSource;

import java.util.List;

import rx.Observable;

/**
 *
 */
public class PostsRemoteDataSource implements PostsDataSource {

    @Override
    public Observable<List<Post>> getPosts() {
        return null;
    }

    @Override
    public Observable<Post> getPost(@NonNull String postId) {
        return null;
    }
}
