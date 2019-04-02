package com.example.newu.myweatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button button;
    EditText city;
    TextView result;
//    http://api.openweathermap.org/data/2.5/weather?q=Korba&appid=64c0850472457c573865aa794271dc5f
    String baseURL="http://api.openweathermap.org/data/2.5/weather?q=";
    String API="&appid=64c0850472457c573865aa794271dc5f";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =(Button) findViewById(R.id.button);
        city = (EditText)findViewById(R.id.getCity);
        result=(TextView)findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myURL= baseURL + city.getText().toString() + API;
                Log.i("url","url"+myURL);
            }
        });

    }
}
