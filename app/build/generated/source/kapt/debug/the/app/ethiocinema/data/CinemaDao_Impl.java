package the.app.ethiocinema.data;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
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
public final class CinemaDao_Impl implements CinemaDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfCinema;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public CinemaDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCinema = new EntityInsertionAdapter<Cinema>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Cinema`(`name`,`location`,`weblink`,`phone`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Cinema value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        if (value.getLocation() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getLocation());
        }
        if (value.getWeblink() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getWeblink());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPhone());
        }
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Delete from Cinema ";
        return _query;
      }
    };
  }

  @Override
  public long insertCinema(final Cinema cinema) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfCinema.insertAndReturnId(cinema);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clear() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClear.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClear.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Cinema>> getCinema() {
    final String _sql = "select * from Cinema";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Cinema"}, false, new Callable<List<Cinema>>() {
      @Override
      public List<Cinema> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
          final int _cursorIndexOfWeblink = CursorUtil.getColumnIndexOrThrow(_cursor, "weblink");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final List<Cinema> _result = new ArrayList<Cinema>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Cinema _item;
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpLocation;
            _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            final String _tmpWeblink;
            _tmpWeblink = _cursor.getString(_cursorIndexOfWeblink);
            final String _tmpPhone;
            _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            _item = new Cinema(_tmpName,_tmpLocation,_tmpWeblink,_tmpPhone);
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
  public LiveData<Cinema> getInfo(final String name) {
    final String _sql = "select * from Cinema where name=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"Cinema"}, false, new Callable<Cinema>() {
      @Override
      public Cinema call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
          final int _cursorIndexOfWeblink = CursorUtil.getColumnIndexOrThrow(_cursor, "weblink");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final Cinema _result;
          if(_cursor.moveToFirst()) {
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpLocation;
            _tmpLocation = _cursor.getString(_cursorIndexOfLocation);
            final String _tmpWeblink;
            _tmpWeblink = _cursor.getString(_cursorIndexOfWeblink);
            final String _tmpPhone;
            _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            _result = new Cinema(_tmpName,_tmpLocation,_tmpWeblink,_tmpPhone);
          } else {
            _result = null;
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
}
