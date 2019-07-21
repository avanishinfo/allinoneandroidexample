package info.avanish.allexamplesofandroid.headfirst.listandadapter;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import info.avanish.allexamplesofandroid.R;

/**
 * Created by kunwa on 3/8/2018.
 */

public class DrinkCategoryActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_middle_level);

        ArrayAdapter<Drinks> adapter = new ArrayAdapter<Drinks>(this,android.R.layout.simple_list_item_1,Drinks.drinks);

        ListView listView = findViewById(R.id.listView_middle_level);
        listView.setAdapter(adapter);
    }
}
