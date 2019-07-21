package info.avanish.allexamplesofandroid.observer;

/**
 * Created by kunwa on 3/14/2018.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import info.avanish.allexamplesofandroid.R;

public class UserProfileActivity extends AppCompatActivity implements RepositoryObserver {
    private Subject mUserDataRepository;
    private TextView mTextViewUserFullName;
    private TextView mTextViewUserAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_user_profile);

      //  mTextViewUserAge = (TextView) findViewById(R.id.tv_age);
        //mTextViewUserFullName = (TextView) findViewById(R.id.tv_fullname);

        mUserDataRepository = UserDataRepository.getInstance();
        mUserDataRepository.registerObserver(this);
    }

    @Override
    public void onUserDataChanged(String fullname, int age) {
        mTextViewUserFullName.setText(fullname);
        mTextViewUserAge.setText(age);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mUserDataRepository.removeObserver(this);
    }
}
