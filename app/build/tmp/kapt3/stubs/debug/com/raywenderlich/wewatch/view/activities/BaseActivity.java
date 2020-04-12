package com.raywenderlich.wewatch.view.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0014\u00a8\u0006\t"}, d2 = {"Lcom/raywenderlich/wewatch/view/activities/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "getToolbarInstance", "Landroidx/appcompat/widget/Toolbar;", "initView", "", "toolbar", "onResume", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void initView(androidx.appcompat.widget.Toolbar toolbar) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract androidx.appcompat.widget.Toolbar getToolbarInstance();
    
    public BaseActivity() {
        super();
    }
}