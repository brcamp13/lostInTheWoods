package com.bmcampbell.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button straightButton;
    private Button rightButton;
    private Button leftButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        straightButton = findViewById(R.id.straightButton);
        rightButton = findViewById(R.id.rightButton);
        leftButton = findViewById(R.id.leftButton);
        straightButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);
        leftButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case (R.id.straightButton):
                Toast.makeText(this, "You Clicked The Straight Button", Toast.LENGTH_LONG).show();
                break;
            case (R.id.rightButton):
                Toast.makeText(this, "You Clicked The Right Button", Toast.LENGTH_LONG).show();
                break;
            case (R.id.leftButton):
                Toast.makeText(this, "You Clicked The Left Button", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
