package com.example.myapplication_activity_and_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.myapplication_activity_and_intents.MESSAGE";
    public final static String EXTRA_NUM_1 = "com.example.myapplication_activity_and_intents.NUM_1";
    public final static String EXTRA_NUM_2 = "com.example.myapplication_activity_and_intents.NUM_2";
    public final static String EXTRA_BUTTON_TEXT = "com.example.myapplication_activity_and_intents.BUTTON_TEXT";

    public void onNextPage(View view) {
        Intent secondActivityIntent = new Intent(this, secondActivity.class);
        secondActivityIntent.putExtra(EXTRA_MESSAGE, "Welcome!");
        secondActivityIntent.putExtra(EXTRA_NUM_1, 40);
        secondActivityIntent.putExtra(EXTRA_NUM_2, 60);
        secondActivityIntent.putExtra(EXTRA_BUTTON_TEXT, "PRESS TO GO BACK");

        startActivity(secondActivityIntent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}