package com.douncoding.mixboard.data.source;

import android.support.annotation.NonNull;

import com.douncoding.mixboard.data.Post;

import java.util.List;

import rx.Observable;

/**
 * Concreate implementation to load posts from the data sources into a 'cache'.
 * <p>
 * For simplicity, this implements a dumb synchronisation between locally persisted data and data
 * obtained from the server, by using the remote data source only if the local database doesn't
 * exist or is empty.
 * </p>
 */
public class PostsRepository implements PostsDataSource {

    private static PostsRepository INSTANCE = null;

    private final PostsDataSource mPostsRemoteDataSource;

    private final PostsDataSource mPostsLocalDataSource;

    private PostsRepository(@NonNull PostsDataSource postsRemoteDataSource,
                            @NonNull PostsDataSource postsLocalDataSource) {
        mPostsLocalDataSource = postsLocalDataSource;
        mPostsRemoteDataSource = postsRemoteDataSource;
    }

    @Override
    public Observable<List<Post>> getPosts() {
        return null;
    }

    @Override
    public Observable<Post> getPost(@NonNull String postId) {
        return null;
    }
}
