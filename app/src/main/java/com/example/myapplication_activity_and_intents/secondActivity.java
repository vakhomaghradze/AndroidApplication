package com.example.myapplication_activity_and_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class secondActivity extends AppCompatActivity {

    public void onBackPage(View view) {
        finish();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = (TextView) findViewById(R.id.textView2Activity);
        Button button = (Button) findViewById(R.id.backPageButton);


        Intent firstIntent = getIntent();

        String textViewValue = firstIntent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String buttonTextValue = firstIntent.getStringExtra(MainActivity.EXTRA_BUTTON_TEXT);

        Integer num_1 = firstIntent.getIntExtra(MainActivity.EXTRA_NUM_1, 0);
        Integer num_2 = firstIntent.getIntExtra(MainActivity.EXTRA_NUM_2, 0);

        Toast.makeText(this, "Sum is - " + (num_1 + num_2), Toast.LENGTH_SHORT).show();
        
        textView.setText(textViewValue);
        button.setText(buttonTextValue);

    }
}