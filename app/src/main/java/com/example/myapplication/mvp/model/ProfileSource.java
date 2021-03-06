package com.example.myapplication.mvp.model;

import com.example.myapplication.mvp.model.Profile;

import java.util.concurrent.Future;

/**
 * Created by Alex on 16.11.2016.
 */
public interface ProfileSource {
    Future<Profile> loadProfile(int profileId, CompleteListener<Profile> completeListener);

    interface CompleteListener<T> {
        void onLoaded(T item);

        void onError(Throwable e);
    }
}
