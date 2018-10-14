package com.bmcampbell.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.ArrayList;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button straightButton;
    private Button rightButton;
    private Button leftButton;
    private Button homeButton;
    private Button undoButton;
    ArrayList<String> directionList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        straightButton = findViewById(R.id.straightButton);
        rightButton = findViewById(R.id.rightButton);
        leftButton = findViewById(R.id.leftButton);
        homeButton = findViewById(R.id.homeButton);
        undoButton = findViewById(R.id.undoButton);
        straightButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);
        leftButton.setOnClickListener(this);
        homeButton.setOnClickListener(this);
        undoButton.setOnClickListener(this);

    }

    //If right, left, or straight is clicked, a message displayed to screen (for now) and corresponding direction is added to an ArrayList.
    @Override
    public void onClick(View view)
    {
        //Each time you press a direction button, corresponding message displayed and corresponding value added to direction array
        switch (view.getId()) {
            case (R.id.straightButton):
                Toast.makeText(this, "You Clicked The Straight Button", Toast.LENGTH_SHORT).show();
                directionList.add("Straight");
                break;
            case (R.id.rightButton):
                Toast.makeText(this, "You Clicked The Right Button", Toast.LENGTH_SHORT).show();
                directionList.add("Right");
                break;
            case (R.id.leftButton):
                Toast.makeText(this, "You Clicked The Left Button", Toast.LENGTH_SHORT).show();
                directionList.add("Left");
                break;
            case (R.id.homeButton):

                //This creates a new intent that will be used to call "viewDirections.java" activity. "viewDirections.java" is for displaying the list of directions
                Intent goToDirectionList = new Intent(MainActivity.this, viewDirections.class);

                //Passes the array of directions into the new activity
                goToDirectionList.putStringArrayListExtra("listOfDirections", directionList);
                startActivity(goToDirectionList);
                break;
            case (R.id.undoButton):
                directionList.remove(directionList.size() - 1); //Remove last element from the list (most recently inputted item)
                break;
        }
    }
}
