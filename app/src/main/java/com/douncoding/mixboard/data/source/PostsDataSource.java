package com.douncoding.mixboard.data.source;

import android.support.annotation.NonNull;

import com.douncoding.mixboard.data.Post;

import java.util.List;

import rx.Observable;

/**
 * Main entry point for accessing  tasks data.
 */
public interface PostsDataSource {

    Observable<List<Post>> getPosts();

    Observable<Post> getPost(@NonNull String postId);

}
