package info.avanish.allexamplesofandroid.roomtest.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import info.avanish.allexamplesofandroid.roomtest.model.User;

/**
 * Created by kunwa on 06-03-2018.
 */
@Dao
public interface UserDao {
    @Query("SELECT * FROM user")
    List<User> getAllUsers();

    @Insert
    void insertAll(User... users);
}
