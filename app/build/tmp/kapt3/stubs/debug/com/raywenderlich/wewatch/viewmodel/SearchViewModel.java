package com.raywenderlich.wewatch.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b0\n2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/raywenderlich/wewatch/viewmodel/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/raywenderlich/wewatch/data/MovieRepository;", "(Lcom/raywenderlich/wewatch/data/MovieRepository;)V", "saveMovie", "", "movie", "Lcom/raywenderlich/wewatch/data/model/Movie;", "searchMovie", "Landroidx/lifecycle/LiveData;", "", "query", "", "app_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    private final com.raywenderlich.wewatch.data.MovieRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.wewatch.data.model.Movie>> searchMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    public final void saveMovie(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.wewatch.data.model.Movie movie) {
    }
    
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.wewatch.data.MovieRepository repository) {
        super();
    }
    
    public SearchViewModel() {
        super();
    }
}