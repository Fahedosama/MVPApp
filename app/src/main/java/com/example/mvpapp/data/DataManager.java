package com.example.mvpapp.data;

import com.example.mvpapp.data.model.Msg;
import com.example.mvpapp.data.model.StarSign;

import java.util.ArrayList;
import java.util.List;

public class DataManager {


    public List<StarSign> getStarSign() {
        List<StarSign> starSigns = new ArrayList<>();
        starSigns.add(new StarSign("A", "", 1));
        starSigns.add(new StarSign("B", "", 2));
        starSigns.add(new StarSign("C", "", 3));
        starSigns.add(new StarSign("D", "", 4));
        starSigns.add(new StarSign("E", "", 5));
        starSigns.add(new StarSign("F", "", 6));
        starSigns.add(new StarSign("G", "", 7));
        starSigns.add(new StarSign("H", "", 8));
        starSigns.add(new StarSign("I", "", 9));
        starSigns.add(new StarSign("J", "", 10));
        starSigns.add(new StarSign("K", "", 11));
        starSigns.add(new StarSign("L", "", 12));
        return starSigns;
    }

    public String getSign(int month, List<StarSign> lst) {
        if (month < 1 || month > 12) {
            return "Error in month!";
        }
        return lst.get(month - 1).getName();
    }

    public StarSign getStarSign(int month, List<StarSign> lst) {
        if (month < 1 || month > 12) {
            return null;
        }
        return lst.get(month - 1);
    }

    public Msg getName() {
        // Api Call
        Msg msg = new Msg("fahed");

        // return data
        return msg;
    }
}
