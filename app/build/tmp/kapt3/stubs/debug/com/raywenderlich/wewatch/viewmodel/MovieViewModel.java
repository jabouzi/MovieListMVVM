package com.raywenderlich.wewatch.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/raywenderlich/wewatch/viewmodel/MovieViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/raywenderlich/wewatch/data/MovieRepository;", "(Lcom/raywenderlich/wewatch/data/MovieRepository;)V", "getMovie", "Landroidx/lifecycle/LiveData;", "Lcom/raywenderlich/wewatch/data/model/details/MovieDetails;", "movieId", "", "app_debug"})
public final class MovieViewModel extends androidx.lifecycle.ViewModel {
    private final com.raywenderlich.wewatch.data.MovieRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.raywenderlich.wewatch.data.model.details.MovieDetails> getMovie(int movieId) {
        return null;
    }
    
    public MovieViewModel(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.wewatch.data.MovieRepository repository) {
        super();
    }
    
    public MovieViewModel() {
        super();
    }
}