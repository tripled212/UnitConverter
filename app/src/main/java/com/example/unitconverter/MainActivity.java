package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cvCurrency=(CardView) findViewById(R.id.cvCurrency);
        CardView cvWeight=(CardView) findViewById(R.id.cvWeight);
        CardView cvTime=(CardView) findViewById(R.id.cvTime);
        CardView cvLength=(CardView) findViewById(R.id.cvLength);
        CardView cvArea=(CardView) findViewById(R.id.cvArea);
        CardView cvTemp=(CardView) findViewById(R.id.cvTemp);


        cvCurrency.setOnClickListener(v -> {
            Intent intent=new Intent (MainActivity.this, Currency.class);
            startActivity(intent);
        });

        cvWeight.setOnClickListener(v -> {
            Intent intent=new Intent (MainActivity.this, Weight.class);
            startActivity(intent);
        });


        cvTime.setOnClickListener(v -> {
            Intent intent=new Intent (MainActivity.this, Time.class);
            startActivity(intent);
        });


        cvLength.setOnClickListener(v -> {
            Intent intent=new Intent (MainActivity.this, Length.class);
            startActivity(intent);
        });


        cvArea.setOnClickListener(v -> {
            Intent intent=new Intent (MainActivity.this, Area.class);
            startActivity(intent);
        });


        cvTemp.setOnClickListener(v -> {
            Intent intent=new Intent (MainActivity.this, Temperature.class);
            startActivity(intent);
        });
    }


}