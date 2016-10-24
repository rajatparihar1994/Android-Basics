package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Mother", "Maa (माँ)",R.drawable.family_mother));
        words.add(new Word("Father","Baap (बाप) Pitah (पिता)",R.drawable.family_father));
        words.add(new Word("Son"," Beta (बेटा)",R.drawable.family_son));
        words.add(new Word("Daughter","Beti (बेटी)",R.drawable.family_daughter));
        words.add(new Word("Sister","Behan (बहन)",R.drawable.family_older_sister));
        words.add(new Word("Sister's Husband","Jiija (जीजा)",R.drawable.family_older_brother));
        words.add(new Word("Brother","Bhai (भाई)",R.drawable.family_younger_brother));
        words.add(new Word("Brother's Wife","Bhabhi (भाभी)",R.drawable.family_younger_sister));
        words.add(new Word("Paternal Grandfather","Dada (दादा)",R.drawable.family_grandfather));
        words.add(new Word("Paternal Grandmother","Dadi (दादी)",R.drawable.family_grandmother));
        words.add(new Word("Son in Law","Damaad (दामाद)",R.drawable.family_older_brother));
        words.add(new Word("Daughter in Law","Bahu (बहु)",R.drawable.family_younger_sister));



        WordAdapter adapter = new WordAdapter(this,words,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
