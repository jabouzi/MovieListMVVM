package com.raywenderlich.wewatch.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\b\u0010\f\u001a\u00020\nH\u0002J\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/raywenderlich/wewatch/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/raywenderlich/wewatch/data/MovieRepository;", "(Lcom/raywenderlich/wewatch/data/MovieRepository;)V", "allMovies", "Landroidx/lifecycle/MediatorLiveData;", "", "Lcom/raywenderlich/wewatch/data/model/Movie;", "deleteSavedMovies", "", "movie", "getAllMovies", "getSavedMovies", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MediatorLiveData<java.util.List<com.raywenderlich.wewatch.data.model.Movie>> allMovies = null;
    private final com.raywenderlich.wewatch.data.MovieRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.util.List<com.raywenderlich.wewatch.data.model.Movie>> getSavedMovies() {
        return null;
    }
    
    private final void getAllMovies() {
    }
    
    public final void deleteSavedMovies(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.wewatch.data.model.Movie movie) {
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.wewatch.data.MovieRepository repository) {
        super();
    }
    
    public MainViewModel() {
        super();
    }
}