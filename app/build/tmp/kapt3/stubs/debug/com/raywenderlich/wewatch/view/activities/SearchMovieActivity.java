package com.raywenderlich.wewatch.view.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\u0012\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/raywenderlich/wewatch/view/activities/SearchMovieActivity;", "Lcom/raywenderlich/wewatch/view/activities/BaseActivity;", "()V", "adapter", "Lcom/raywenderlich/wewatch/view/adapters/SearchListAdapter;", "title", "", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "toolbar$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/raywenderlich/wewatch/viewmodel/SearchViewModel;", "displayConfirmation", "", "movie", "Lcom/raywenderlich/wewatch/data/model/Movie;", "getToolbarInstance", "hideLoading", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "searchMovie", "showLoading", "showMessage", "app_debug"})
public final class SearchMovieActivity extends com.raywenderlich.wewatch.view.activities.BaseActivity {
    private final kotlin.Lazy toolbar$delegate = null;
    private com.raywenderlich.wewatch.view.adapters.SearchListAdapter adapter;
    private com.raywenderlich.wewatch.viewmodel.SearchViewModel viewModel;
    private java.lang.String title;
    private java.util.HashMap _$_findViewCache;
    
    private final androidx.appcompat.widget.Toolbar getToolbar() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.appcompat.widget.Toolbar getToolbarInstance() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showLoading() {
    }
    
    private final void hideLoading() {
    }
    
    private final void showMessage() {
    }
    
    private final void displayConfirmation(com.raywenderlich.wewatch.data.model.Movie movie) {
    }
    
    private final void searchMovie() {
    }
    
    public SearchMovieActivity() {
        super();
    }
}