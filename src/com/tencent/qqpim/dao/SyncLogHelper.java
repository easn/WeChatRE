package com.tencent.qqpim.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class SyncLogHelper extends SQLiteOpenHelper
{
  public static final String ADD = "add_num";
  public static final String BACKUP_OR_RESTORE = "backup_or_restore";
  public static final String CLIENT_ADD = "client_add_num";
  public static final String CLIENT_DELETE = "client_delete_num";
  public static final String CLIENT_MODIFY = "client_modify_num";
  public static final String DELETE = "delete_num";
  public static final String DOWNLOAD = "download";
  public static final String END = "end";
  public static final String ID = "_id";
  public static final String LOCAL_BACKUP_ID = "local_backup_id";
  public static final String MODIFY = "modify_num";
  public static final String QQ_ACCOUNT = "qq_account";
  public static final String SERVER_ADD = "server_add_num";
  public static final String SERVER_DELETE = "server_delete_num";
  public static final String SERVER_MODIFY = "server_modify_num";
  public static final String START = "start";
  public static final String SUCCEED = "succeed";
  public static final String SYNC_METHOD = "sync_method";
  public static final String TB_NAME = "sync_log";
  public static final String TYPE = "type";
  public static final String UPLOAD = "upload";

  public SyncLogHelper(Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    super(paramContext, paramString, paramCursorFactory, paramInt);
  }

  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sync_log (_id INTEGER PRIMARY KEY,qq_account VARCHAR,type INTEGER,start INT64,end INT64,add_num INTEGER,modify_num INTEGER,delete_num INTEGER,backup_or_restore INTEGER,upload INT64,download INT64, succeed INTEGER,client_add_num INTEGER,client_modify_num INTEGER,client_delete_num INTEGER,server_add_num INTEGER,server_modify_num INTEGER,server_delete_num INTEGER,sync_method INTEGER,local_backup_id INTEGER)");
  }

  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (paramInt1 < 3)
    {
      paramSQLiteDatabase.execSQL("ALTER TABLE sync_log ADD client_add_num INTEGER");
      paramSQLiteDatabase.execSQL("ALTER TABLE sync_log ADD client_modify_num INTEGER");
      paramSQLiteDatabase.execSQL("ALTER TABLE sync_log ADD client_delete_num INTEGER");
      paramSQLiteDatabase.execSQL("ALTER TABLE sync_log ADD server_add_num INTEGER");
      paramSQLiteDatabase.execSQL("ALTER TABLE sync_log ADD server_modify_num INTEGER");
      paramSQLiteDatabase.execSQL("ALTER TABLE sync_log ADD server_delete_num INTEGER");
      paramSQLiteDatabase.execSQL("ALTER TABLE sync_log ADD sync_method INTEGER");
      paramSQLiteDatabase.execSQL("ALTER TABLE sync_log ADD local_backup_id INTEGER");
    }
    onCreate(paramSQLiteDatabase);
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.qqpim.dao.SyncLogHelper
 * JD-Core Version:    0.6.2
 */