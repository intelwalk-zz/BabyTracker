package com.intelwalk.babytracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button tempinput,diaperinput,sleepinput,feedinginput,cryinginput,breathmoninput,bathinginput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tempinput = (Button) findViewById(R.id.button);
        diaperinput = (Button) findViewById(R.id.button2);
        cryinginput = (Button) findViewById(R.id.button3);
        feedinginput = (Button) findViewById(R.id.button4);
        breathmoninput = (Button) findViewById(R.id.button5);
        sleepinput = (Button) findViewById(R.id.button6);
        bathinginput = (Button) findViewById(R.id.button7);

        tempinput.setOnClickListener(this);
        diaperinput.setOnClickListener(this);
        cryinginput.setOnClickListener(this);
        feedinginput.setOnClickListener(this);
        breathmoninput.setOnClickListener(this);
        sleepinput.setOnClickListener(this);
        bathinginput.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.button:
                Intent intent = new Intent("com.intelwalk.babytracker.TemperatureInput");
                startActivity(intent);
                break;

            case R.id.button2:
                Intent intent2 = new Intent("com.intelwalk.babytracker.DiaperInput");
                startActivity(intent2);
                break;

            case R.id.button3:
                Intent intent3 = new Intent("com.intelwalk.babytracker.CryingInput");
                startActivity(intent3);
                break;

            case R.id.button4:
                Intent intent4 = new Intent("com.intelwalk.babytracker.FeedingInput");
                startActivity(intent4);
                break;

            case R.id.button5:
                Intent intent5 = new Intent("com.intelwalk.babytracker.BreathingMonitorInput");
                startActivity(intent5);
                break;

            case R.id.button6:
                Intent intent6 = new Intent("com.intelwalk.babytracker.SleepingInput");
                startActivity(intent6);
                break;

            case R.id.button7:
                Intent intent7 = new Intent("com.intelwalk.babytracker.BathingInput");
                startActivity(intent7);
                break;
        }

    }
}
