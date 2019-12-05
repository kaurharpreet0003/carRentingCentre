package com.example.harpreet_761984_mt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Spinner spinner;
    EditText dailyRent;
    SeekBar seek_days;
    RadioButton radio_twenty;
    RadioButton radio_plusTwenty;
    RadioButton radio_sixty;
    CheckBox gps;
    CheckBox child;
    CheckBox unlimited_millage;
    EditText et_amount;
    EditText et_totalPayment;
    Button viewDetails;
    int temp = 0;
    boolean i_seek = true;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dailyRent = findViewById(R.id.et1_dailyRant);
        spinner = findViewById(R.id.spinner1);
        seek_days = findViewById(R.id.seek_bar);
        radio_twenty = findViewById(R.id.twenty);
        radio_plusTwenty = findViewById(R.id.aboveTwentyOne);
        radio_sixty = findViewById(R.id.sixty);
        gps = findViewById(R.id.gps1);
        child = findViewById(R.id.childSeat);
        unlimited_millage = findViewById(R.id.unlimited);
        et_amount = findViewById(R.id.amount);
        et_totalPayment = findViewById(R.id.total_payment);
        viewDetails = findViewById(R.id.view_details);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (spinner.getSelectedItem().toString()){
                    case "BMW":
                      dailyRent.setText("100 Dollars");
                      temp = Integer.valueOf(temp);
                      break;

                    case  "Audi":
                        dailyRent.setText("95 Dollars");
                        temp = Integer.valueOf(temp);
                        break;

                    case "Mercedes":
                        dailyRent.setText("80 Dollars");
                        temp = Integer.valueOf(temp);
                        break;

                    case "Porche":
                        dailyRent.setText("110 Dollars");
                        temp = Integer.valueOf(temp);
                        break;

                    case "Ferrari":
                        dailyRent.setText("120 Dollars");
                        temp = Integer.valueOf(temp);
                        break;

                    case "Peugeot":
                        dailyRent.setText("130 Dollars");
                        temp = Integer.valueOf(temp);
                        break;

                    case "Challenger":
                        dailyRent.setText("150 Dollars");
                        temp = Integer.valueOf(temp);
                        break;

                    case "Range Rover":
                        dailyRent.setText("90 Dollars");
                        temp = Integer.valueOf(temp);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        seek_days.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {



            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
