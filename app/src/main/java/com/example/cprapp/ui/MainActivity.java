package com.example.cprapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cprapp.R;

public class MainActivity extends AppCompatActivity {


    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = (Button)findViewById(R.id.startButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startStory();
            }
        });
    }

    private void startStory() {
        Intent intent = new Intent(this, StoryActivity.class);
        startActivity(intent);
    }
}

