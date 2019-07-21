package info.avanish.allexamplesofandroid.headfirst;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import info.avanish.allexamplesofandroid.R;

/**
 * Created by kunwa on 03-03-2018.
 */

public class LayoutTest extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.framelayout_test);
    }
}
