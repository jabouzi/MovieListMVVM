package com.raywenderlich.wewatch.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\t\u001a\u00020\nH&J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u0007H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001e\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f0\u00072\u0006\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0011"}, d2 = {"Lcom/raywenderlich/wewatch/data/MovieRepository;", "", "deleteMovie", "", "movie", "Lcom/raywenderlich/wewatch/data/model/Movie;", "getMovieDetails", "Landroidx/lifecycle/LiveData;", "Lcom/raywenderlich/wewatch/data/model/details/MovieDetails;", "movieId", "", "getSavedMovies", "", "saveMovie", "searchMovies", "query", "", "app_debug"})
public abstract interface MovieRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.wewatch.data.model.Movie>> getSavedMovies();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.raywenderlich.wewatch.data.model.details.MovieDetails> getMovieDetails(int movieId);
    
    public abstract void saveMovie(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.wewatch.data.model.Movie movie);
    
    public abstract void deleteMovie(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.wewatch.data.model.Movie movie);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.wewatch.data.model.Movie>> searchMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
}