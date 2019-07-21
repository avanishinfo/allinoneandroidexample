package info.avanish.allexamplesofandroid.roomtest;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.List;

import info.avanish.allexamplesofandroid.R;
import info.avanish.allexamplesofandroid.roomtest.db.AppDatabase;
import info.avanish.allexamplesofandroid.roomtest.model.User;

public class Main2Activity extends AppCompatActivity {

    RecyclerView listView;
    RecyclerView.Adapter adapter;

   // ArrayList<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
      /*  users = new ArrayList<>();

        for (int i = 0; i <10; i++) {
            User user= new User("avanish: # "+i,"Singh","avanishofficial@gmail.com");
            users.add(user);
        }*/

        AppDatabase appDatabase = Room.databaseBuilder(getApplicationContext(),AppDatabase.class,"production")
                .allowMainThreadQueries()
                .build();
        List<User> users = appDatabase.userDao().getAllUsers();

        listView = findViewById(R.id.room_recyclerview_id);
        listView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new UserAdapter(users);
        listView.setAdapter(adapter);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Main2Activity.this,CreateUser.class));
                finish();
               /* Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
    }

}
