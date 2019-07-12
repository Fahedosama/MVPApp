package com.example.mvpapp.data.model;


import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Names {

    int name_id;
    @SerializedName("name_ar")
    String name_ar;
    @SerializedName("name_meaning")
    String name_meaning;
    @SerializedName("name_type")
    String name_type;

    @SerializedName("message")
    String message;

    public Names(String name_ar, String name_meaning, String name_type) {
        this.name_ar = name_ar;
        this.name_meaning = name_meaning;
        this.name_type = name_type;
    }

    public int getName_id() {
        return name_id;
    }

    public void setName_id(int name_id) {
        this.name_id = name_id;
    }

    public String getName_ar() {
        return name_ar;
    }

    public void setName_ar(String name_ar) {
        this.name_ar = name_ar;
    }

    public String getName_meaning() {
        return name_meaning;
    }

    public void setName_meaning(String name_meaning) {
        this.name_meaning = name_meaning;
    }

    public String getName_type() {
        return name_type;
    }

    public void setName_type(String name_type) {
        this.name_type = name_type;
    }


}

