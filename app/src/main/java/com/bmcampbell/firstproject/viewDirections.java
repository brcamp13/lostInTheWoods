package com.bmcampbell.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import java.util.ArrayList;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import java.util.Collections;

public class viewDirections extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_directions);

        Intent newIntent = getIntent();
        ArrayList<String> directions = newIntent.getStringArrayListExtra("listOfDirections"); //Put direction list into new variable

        revFunc(directions); //Reverse the list of directions

        revDirections(directions); //Reverses each direction within direction list

        //Create and set an adapter. This in essence acts as the bridge between the list of directions and the UI
        ListView dirListView = findViewById(R.id.directionListView);
        ArrayAdapter<String> listDirectionAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, directions);
        dirListView.setAdapter(listDirectionAdapter);

    }


    //Reverses an ArrayList of strings
    private ArrayList<String> revFunc(ArrayList<String> directionList){
        Collections.reverse(directionList);
        return directionList;
    }


    //"Reverses" each direction within the direction list
    private ArrayList<String> revDirections(ArrayList<String> directionList){
        for(int i = 0; i < directionList.size(); i++){
            switch (directionList.get(i)) {
                case ("Right"):
                    directionList.set(i, "Left");
                    break;
                case("Left"):
                    directionList.set(i, "Right");
                    break;
                case("Straight"):
                    directionList.set(i, "Straight");
                    break;
            }
        }

        return directionList;

    }


}
