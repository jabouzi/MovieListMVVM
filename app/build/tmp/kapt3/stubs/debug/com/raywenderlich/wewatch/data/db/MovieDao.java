package com.raywenderlich.wewatch.data.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\'\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bH\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\rH\'J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\rH\'\u00a8\u0006\u0011"}, d2 = {"Lcom/raywenderlich/wewatch/data/db/MovieDao;", "", "delete", "", "id", "", "(Ljava/lang/Integer;)V", "deleteMovies", "watched", "", "getAll", "Landroidx/lifecycle/LiveData;", "", "Lcom/raywenderlich/wewatch/data/model/Movie;", "insert", "movie", "updateMovie", "app_debug"})
public abstract interface MovieDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.wewatch.data.model.Movie movie);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from movie")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.wewatch.data.model.Movie>> getAll();
    
    @androidx.room.Query(value = "delete from movie where watched = :watched")
    public abstract void deleteMovies(boolean watched);
    
    @androidx.room.Update()
    public abstract void updateMovie(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.wewatch.data.model.Movie movie);
    
    @androidx.room.Query(value = "DELETE FROM movie WHERE id = :id")
    public abstract void delete(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id);
}