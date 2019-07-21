package info.avanish.allexamplesofandroid.roomtest.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import info.avanish.allexamplesofandroid.roomtest.model.User;

/**
 * Created by kunwa on 06-03-2018.
 */
@Database(entities = {User.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
