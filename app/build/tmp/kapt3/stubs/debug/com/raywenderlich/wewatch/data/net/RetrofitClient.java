package com.raywenderlich.wewatch.data.net;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/raywenderlich/wewatch/data/net/RetrofitClient;", "", "()V", "moviesApi", "Lcom/raywenderlich/wewatch/data/net/MoviesApi;", "getMovie", "Lretrofit2/Call;", "Lcom/raywenderlich/wewatch/data/model/details/MovieDetails;", "movieId", "", "searchMovies", "Lcom/raywenderlich/wewatch/data/model/MoviesResponse;", "query", "", "Companion", "app_debug"})
public final class RetrofitClient {
    private final com.raywenderlich.wewatch.data.net.MoviesApi moviesApi = null;
    private static final java.lang.String API_KEY = "3e72efb4de56992e6d87d8161b797802";
    private static final java.lang.String TMDB_BASE_URL = "http://api.themoviedb.org/3/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TMDB_IMAGEURL = "https://image.tmdb.org/t/p/w500/";
    public static final com.raywenderlich.wewatch.data.net.RetrofitClient.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.raywenderlich.wewatch.data.model.MoviesResponse> searchMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.raywenderlich.wewatch.data.model.details.MovieDetails> getMovie(int movieId) {
        return null;
    }
    
    public RetrofitClient() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/raywenderlich/wewatch/data/net/RetrofitClient$Companion;", "", "()V", "API_KEY", "", "TMDB_BASE_URL", "TMDB_IMAGEURL", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}