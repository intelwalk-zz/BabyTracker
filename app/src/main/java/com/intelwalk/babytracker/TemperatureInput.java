package com.intelwalk.babytracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class TemperatureInput extends AppCompatActivity {

    TextView temperaturenumber;
    RadioButton temperaturetype;
    DataManager dbHandler;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_input);
        temperaturenumber = (EditText) findViewById(R.id.editText);
        output = (TextView) findViewById(R.id.textView4);
        dbHandler = new DataManager(this);
        output.setText("onCreate");
    }

    public void addButtonClicked(View view){
        Event event = new Event();
        event.set_eventname("Temperature");
        event.set_temperaturenumber(temperaturenumber.getText().toString());
        //event.set_temperaturetype((temperaturetype.getText().toString()));
        dbHandler.addEvent(event);
        printDatabase();
    }

    public void clearAllFields(View view){
        temperaturenumber.setText("");
        //temperaturetype.setText("");
    }

    public void printDatabase(){
        //String dbString = dbHandler.databaseToString();
        output.setText("PRINTFUNC");
    }
}
