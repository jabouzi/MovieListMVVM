package com.raywenderlich.wewatch.data.db;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.lifecycle.ComputableLiveData;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.InvalidationTracker.Observer;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.raywenderlich.wewatch.data.model.Movie;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class MovieDao_Impl implements MovieDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfMovie;

  private final GenreIdConverter __genreIdConverter = new GenreIdConverter();

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfMovie;

  private final SharedSQLiteStatement __preparedStmtOfDeleteMovies;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public MovieDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovie = new EntityInsertionAdapter<Movie>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Movie`(`voteCount`,`id`,`video`,`voteAverage`,`title`,`popularity`,`posterPath`,`originalLanguage`,`originalTitle`,`genreIds`,`backdropPath`,`adult`,`overview`,`releaseDate`,`watched`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Movie value) {
        if (value.getVoteCount() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getVoteCount());
        }
        if (value.getId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getId());
        }
        final Integer _tmp;
        _tmp = value.getVideo() == null ? null : (value.getVideo() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, _tmp);
        }
        if (value.getVoteAverage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindDouble(4, value.getVoteAverage());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTitle());
        }
        if (value.getPopularity() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindDouble(6, value.getPopularity());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPosterPath());
        }
        if (value.getOriginalLanguage() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getOriginalLanguage());
        }
        if (value.getOriginalTitle() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getOriginalTitle());
        }
        final String _tmp_1;
        _tmp_1 = __genreIdConverter.genreListToString(value.getGenreIds());
        if (_tmp_1 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp_1);
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getBackdropPath());
        }
        final Integer _tmp_2;
        _tmp_2 = value.getAdult() == null ? null : (value.getAdult() ? 1 : 0);
        if (_tmp_2 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, _tmp_2);
        }
        if (value.getOverview() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getOverview());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getReleaseDate());
        }
        final int _tmp_3;
        _tmp_3 = value.getWatched() ? 1 : 0;
        stmt.bindLong(15, _tmp_3);
      }
    };
    this.__updateAdapterOfMovie = new EntityDeletionOrUpdateAdapter<Movie>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Movie` SET `voteCount` = ?,`id` = ?,`video` = ?,`voteAverage` = ?,`title` = ?,`popularity` = ?,`posterPath` = ?,`originalLanguage` = ?,`originalTitle` = ?,`genreIds` = ?,`backdropPath` = ?,`adult` = ?,`overview` = ?,`releaseDate` = ?,`watched` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Movie value) {
        if (value.getVoteCount() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getVoteCount());
        }
        if (value.getId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getId());
        }
        final Integer _tmp;
        _tmp = value.getVideo() == null ? null : (value.getVideo() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, _tmp);
        }
        if (value.getVoteAverage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindDouble(4, value.getVoteAverage());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTitle());
        }
        if (value.getPopularity() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindDouble(6, value.getPopularity());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPosterPath());
        }
        if (value.getOriginalLanguage() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getOriginalLanguage());
        }
        if (value.getOriginalTitle() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getOriginalTitle());
        }
        final String _tmp_1;
        _tmp_1 = __genreIdConverter.genreListToString(value.getGenreIds());
        if (_tmp_1 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp_1);
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getBackdropPath());
        }
        final Integer _tmp_2;
        _tmp_2 = value.getAdult() == null ? null : (value.getAdult() ? 1 : 0);
        if (_tmp_2 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, _tmp_2);
        }
        if (value.getOverview() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getOverview());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getReleaseDate());
        }
        final int _tmp_3;
        _tmp_3 = value.getWatched() ? 1 : 0;
        stmt.bindLong(15, _tmp_3);
        if (value.getId() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindLong(16, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteMovies = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from movie where watched = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM movie WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(Movie movie) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfMovie.insert(movie);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateMovie(Movie movie) {
    __db.beginTransaction();
    try {
      __updateAdapterOfMovie.handle(movie);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteMovies(boolean watched) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteMovies.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      final int _tmp;
      _tmp = watched ? 1 : 0;
      _stmt.bindLong(_argIndex, _tmp);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteMovies.release(_stmt);
    }
  }

  @Override
  public void delete(Integer id) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (id == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindLong(_argIndex, id);
      }
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDelete.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Movie>> getAll() {
    final String _sql = "select * from movie";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<Movie>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<Movie> compute() {
        if (_observer == null) {
          _observer = new Observer("movie") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfVoteCount = _cursor.getColumnIndexOrThrow("voteCount");
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfVideo = _cursor.getColumnIndexOrThrow("video");
          final int _cursorIndexOfVoteAverage = _cursor.getColumnIndexOrThrow("voteAverage");
          final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
          final int _cursorIndexOfPopularity = _cursor.getColumnIndexOrThrow("popularity");
          final int _cursorIndexOfPosterPath = _cursor.getColumnIndexOrThrow("posterPath");
          final int _cursorIndexOfOriginalLanguage = _cursor.getColumnIndexOrThrow("originalLanguage");
          final int _cursorIndexOfOriginalTitle = _cursor.getColumnIndexOrThrow("originalTitle");
          final int _cursorIndexOfGenreIds = _cursor.getColumnIndexOrThrow("genreIds");
          final int _cursorIndexOfBackdropPath = _cursor.getColumnIndexOrThrow("backdropPath");
          final int _cursorIndexOfAdult = _cursor.getColumnIndexOrThrow("adult");
          final int _cursorIndexOfOverview = _cursor.getColumnIndexOrThrow("overview");
          final int _cursorIndexOfReleaseDate = _cursor.getColumnIndexOrThrow("releaseDate");
          final int _cursorIndexOfWatched = _cursor.getColumnIndexOrThrow("watched");
          final List<Movie> _result = new ArrayList<Movie>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Movie _item;
            final Integer _tmpVoteCount;
            if (_cursor.isNull(_cursorIndexOfVoteCount)) {
              _tmpVoteCount = null;
            } else {
              _tmpVoteCount = _cursor.getInt(_cursorIndexOfVoteCount);
            }
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final Boolean _tmpVideo;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfVideo)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfVideo);
            }
            _tmpVideo = _tmp == null ? null : _tmp != 0;
            final Float _tmpVoteAverage;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVoteAverage = null;
            } else {
              _tmpVoteAverage = _cursor.getFloat(_cursorIndexOfVoteAverage);
            }
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final Float _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getFloat(_cursorIndexOfPopularity);
            }
            final String _tmpPosterPath;
            _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            final String _tmpOriginalLanguage;
            _tmpOriginalLanguage = _cursor.getString(_cursorIndexOfOriginalLanguage);
            final String _tmpOriginalTitle;
            _tmpOriginalTitle = _cursor.getString(_cursorIndexOfOriginalTitle);
            final List<Integer> _tmpGenreIds;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfGenreIds);
            _tmpGenreIds = __genreIdConverter.stringToGenreList(_tmp_1);
            final String _tmpBackdropPath;
            _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            final Boolean _tmpAdult;
            final Integer _tmp_2;
            if (_cursor.isNull(_cursorIndexOfAdult)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getInt(_cursorIndexOfAdult);
            }
            _tmpAdult = _tmp_2 == null ? null : _tmp_2 != 0;
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final String _tmpReleaseDate;
            _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            final boolean _tmpWatched;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfWatched);
            _tmpWatched = _tmp_3 != 0;
            _item = new Movie(_tmpVoteCount,_tmpId,_tmpVideo,_tmpVoteAverage,_tmpTitle,_tmpPopularity,_tmpPosterPath,_tmpOriginalLanguage,_tmpOriginalTitle,_tmpGenreIds,_tmpBackdropPath,_tmpAdult,_tmpOverview,_tmpReleaseDate,_tmpWatched);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }
}
