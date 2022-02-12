package com.application.pict_app.App.View.RetrofitList;

import com.google.gson.annotations.SerializedName;

public class MovieResults {

    @SerializedName("name")
    private String superName;

    public String getSuperName() {
        return superName;
    }

    public MovieResults(String name){
        this.superName = name;
    }
}
