package com.raywenderlich.wewatch.view.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\b2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0014\u0010\u0013\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/raywenderlich/wewatch/view/adapters/SearchListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/raywenderlich/wewatch/view/adapters/SearchListAdapter$MovieHolder;", "movies", "", "Lcom/raywenderlich/wewatch/data/model/Movie;", "listener", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setMovies", "movieList", "", "MovieHolder", "app_debug"})
public final class SearchListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.raywenderlich.wewatch.view.adapters.SearchListAdapter.MovieHolder> {
    private final java.util.List<com.raywenderlich.wewatch.data.model.Movie> movies = null;
    private kotlin.jvm.functions.Function1<? super com.raywenderlich.wewatch.data.model.Movie, kotlin.Unit> listener;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.raywenderlich.wewatch.view.adapters.SearchListAdapter.MovieHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.wewatch.view.adapters.SearchListAdapter.MovieHolder holder, int position) {
    }
    
    public final void setMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.raywenderlich.wewatch.data.model.Movie> movieList) {
    }
    
    public SearchListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.raywenderlich.wewatch.data.model.Movie> movies, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.raywenderlich.wewatch.data.model.Movie, kotlin.Unit> listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/raywenderlich/wewatch/view/adapters/SearchListAdapter$MovieHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/raywenderlich/wewatch/view/adapters/SearchListAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bind", "", "movie", "Lcom/raywenderlich/wewatch/data/model/Movie;", "position", "", "app_debug"})
    public final class MovieHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View view = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.raywenderlich.wewatch.data.model.Movie movie, int position) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getView() {
            return null;
        }
        
        public MovieHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}