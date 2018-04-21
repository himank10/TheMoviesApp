package com.example.himank.themoviesapp.model;

import com.example.himank.themoviesapp.service.BaseResults;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TVResults extends BaseResults {
    @SerializedName("results")
    private List<TV> mTVs;

    public List<TV> getTVs() {
        return mTVs;
    }

    public void setTVs(List<TV> TVs) {
        mTVs = TVs;
    }
}
