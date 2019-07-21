package info.avanish.allexamplesofandroid.headfirst;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import info.avanish.allexamplesofandroid.R;

/**
 * Created by kunwa on 03-03-2018.
 */

public class AllWidgetDemo extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_widget_view_demo);
    }

    public void onClickToggleButton(View view){
        boolean status = ((ToggleButton) view).isChecked();

        if (status){
            Toast.makeText(this, "ToggleButton: "+status, Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "ToggleButton: "+status, Toast.LENGTH_SHORT).show();
        }

    }
    public void onClickSwitch(View view){

        boolean status = ((Switch) view).isChecked();
        if (status){
            Toast.makeText(this, "Switch: "+status, Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Switch: "+status, Toast.LENGTH_SHORT).show();
        }
    }
    public void onClickCheckbox(View view){

        boolean status = ((CheckBox) view).isChecked();

        switch (view.getId()){
            case R.id.checkBox1:
                if (status){
                    Toast.makeText(this, "Checkbox1: "+status, Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "Checkbox1: "+status, Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkBox2:
                if (status){
                    Toast.makeText(this, "Checkbox2: "+status, Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "Checkbox2: "+status, Toast.LENGTH_SHORT).show();
                }
                break;
        }

    }
    public void onClickRadioButton(View view){
       RadioGroup group = (RadioGroup) findViewById(R.id.group_view_rp);
        int id = group.getCheckedRadioButtonId();

        switch (id){
            case R.id.radioButton1:
                    Toast.makeText(this, "RadioButton1: ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton2:
                    Toast.makeText(this, "RadioButton2: ", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
