package com.raywenderlich.wewatch.data.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class MovieDatabase_Impl extends MovieDatabase {
  private volatile MovieDao _movieDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Movie` (`voteCount` INTEGER, `id` INTEGER PRIMARY KEY AUTOINCREMENT, `video` INTEGER, `voteAverage` REAL, `title` TEXT, `popularity` REAL, `posterPath` TEXT, `originalLanguage` TEXT, `originalTitle` TEXT, `genreIds` TEXT, `backdropPath` TEXT, `adult` INTEGER, `overview` TEXT, `releaseDate` TEXT, `watched` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"706b98ca716167a8178f16ce239b1e3b\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Movie`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMovie = new HashMap<String, TableInfo.Column>(15);
        _columnsMovie.put("voteCount", new TableInfo.Column("voteCount", "INTEGER", false, 0));
        _columnsMovie.put("id", new TableInfo.Column("id", "INTEGER", false, 1));
        _columnsMovie.put("video", new TableInfo.Column("video", "INTEGER", false, 0));
        _columnsMovie.put("voteAverage", new TableInfo.Column("voteAverage", "REAL", false, 0));
        _columnsMovie.put("title", new TableInfo.Column("title", "TEXT", false, 0));
        _columnsMovie.put("popularity", new TableInfo.Column("popularity", "REAL", false, 0));
        _columnsMovie.put("posterPath", new TableInfo.Column("posterPath", "TEXT", false, 0));
        _columnsMovie.put("originalLanguage", new TableInfo.Column("originalLanguage", "TEXT", false, 0));
        _columnsMovie.put("originalTitle", new TableInfo.Column("originalTitle", "TEXT", false, 0));
        _columnsMovie.put("genreIds", new TableInfo.Column("genreIds", "TEXT", false, 0));
        _columnsMovie.put("backdropPath", new TableInfo.Column("backdropPath", "TEXT", false, 0));
        _columnsMovie.put("adult", new TableInfo.Column("adult", "INTEGER", false, 0));
        _columnsMovie.put("overview", new TableInfo.Column("overview", "TEXT", false, 0));
        _columnsMovie.put("releaseDate", new TableInfo.Column("releaseDate", "TEXT", false, 0));
        _columnsMovie.put("watched", new TableInfo.Column("watched", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMovie = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMovie = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMovie = new TableInfo("Movie", _columnsMovie, _foreignKeysMovie, _indicesMovie);
        final TableInfo _existingMovie = TableInfo.read(_db, "Movie");
        if (! _infoMovie.equals(_existingMovie)) {
          throw new IllegalStateException("Migration didn't properly handle Movie(com.raywenderlich.wewatch.data.model.Movie).\n"
                  + " Expected:\n" + _infoMovie + "\n"
                  + " Found:\n" + _existingMovie);
        }
      }
    }, "706b98ca716167a8178f16ce239b1e3b", "87e777abc11b62b0b30fda67ed55e6b5");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "Movie");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Movie`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public MovieDao movieDao() {
    if (_movieDao != null) {
      return _movieDao;
    } else {
      synchronized(this) {
        if(_movieDao == null) {
          _movieDao = new MovieDao_Impl(this);
        }
        return _movieDao;
      }
    }
  }
}
