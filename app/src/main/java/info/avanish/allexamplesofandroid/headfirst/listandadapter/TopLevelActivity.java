package info.avanish.allexamplesofandroid.headfirst.listandadapter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import info.avanish.allexamplesofandroid.R;

/**
 * Created by kunwa on 3/8/2018.
 */

public class TopLevelActivity extends Activity {

    ListView listView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        listView = findViewById(R.id.listView_top_level);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               // TextView textView = (TextView) view;
              //  Toast.makeText(TopLevelActivity.this, ""+textView.getText(), Toast.LENGTH_SHORT).show();

                if (position==0){
                    Intent intent = new Intent(TopLevelActivity.this,
                            DrinkCategoryActivity.class);
                    startActivity(intent);
                }

            }
        };

        listView.setOnItemClickListener(itemClickListener);

      /*  listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(TopLevelActivity.this, ""+parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();

            }
        });*/

    }
}
