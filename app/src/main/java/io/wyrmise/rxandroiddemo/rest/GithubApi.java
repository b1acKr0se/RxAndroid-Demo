package io.wyrmise.rxandroiddemo.rest;

import java.util.List;

import io.wyrmise.rxandroiddemo.model.User;
import retrofit.http.GET;
import rx.Observable;

public interface GithubApi {
    @GET("/users")
    Observable<List<User>> getUserList();
}
