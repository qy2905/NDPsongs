package sg.edu.rp.c346.id21027604.ndpsongs;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "ndpsongs.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_SONG = "song";
    private static final String COLUMN_ID = "_id";
    private static final String TITLE_COLUMN = "title";
    private static final String SINGERS_COLUMN = "singers";
    private static final String YEAR_COLUMN = "year";
    private static final String RATING_COLUMN = "stars";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createNoteTableSQL = "CREATE TABLE" + TABLE_SONG + "("
                + COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT," + TITLE_COLUMN
                + " TEXT ," + SINGERS_COLUMN + " TEXT ," + YEAR_COLUMN + " INTEGER ," + RATING_COLUMN + " INTEGER ) ";
        db.execSQL(createNoteTableSQL);
        Log.i("info", "created tables");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + TABLE_SONG);
        onCreate(db);
    }
    public long insertsong(String title, String singers, int year, int stars) {
        SQLiteDatabase db = this.getWritableDatabase();
        
    }
}
