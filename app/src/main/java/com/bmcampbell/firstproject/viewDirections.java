package com.bmcampbell.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import java.util.Collections;
import java.util.ArrayList;


public class viewDirections extends AppCompatActivity implements View.OnClickListener{

    //Creation of widgets
    private Button resetButton;
    ArrayList<String> directions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_directions);

        resetButton = findViewById(R.id.resetButton);
        resetButton.setOnClickListener(this);

        Intent newIntent = getIntent();
        directions = newIntent.getStringArrayListExtra("listOfDirections"); //Put direction list into new variable


        revFunc(directions); //Reverse the list of directions
        revDirections(directions); //Reverses each direction within direction list

        //Create and set an adapter. This in essence acts as the bridge between the list of directions and the UI
        ListView dirListView = findViewById(R.id.directionListView);
        ArrayAdapter<String> listDirectionAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, directions);
        dirListView.setAdapter(listDirectionAdapter);

    }

    //This method clears the direction array within viewDirections component once reset button is pressed
    //Need to make it so that this change is also applied to the array within MainActivity
    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case (R.id.resetButton):

                //Clears the direction array and updates the display accordingly
                ListView dirListView = findViewById(R.id.directionListView);
                ArrayAdapter<String> listDirectionAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, directions);
                dirListView.setAdapter(listDirectionAdapter);

                //Once reset button is pressed, go back to initial activity and reset the direction array
                Intent goBack = new Intent(viewDirections.this, MainActivity.class);
                goBack.putStringArrayListExtra("newListOfDirections", directions);

                startActivity(goBack);

                break;
        }
    }


    //Reverses an ArrayList of strings
    public ArrayList<String> revFunc(ArrayList<String> directionList){
        Collections.reverse(directionList);
        return directionList;
    }


    //"Reverses" each direction within the direction list
    public ArrayList<String> revDirections(ArrayList<String> directionList){
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
