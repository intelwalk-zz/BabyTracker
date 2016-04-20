package com.intelwalk.babytracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class TemperatureInput extends AppCompatActivity {

    TextView temperaturenumber;
    RadioButton temperaturetype;
    MyDBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_input);
        temperaturenumber = (TextView) findViewById(R.id.textView3);
        temperaturetype = (RadioButton) findViewById(R.id.radioButton);
        dbHandler = new MyDBHandler(this,null,null,1);
    }

    public void addButtonClicked(View view){
        Event event = new Event()
    }
}
