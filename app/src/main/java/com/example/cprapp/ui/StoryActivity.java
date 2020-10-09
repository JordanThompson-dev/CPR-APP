package com.example.cprapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cprapp.R;
import com.example.cprapp.model.Page;
import com.example.cprapp.model.Story;

public class StoryActivity extends AppCompatActivity {
    private ImageView storyImageView;
    private Story story;
    private TextView storyTextView;
    private Button choice1Button;
    private Button choice2Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        storyImageView = (ImageView)findViewById(R.id.storyImageView);
        storyTextView=(TextView)findViewById(R.id.storyTextView);
        choice1Button=(Button)findViewById(R.id.choice1Button);
        choice2Button=(Button)findViewById(R.id.choice2Button);


        Intent intent = getIntent();
        story = new Story();
        loadPage(0);


    }

    private void loadPage(int pageNumber) {
        final Page page = story.getPage(pageNumber);
        String pageText = getString(page.getTextID());
        pageText= String.format(pageText);
        storyTextView.setText(pageText);
        Drawable image = ContextCompat.getDrawable(this, page.getImageId());
        storyImageView.setImageDrawable(image);

        choice1Button.setText(page.getChoiceOne().getTextId());
        choice1Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                int nextPage = page.getChoiceOne().getNextPage();
                loadPage(nextPage);
            }



                                         });

        choice2Button.setText(page.getChoiceTwo().getTextId());
        choice2Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                int nextPage = page.getChoiceTwo().getNextPage();
                loadPage(nextPage);
            }



        });
    }
}
