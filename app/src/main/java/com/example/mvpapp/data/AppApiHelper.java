package com.example.mvpapp.data;

import com.example.mvpapp.data.api.InfoApi;
import com.example.mvpapp.data.model.Names;

import java.util.List;

import io.reactivex.Observable;

public class AppApiHelper {

    public Observable<List<Names>> getTrends(){
        //InfoApi githubApi = RetroClient.getRetrofitInstance().create(InfoApi.class);
        InfoApi service = RetroClient.getRetrofitInstance().create(InfoApi.class);
        return service.getTrends();
    }

}