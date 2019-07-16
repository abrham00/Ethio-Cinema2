package the.app.ethiocinema.data;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.DBUtil;
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
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class db_Impl extends db {
  private volatile MovieDao _movieDao;

  private volatile ScheduleDao _scheduleDao;

  private volatile CinemaDao _cinemaDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(8) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Movies` (`mid` INTEGER NOT NULL, `name` TEXT NOT NULL, `imagelink` TEXT NOT NULL, `description` TEXT NOT NULL, `length` TEXT NOT NULL, `genere` TEXT NOT NULL, `showingcinema` TEXT NOT NULL, PRIMARY KEY(`mid`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Cinema` (`name` TEXT NOT NULL, `location` TEXT NOT NULL, `weblink` TEXT NOT NULL, `phone` TEXT NOT NULL, PRIMARY KEY(`name`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Schedule` (`cinemaname` TEXT NOT NULL, `d16` TEXT NOT NULL, `d18` TEXT NOT NULL, `d110` TEXT NOT NULL, `d112` TEXT NOT NULL, `d26` TEXT NOT NULL, `d28` TEXT NOT NULL, `d210` TEXT NOT NULL, `d212` TEXT NOT NULL, `d36` TEXT NOT NULL, `d38` TEXT NOT NULL, `d310` TEXT NOT NULL, `d312` TEXT NOT NULL, PRIMARY KEY(`cinemaname`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a272b80ffe329a502f9f6f9e62be0e5f')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Movies`");
        _db.execSQL("DROP TABLE IF EXISTS `Cinema`");
        _db.execSQL("DROP TABLE IF EXISTS `Schedule`");
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
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMovies = new HashMap<String, TableInfo.Column>(7);
        _columnsMovies.put("mid", new TableInfo.Column("mid", "INTEGER", true, 1));
        _columnsMovies.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsMovies.put("imagelink", new TableInfo.Column("imagelink", "TEXT", true, 0));
        _columnsMovies.put("description", new TableInfo.Column("description", "TEXT", true, 0));
        _columnsMovies.put("length", new TableInfo.Column("length", "TEXT", true, 0));
        _columnsMovies.put("genere", new TableInfo.Column("genere", "TEXT", true, 0));
        _columnsMovies.put("showingcinema", new TableInfo.Column("showingcinema", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMovies = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMovies = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMovies = new TableInfo("Movies", _columnsMovies, _foreignKeysMovies, _indicesMovies);
        final TableInfo _existingMovies = TableInfo.read(_db, "Movies");
        if (! _infoMovies.equals(_existingMovies)) {
          throw new IllegalStateException("Migration didn't properly handle Movies(the.app.ethiocinema.data.Movie).\n"
                  + " Expected:\n" + _infoMovies + "\n"
                  + " Found:\n" + _existingMovies);
        }
        final HashMap<String, TableInfo.Column> _columnsCinema = new HashMap<String, TableInfo.Column>(4);
        _columnsCinema.put("name", new TableInfo.Column("name", "TEXT", true, 1));
        _columnsCinema.put("location", new TableInfo.Column("location", "TEXT", true, 0));
        _columnsCinema.put("weblink", new TableInfo.Column("weblink", "TEXT", true, 0));
        _columnsCinema.put("phone", new TableInfo.Column("phone", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCinema = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCinema = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCinema = new TableInfo("Cinema", _columnsCinema, _foreignKeysCinema, _indicesCinema);
        final TableInfo _existingCinema = TableInfo.read(_db, "Cinema");
        if (! _infoCinema.equals(_existingCinema)) {
          throw new IllegalStateException("Migration didn't properly handle Cinema(the.app.ethiocinema.data.Cinema).\n"
                  + " Expected:\n" + _infoCinema + "\n"
                  + " Found:\n" + _existingCinema);
        }
        final HashMap<String, TableInfo.Column> _columnsSchedule = new HashMap<String, TableInfo.Column>(13);
        _columnsSchedule.put("cinemaname", new TableInfo.Column("cinemaname", "TEXT", true, 1));
        _columnsSchedule.put("d16", new TableInfo.Column("d16", "TEXT", true, 0));
        _columnsSchedule.put("d18", new TableInfo.Column("d18", "TEXT", true, 0));
        _columnsSchedule.put("d110", new TableInfo.Column("d110", "TEXT", true, 0));
        _columnsSchedule.put("d112", new TableInfo.Column("d112", "TEXT", true, 0));
        _columnsSchedule.put("d26", new TableInfo.Column("d26", "TEXT", true, 0));
        _columnsSchedule.put("d28", new TableInfo.Column("d28", "TEXT", true, 0));
        _columnsSchedule.put("d210", new TableInfo.Column("d210", "TEXT", true, 0));
        _columnsSchedule.put("d212", new TableInfo.Column("d212", "TEXT", true, 0));
        _columnsSchedule.put("d36", new TableInfo.Column("d36", "TEXT", true, 0));
        _columnsSchedule.put("d38", new TableInfo.Column("d38", "TEXT", true, 0));
        _columnsSchedule.put("d310", new TableInfo.Column("d310", "TEXT", true, 0));
        _columnsSchedule.put("d312", new TableInfo.Column("d312", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSchedule = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSchedule = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSchedule = new TableInfo("Schedule", _columnsSchedule, _foreignKeysSchedule, _indicesSchedule);
        final TableInfo _existingSchedule = TableInfo.read(_db, "Schedule");
        if (! _infoSchedule.equals(_existingSchedule)) {
          throw new IllegalStateException("Migration didn't properly handle Schedule(the.app.ethiocinema.data.Schedule).\n"
                  + " Expected:\n" + _infoSchedule + "\n"
                  + " Found:\n" + _existingSchedule);
        }
      }
    }, "a272b80ffe329a502f9f6f9e62be0e5f", "20866725ae5f6e7fc237a1866a376115");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Movies","Cinema","Schedule");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Movies`");
      _db.execSQL("DELETE FROM `Cinema`");
      _db.execSQL("DELETE FROM `Schedule`");
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

  @Override
  public ScheduleDao scheduleDao() {
    if (_scheduleDao != null) {
      return _scheduleDao;
    } else {
      synchronized(this) {
        if(_scheduleDao == null) {
          _scheduleDao = new ScheduleDao_Impl(this);
        }
        return _scheduleDao;
      }
    }
  }

  @Override
  public CinemaDao cinemaDao() {
    if (_cinemaDao != null) {
      return _cinemaDao;
    } else {
      synchronized(this) {
        if(_cinemaDao == null) {
          _cinemaDao = new CinemaDao_Impl(this);
        }
        return _cinemaDao;
      }
    }
  }
}
