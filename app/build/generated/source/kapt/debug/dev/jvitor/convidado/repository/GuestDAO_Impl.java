package dev.jvitor.convidado.repository;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import dev.jvitor.convidado.model.GuestModel;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GuestDAO_Impl implements GuestDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<GuestModel> __insertionAdapterOfGuestModel;

  private final EntityDeletionOrUpdateAdapter<GuestModel> __deletionAdapterOfGuestModel;

  private final EntityDeletionOrUpdateAdapter<GuestModel> __updateAdapterOfGuestModel;

  public GuestDAO_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGuestModel = new EntityInsertionAdapter<GuestModel>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `Guest` (`id`,`name`,`presence`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final GuestModel entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        final int _tmp = entity.getPresence() ? 1 : 0;
        statement.bindLong(3, _tmp);
      }
    };
    this.__deletionAdapterOfGuestModel = new EntityDeletionOrUpdateAdapter<GuestModel>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `Guest` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final GuestModel entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfGuestModel = new EntityDeletionOrUpdateAdapter<GuestModel>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `Guest` SET `id` = ?,`name` = ?,`presence` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final GuestModel entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        final int _tmp = entity.getPresence() ? 1 : 0;
        statement.bindLong(3, _tmp);
        statement.bindLong(4, entity.getId());
      }
    };
  }

  @Override
  public long insert(final GuestModel guest) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final long _result = __insertionAdapterOfGuestModel.insertAndReturnId(guest);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final GuestModel guest) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfGuestModel.handle(guest);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int update(final GuestModel guest) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total += __updateAdapterOfGuestModel.handle(guest);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public GuestModel get(final int id) {
    final String _sql = "SELECT * FROM Guest WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfPresence = CursorUtil.getColumnIndexOrThrow(_cursor, "presence");
      final GuestModel _result;
      if (_cursor.moveToFirst()) {
        _result = new GuestModel();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        _result.setName(_tmpName);
        final boolean _tmpPresence;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfPresence);
        _tmpPresence = _tmp != 0;
        _result.setPresence(_tmpPresence);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<GuestModel> getAll() {
    final String _sql = "SELECT * FROM Guest";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfPresence = CursorUtil.getColumnIndexOrThrow(_cursor, "presence");
      final List<GuestModel> _result = new ArrayList<GuestModel>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final GuestModel _item;
        _item = new GuestModel();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        _item.setName(_tmpName);
        final boolean _tmpPresence;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfPresence);
        _tmpPresence = _tmp != 0;
        _item.setPresence(_tmpPresence);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<GuestModel> getPresentOrAbsent(final int filter) {
    final String _sql = "SELECT * FROM Guest WHERE presence = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, filter);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfPresence = CursorUtil.getColumnIndexOrThrow(_cursor, "presence");
      final List<GuestModel> _result = new ArrayList<GuestModel>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final GuestModel _item;
        _item = new GuestModel();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        _item.setName(_tmpName);
        final boolean _tmpPresence;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfPresence);
        _tmpPresence = _tmp != 0;
        _item.setPresence(_tmpPresence);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
