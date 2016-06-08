package com.douncoding.mixboard.post.usercase;

import android.support.annotation.NonNull;

import com.douncoding.mixboard.UseCase;
import com.douncoding.mixboard.data.Post;
import com.douncoding.mixboard.data.source.PostsRepository;

import java.util.List;
import java.util.Observer;


/**
 * Fetches the list of posts.
 */
public class GetPosts extends UseCase<GetPosts.RequestValues, GetPosts.ResponseValue>{

    private PostsRepository mPostsRepository;

    @Override
    protected void executeUseCase(RequestValues requestValues) {

    }

    public static final class RequestValues implements UseCase.RequestValues {

    }

    public static final class ResponseValue implements UseCase.ResponseValue {

        private List<Post> mPosts;

        public ResponseValue(@NonNull List<Post> posts) {
            //mPosts = checkNotNull(posts, "tasks cannot be null!");
        }

        public List<Post> getTasks() {
            return mPosts;
        }
    }
}
