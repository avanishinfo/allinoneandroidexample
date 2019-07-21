package info.avanish.allexamplesofandroid.headfirst;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

import info.avanish.allexamplesofandroid.R;

/**
 * Created by kunwa on 25-02-2018.
 */

public class FindBeerActivity extends Activity {
    private BeerExpert beerExpert = new BeerExpert();
    EditText input;
    String inputString;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);

        input = findViewById(R.id.input);

    }

    public void onClickFindBeer(View view){
        inputString = input.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        //String chooser = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent, "Send ... ");

        intent.setType("text/plain");
        intent.putExtra("Message",inputString);

        startActivity(chosenIntent);
        //SecondActivity obj = new SecondActivity(inputString);


    }

   /* public void onClickFindBeer(View view){
        TextView brands = (TextView) findViewById(R.id.beerdetails);
        //Get a reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.beerspinner);
        //Get the selected item in the Spinner
        String beerType = String.valueOf(color.getSelectedItem());

        //brands.setText(beerType);
        List<String> list = beerExpert.getBrands(beerType);
        StringBuilder stringBuilder = new StringBuilder();

        for (String value : list) {
            stringBuilder.append(value).append("\n");
        }

        brands.setText(stringBuilder);
    }*/
}
