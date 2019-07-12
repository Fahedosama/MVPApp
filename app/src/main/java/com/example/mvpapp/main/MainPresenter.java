package com.example.mvpapp.main;

import com.example.mvpapp.data.DataManager;
import com.example.mvpapp.data.model.Msg;
import com.example.mvpapp.data.model.StarSign;

public class MainPresenter {

    MainMvpView mainActivity;
    DataManager dataManager;


    public MainPresenter(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        dataManager = new DataManager();

    }

    public void onButtonClick(int month) {
        //mainActivity.showToast(dataManager.getName().getMsg());
        //String sign = dataManager.getSign(month,dataManager.getStarSign());
        StarSign q = dataManager.getStarSign(month,dataManager.getStarSign());
        mainActivity.showAlert(q.getMeaning());
        mainActivity.showAlert(q.getName());

    }


}
