package com.example.myfavoritetoys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView mToysListTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //checks list of toys in the scroll view
        //Analyzes main context of the toy app toys
        mToysListTextView = findViewById(R.id.toys);

        String[] toyNames = ToyBox.getToyNames();


        for (String toyName: toyNames){
            mToysListTextView.append(toyName + "\n\n\n");
        }
    }
}
