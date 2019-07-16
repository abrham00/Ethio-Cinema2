package the.app.ethiocinema.data;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDao_Impl implements MovieDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfMovie;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfMovie;

  private final SharedSQLiteStatement __preparedStmtOfClearAllMovies;

  public MovieDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovie = new EntityInsertionAdapter<Movie>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Movies`(`mid`,`name`,`imagelink`,`description`,`length`,`genere`,`showingcinema`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Movie value) {
        stmt.bindLong(1, value.getMid());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getImagelink() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImagelink());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getLength() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getLength());
        }
        if (value.getGenere() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getGenere());
        }
        if (value.getShowingcinema() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getShowingcinema());
        }
      }
    };
    this.__updateAdapterOfMovie = new EntityDeletionOrUpdateAdapter<Movie>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Movies` SET `mid` = ?,`name` = ?,`imagelink` = ?,`description` = ?,`length` = ?,`genere` = ?,`showingcinema` = ? WHERE `mid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Movie value) {
        stmt.bindLong(1, value.getMid());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getImagelink() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImagelink());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getLength() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getLength());
        }
        if (value.getGenere() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getGenere());
        }
        if (value.getShowingcinema() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getShowingcinema());
        }
        stmt.bindLong(8, value.getMid());
      }
    };
    this.__preparedStmtOfClearAllMovies = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Delete from Movies ";
        return _query;
      }
    };
  }

  @Override
  public long insertMovie(final Movie movie) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfMovie.insertAndReturnId(movie);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updateMovie(final Movie movie) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfMovie.handle(movie);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void ClearAllMovies() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearAllMovies.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearAllMovies.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Movie>> getMovies() {
    final String _sql = "select * from Movies";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Movies"}, false, new Callable<List<Movie>>() {
      @Override
      public List<Movie> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfMid = CursorUtil.getColumnIndexOrThrow(_cursor, "mid");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfImagelink = CursorUtil.getColumnIndexOrThrow(_cursor, "imagelink");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfLength = CursorUtil.getColumnIndexOrThrow(_cursor, "length");
          final int _cursorIndexOfGenere = CursorUtil.getColumnIndexOrThrow(_cursor, "genere");
          final int _cursorIndexOfShowingcinema = CursorUtil.getColumnIndexOrThrow(_cursor, "showingcinema");
          final List<Movie> _result = new ArrayList<Movie>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Movie _item;
            final int _tmpMid;
            _tmpMid = _cursor.getInt(_cursorIndexOfMid);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpImagelink;
            _tmpImagelink = _cursor.getString(_cursorIndexOfImagelink);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpLength;
            _tmpLength = _cursor.getString(_cursorIndexOfLength);
            final String _tmpGenere;
            _tmpGenere = _cursor.getString(_cursorIndexOfGenere);
            final String _tmpShowingcinema;
            _tmpShowingcinema = _cursor.getString(_cursorIndexOfShowingcinema);
            _item = new Movie(_tmpMid,_tmpName,_tmpImagelink,_tmpDescription,_tmpLength,_tmpGenere,_tmpShowingcinema);
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
    });
  }

  @Override
  public Movie getInfo(final int id) {
    final String _sql = "select * from Movies where mid=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfMid = CursorUtil.getColumnIndexOrThrow(_cursor, "mid");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfImagelink = CursorUtil.getColumnIndexOrThrow(_cursor, "imagelink");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfLength = CursorUtil.getColumnIndexOrThrow(_cursor, "length");
      final int _cursorIndexOfGenere = CursorUtil.getColumnIndexOrThrow(_cursor, "genere");
      final int _cursorIndexOfShowingcinema = CursorUtil.getColumnIndexOrThrow(_cursor, "showingcinema");
      final Movie _result;
      if(_cursor.moveToFirst()) {
        final int _tmpMid;
        _tmpMid = _cursor.getInt(_cursorIndexOfMid);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpImagelink;
        _tmpImagelink = _cursor.getString(_cursorIndexOfImagelink);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpLength;
        _tmpLength = _cursor.getString(_cursorIndexOfLength);
        final String _tmpGenere;
        _tmpGenere = _cursor.getString(_cursorIndexOfGenere);
        final String _tmpShowingcinema;
        _tmpShowingcinema = _cursor.getString(_cursorIndexOfShowingcinema);
        _result = new Movie(_tmpMid,_tmpName,_tmpImagelink,_tmpDescription,_tmpLength,_tmpGenere,_tmpShowingcinema);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
