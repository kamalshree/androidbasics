package com.android.intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button button_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_next=(Button)findViewById(R.id.button_next);
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Explicit Intent
                /*Intent secondaryIntent=new Intent(MainActivity.this,SecondaryActivity.class);
                startActivity(secondaryIntent);*/

                //Implicit Intent
               /* Intent myIntent=new Intent();
                myIntent.setAction(Intent.ACTION_VIEW);
                myIntent.addCategory(Intent.CATEGORY_DEFAULT);
                myIntent.setData(Uri.parse("http://www.stackoverflow.com"));
                startActivity(myIntent);*/

               /*Person person=new Person();
               person.setFirstName("James");
               person.setLastName("Dough");
               Intent myIntent=new Intent();
               myIntent.putExtra("myCity","London");
               myIntent.setAction("secondActivity");
               myIntent.addCategory(Intent.CATEGORY_DEFAULT);
               myIntent.putExtra("myperson",person);
               startActivity(myIntent);*/

                Persons persons=new Persons();
                persons.setFirstName("Alex");
                persons.setLastName("Dough");

                List<String> myQual=new ArrayList<>();
                myQual.add("Masters");
                myQual.add("Doctrate");
                persons.setQualification(myQual);

                Intent myIntent=new Intent();
                myIntent.putExtra("myCity","Chicago");
                myIntent.setAction("secondActivity");
                myIntent.addCategory(Intent.CATEGORY_DEFAULT);
                myIntent.putExtra("myperson",persons);
                startActivity(myIntent);
            }
        });
    }
}
