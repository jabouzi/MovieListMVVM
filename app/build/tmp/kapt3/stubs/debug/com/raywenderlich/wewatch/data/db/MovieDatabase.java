package com.raywenderlich.wewatch.data.db;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.raywenderlich.wewatch.data.db.GenreIdConverter.class})
@androidx.room.Database(entities = {com.raywenderlich.wewatch.data.model.Movie.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/raywenderlich/wewatch/data/db/MovieDatabase;", "Landroidx/room/RoomDatabase;", "()V", "movieDao", "Lcom/raywenderlich/wewatch/data/db/MovieDao;", "Companion", "app_debug"})
public abstract class MovieDatabase extends androidx.room.RoomDatabase {
    private static final java.lang.Object lock = null;
    private static final java.lang.String DB_NAME = "MovieDatabase";
    private static com.raywenderlich.wewatch.data.db.MovieDatabase INSTANCE;
    public static final com.raywenderlich.wewatch.data.db.MovieDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.raywenderlich.wewatch.data.db.MovieDao movieDao();
    
    public MovieDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/raywenderlich/wewatch/data/db/MovieDatabase$Companion;", "", "()V", "DB_NAME", "", "INSTANCE", "Lcom/raywenderlich/wewatch/data/db/MovieDatabase;", "lock", "getInstance", "application", "Landroid/app/Application;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.raywenderlich.wewatch.data.db.MovieDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.app.Application application) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}