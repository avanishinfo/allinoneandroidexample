package info.avanish.allexamplesofandroid.headfirst;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

import info.avanish.allexamplesofandroid.R;

public class SecondActivity extends Activity implements Serializable{

    String inputData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String val = getIntent().getStringExtra("Message");

        TextView view = findViewById(R.id.message);
        view.setText(inputData);
    }
}
