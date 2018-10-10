package com.bmcampbell.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import java.util.ArrayList;

public class viewDirections extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_directions);

        Intent newIntent = getIntent();
        ArrayList<?> directions = (ArrayList<?>) newIntent.getSerializableExtra("listOfDirections");
        System.out.println("Data" + directions);
    }
}
