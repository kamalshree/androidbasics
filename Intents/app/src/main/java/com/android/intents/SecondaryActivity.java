package com.android.intents;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondaryActivity extends AppCompatActivity {

    private Button button_next;
    private String myCity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        myCity=getIntent().getStringExtra("myCity");
        Persons personDetails= (Persons) getIntent().getParcelableExtra("myperson");
        Toast.makeText(this, "My First Name is "+personDetails.getFirstName()+" My last Name is "+personDetails.getLastName()+" I live in "+myCity, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, personDetails.getQualification().get(0)+"......."+personDetails.getQualification().get(1),Toast.LENGTH_SHORT).show();
    }
}
