package info.avanish.allexamplesofandroid.roomtest;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import info.avanish.allexamplesofandroid.R;
import info.avanish.allexamplesofandroid.roomtest.db.AppDatabase;
import info.avanish.allexamplesofandroid.roomtest.model.User;

/**
 * Created by kunwa on 05-03-2018.
 */

public class CreateUser extends AppCompatActivity {
    EditText firstname,lastname,email;
    Button save;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_user_layout);

        firstname = findViewById(R.id.first_name);
        lastname = findViewById(R.id.last_name);
        email = findViewById(R.id.email);

        save = findViewById(R.id.save);

        final AppDatabase db = Room.databaseBuilder(getApplicationContext(),AppDatabase.class,"production")
                .allowMainThreadQueries()
                .build();

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                db.userDao().insertAll(new User(firstname.getText().toString(),lastname.getText().toString(),email.getText().toString()));
                startActivity(new Intent(CreateUser.this,Main2Activity.class));

                finish();
                //  Toast.makeText(CreateUser.this, ""+firstname.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(CreateUser.this,Main2Activity.class));
    }
}
