package com.raywenderlich.wewatch.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u001e\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/raywenderlich/wewatch/data/MovieRepositoryImpl;", "Lcom/raywenderlich/wewatch/data/MovieRepository;", "()V", "allMovies", "Landroidx/lifecycle/LiveData;", "", "Lcom/raywenderlich/wewatch/data/model/Movie;", "movieDao", "Lcom/raywenderlich/wewatch/data/db/MovieDao;", "retrofitClient", "Lcom/raywenderlich/wewatch/data/net/RetrofitClient;", "deleteMovie", "", "movie", "getMovieDetails", "Lcom/raywenderlich/wewatch/data/model/details/MovieDetails;", "movieId", "", "getSavedMovies", "saveMovie", "searchMovies", "query", "", "app_debug"})
public final class MovieRepositoryImpl implements com.raywenderlich.wewatch.data.MovieRepository {
    private final com.raywenderlich.wewatch.data.db.MovieDao movieDao = null;
    private final com.raywenderlich.wewatch.data.net.RetrofitClient retrofitClient = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.wewatch.data.model.Movie>> allMovies = null;
    
    @java.lang.Override()
    public void deleteMovie(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.wewatch.data.model.Movie movie) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.wewatch.data.model.Movie>> getSavedMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.raywenderlich.wewatch.data.model.details.MovieDetails> getMovieDetails(int movieId) {
        return null;
    }
    
    @java.lang.Override()
    public void saveMovie(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.wewatch.data.model.Movie movie) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.wewatch.data.model.Movie>> searchMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    public MovieRepositoryImpl() {
        super();
    }
}