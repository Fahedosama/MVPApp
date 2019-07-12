package com.example.mvpapp.data.model;

public class StarSign {

    private String name;

    private String meaning;

    private int month;

    public StarSign(String name, String meaning, int month) {
        this.name = name;
        this.meaning = meaning;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
