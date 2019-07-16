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
public final class ScheduleDao_Impl implements ScheduleDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfSchedule;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public ScheduleDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSchedule = new EntityInsertionAdapter<Schedule>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Schedule`(`cinemaname`,`d16`,`d18`,`d110`,`d112`,`d26`,`d28`,`d210`,`d212`,`d36`,`d38`,`d310`,`d312`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Schedule value) {
        if (value.getCinemaname() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCinemaname());
        }
        if (value.getD16() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getD16());
        }
        if (value.getD18() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getD18());
        }
        if (value.getD110() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getD110());
        }
        if (value.getD112() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getD112());
        }
        if (value.getD26() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getD26());
        }
        if (value.getD28() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getD28());
        }
        if (value.getD210() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getD210());
        }
        if (value.getD212() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getD212());
        }
        if (value.getD36() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getD36());
        }
        if (value.getD38() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getD38());
        }
        if (value.getD310() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getD310());
        }
        if (value.getD312() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getD312());
        }
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Delete from schedule";
        return _query;
      }
    };
  }

  @Override
  public long insertSc(final Schedule sc) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfSchedule.insertAndReturnId(sc);
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
  public LiveData<List<Schedule>> getSc() {
    final String _sql = "Select * from Schedule";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Schedule"}, false, new Callable<List<Schedule>>() {
      @Override
      public List<Schedule> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfCinemaname = CursorUtil.getColumnIndexOrThrow(_cursor, "cinemaname");
          final int _cursorIndexOfD16 = CursorUtil.getColumnIndexOrThrow(_cursor, "d16");
          final int _cursorIndexOfD18 = CursorUtil.getColumnIndexOrThrow(_cursor, "d18");
          final int _cursorIndexOfD110 = CursorUtil.getColumnIndexOrThrow(_cursor, "d110");
          final int _cursorIndexOfD112 = CursorUtil.getColumnIndexOrThrow(_cursor, "d112");
          final int _cursorIndexOfD26 = CursorUtil.getColumnIndexOrThrow(_cursor, "d26");
          final int _cursorIndexOfD28 = CursorUtil.getColumnIndexOrThrow(_cursor, "d28");
          final int _cursorIndexOfD210 = CursorUtil.getColumnIndexOrThrow(_cursor, "d210");
          final int _cursorIndexOfD212 = CursorUtil.getColumnIndexOrThrow(_cursor, "d212");
          final int _cursorIndexOfD36 = CursorUtil.getColumnIndexOrThrow(_cursor, "d36");
          final int _cursorIndexOfD38 = CursorUtil.getColumnIndexOrThrow(_cursor, "d38");
          final int _cursorIndexOfD310 = CursorUtil.getColumnIndexOrThrow(_cursor, "d310");
          final int _cursorIndexOfD312 = CursorUtil.getColumnIndexOrThrow(_cursor, "d312");
          final List<Schedule> _result = new ArrayList<Schedule>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Schedule _item;
            final String _tmpCinemaname;
            _tmpCinemaname = _cursor.getString(_cursorIndexOfCinemaname);
            final String _tmpD16;
            _tmpD16 = _cursor.getString(_cursorIndexOfD16);
            final String _tmpD18;
            _tmpD18 = _cursor.getString(_cursorIndexOfD18);
            final String _tmpD110;
            _tmpD110 = _cursor.getString(_cursorIndexOfD110);
            final String _tmpD112;
            _tmpD112 = _cursor.getString(_cursorIndexOfD112);
            final String _tmpD26;
            _tmpD26 = _cursor.getString(_cursorIndexOfD26);
            final String _tmpD28;
            _tmpD28 = _cursor.getString(_cursorIndexOfD28);
            final String _tmpD210;
            _tmpD210 = _cursor.getString(_cursorIndexOfD210);
            final String _tmpD212;
            _tmpD212 = _cursor.getString(_cursorIndexOfD212);
            final String _tmpD36;
            _tmpD36 = _cursor.getString(_cursorIndexOfD36);
            final String _tmpD38;
            _tmpD38 = _cursor.getString(_cursorIndexOfD38);
            final String _tmpD310;
            _tmpD310 = _cursor.getString(_cursorIndexOfD310);
            final String _tmpD312;
            _tmpD312 = _cursor.getString(_cursorIndexOfD312);
            _item = new Schedule(_tmpCinemaname,_tmpD16,_tmpD18,_tmpD110,_tmpD112,_tmpD26,_tmpD28,_tmpD210,_tmpD212,_tmpD36,_tmpD38,_tmpD310,_tmpD312);
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
}
