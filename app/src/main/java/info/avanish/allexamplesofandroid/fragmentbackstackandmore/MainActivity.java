package info.avanish.allexamplesofandroid.fragmentbackstackandmore;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import info.avanish.allexamplesofandroid.R;

public class MainActivity extends AppCompatActivity implements FragmentManager.OnBackStackChangedListener{
Button fragA,fragB,fragC;
    // Used to load the 'native-lib' library on application startup.

    android.support.v4.app.FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_container);

        fragA = findViewById(R.id.buttona);
        fragB = findViewById(R.id.buttonb);
        fragC = findViewById(R.id.buttonc);

        fragmentManager = getSupportFragmentManager();

        addBFrag();

        fragA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addAFrag();
            }
        });

        fragB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addBFrag();
            }
        });

        fragC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addCFrag();
            }
        });

    }

    public void addAFrag(){
        Fragment fragment = new FragmentA();
        android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();

        transaction.replace(R.id.activity_main_contain,fragment);
        transaction.addToBackStack("addA");
        transaction.commit();

    }

    public void addBFrag(){
        Fragment fragment = new FragmentB();
        android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();

        transaction.replace(R.id.activity_main_contain,fragment);
        transaction.addToBackStack("addB");
        transaction.commit();

    }

    public void addCFrag(){
        Fragment fragment = new FragmentC();
        android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();

        transaction.replace(R.id.activity_main_contain,fragment);
        transaction.addToBackStack("addC");
        transaction.commit();

    }


    @Override
    public void onBackStackChanged() {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
}
