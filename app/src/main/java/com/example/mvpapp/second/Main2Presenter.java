package com.example.mvpapp.second;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import com.example.mvpapp.data.AppApiHelper;
import com.example.mvpapp.data.DataManager;
import com.example.mvpapp.data.RetroClient;
import com.example.mvpapp.data.api.InfoApi;
import com.example.mvpapp.data.model.Names;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main2Presenter {
    AppApiHelper appApiHelper;
    Main2MvpView mainActivity;
    DataManager dataManager;
    List<Names> lst;


    public Main2Presenter(final Main2Activity mainActivity) {
        this.mainActivity = mainActivity;
        dataManager = new DataManager();
        appApiHelper = new AppApiHelper();
        lst= new ArrayList<>();

        appApiHelper.getTrends()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(new Observer<List<Names>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        mainActivity.showProgress();
                    }

                    @Override
                    public void onNext(List<Names> names) {
                        //rennderData(names);
                        lst=names;
                        Log.d("fahed",String.valueOf(names.size()));
                       // Toast.makeText(, ""+names.get(0).getName_ar(), Toast.LENGTH_SHORT).show();
                        //lst.addAll(names);

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {
                        mainActivity.LoadData();
                        mainActivity.hideProgress();
                    }
                });

        Log.d("fahed","asdasda");
    }


}
