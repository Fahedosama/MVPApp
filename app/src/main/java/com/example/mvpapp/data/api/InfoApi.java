package com.example.mvpapp.data.api;

import com.example.mvpapp.data.model.Names;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface InfoApi {

    @GET("names")
    Call<List<Names>> listRepos();

    @POST("names")
    Call<Names> cr(@Body Names request);

    @GET("names")
    Observable<List<Names>> getTrends();

}
