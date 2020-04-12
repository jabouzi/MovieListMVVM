package com.raywenderlich.wewatch.data.net;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\bH\'\u00a8\u0006\r"}, d2 = {"Lcom/raywenderlich/wewatch/data/net/MoviesApi;", "", "getMovie", "Lretrofit2/Call;", "Lcom/raywenderlich/wewatch/data/model/details/MovieDetails;", "movieId", "", "api_key", "", "getMovies", "Lcom/raywenderlich/wewatch/data/model/MoviesResponse;", "searchMovie", "q", "app_debug"})
public abstract interface MoviesApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "discover/movie")
    public abstract retrofit2.Call<com.raywenderlich.wewatch.data.model.MoviesResponse> getMovies(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/movie")
    public abstract retrofit2.Call<com.raywenderlich.wewatch.data.model.MoviesResponse> searchMovie(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "query")
    java.lang.String q);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/{movie_id}")
    public abstract retrofit2.Call<com.raywenderlich.wewatch.data.model.details.MovieDetails> getMovie(@retrofit2.http.Path(value = "movie_id")
    int movieId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key);
}