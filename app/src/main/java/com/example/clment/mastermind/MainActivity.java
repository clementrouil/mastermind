package com.example.clment.mastermind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.go = 1;


    }
    public void click(View button) {
        int buttonTag = Integer.parseInt(button.getTag().toString());

        if (buttonTag == go) {

            Intent myIntent = new Intent(MainActivity.this, ModeJeuActivity.class);
            setContentView(R.layout.modejeulayout);
            startActivity(myIntent);

        }


    }

}
