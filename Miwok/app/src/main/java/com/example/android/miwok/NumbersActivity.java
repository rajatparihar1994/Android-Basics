package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One","एक (ek)",R.drawable.number_one));
        words.add(new Word("Two","दो (do)",R.drawable.number_two));
        words.add(new Word("Three","तीन (teen)",R.drawable.number_three));
        words.add(new Word("Four","चार",R.drawable.number_four));
        words.add(new Word("Five","पांच (pāṃca)",R.drawable.number_five));
        words.add(new Word("Six","छः (chaḥ)",R.drawable.number_six));
        words.add(new Word("Seven","सात (sāta)",R.drawable.number_seven));
        words.add(new Word("Eight","आठ (āṭha)",R.drawable.number_eight));
        words.add(new Word("Nine","नौ (nau)",R.drawable.number_nine));
        words.add(new Word("Ten","दस (dasa)",R.drawable.number_ten));


        WordAdapter adapter = new WordAdapter(this,words,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
