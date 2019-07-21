package info.avanish.allexamplesofandroid.headfirst.stopwatch;

import android.app.Activity;
import android.os.Handler;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

import info.avanish.allexamplesofandroid.R;

public class StopwatchActivity extends Activity {

    private int seconds = 0;
    private boolean running = false;
    private boolean wasRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("StopwatchLC: ","OnCreate");
        setContentView(R.layout.activity_stopwatch);
        if (savedInstanceState!=null){
            seconds = savedInstanceState.getInt("sec");
            running = savedInstanceState.getBoolean("runn");
            wasRunning = savedInstanceState.getBoolean("wasRunn");
        }
        runTimer();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("StopwatchLC: ","onSaveInstanceState");
        outState.putInt("sec",seconds);
        outState.putBoolean("runn",running);
        outState.putBoolean("wasRunn",wasRunning);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("StopwatchLC: ","onStart");

    }
    
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("StopwatchLC: ","onResume");
        if (wasRunning) {
            running = true;
        }
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("StopwatchLC: ","onPause");
        wasRunning = running;
        running = false;
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("StopwatchLC: ","onStop");

    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("StopwatchLC: ","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("StopwatchLC: ","onDestroy");
    }

   

    private void runTimer() {
        final TextView timer = findViewById(R.id.timer_tv);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/3600;
                int minutes = (seconds%3600)/60;
                int secs = seconds%60;
                String time = String.format(Locale.getDefault(), "%d:%02d:%02d", hours, minutes, secs);
                timer.setText(time);

                if (running){
                    seconds++;
                }

                handler.postDelayed(this,1000);
            }
        });
    }

    public void onClickStart(View view){
        running = true;
    }
    public void onClickStop(View view){
        running = false;
    }
    public void onClickReset(View view){
        running = false;
        seconds = 0;
    }
}
