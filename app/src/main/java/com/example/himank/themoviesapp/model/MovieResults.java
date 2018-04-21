package com.example.himank.themoviesapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieResults {
    @SerializedName("results")
    private List<Movie> mMovies;

    public List<Movie> getMovies() {
        return mMovies;
    }

    public void setMovies(List<Movie> movies) {
        mMovies = movies;
    }
}
