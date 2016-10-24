package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Black", "काला",R.drawable.color_black));
        //words.add(new Word("Blue","नीला"));
        words.add(new Word("Brown","भूरा",R.drawable.color_brown));
        words.add(new Word("Green ","हरा",R.drawable.color_green));
        words.add(new Word("Grey ","धूसर, स्लेटी",R.drawable.color_gray));
        //words.add(new Word("Orange ","नारंगी"));
        //words.add(new Word("Pink ","गुलाबी"));
        //words.add(new Word("Purple","बैगनी"));
        words.add(new Word("Red ","लाल",R.drawable.color_red));
        words.add(new Word("White","सफ़ेद",R.drawable.color_white));
        words.add(new Word("Yellow ","पीला",R.drawable.color_mustard_yellow));
        //words.add(new Word("golden ","सुनहरा"));



        WordAdapter adapter = new WordAdapter(this,words,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
