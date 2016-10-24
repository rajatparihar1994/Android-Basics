package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Hello", " (नमस्ते)"));
        words.add(new Word("How are you?","(आप कैसे हैं?)"));
        words.add(new Word("Long time no see","(बहुत समय से देखा नहीं )"));
        words.add(new Word("What's your name?","(आप का नाम क्या है )"));
        words.add(new Word("My name is ...","(मेरा नाम ... है )"));
        words.add(new Word("Where are you from?","(आप कहाँ से (आए) हैं? )"));
        words.add(new Word("I'm from ...","(मैं ... से (आए) हूँ )"));
        words.add(new Word("Pleased to meet you","(आप से मिलकर ख़ुशी हुई )"));
        words.add(new Word("I don't know","(मुझे नहीं पता )"));
        words.add(new Word("I understand"," (मैं समझ गया )"));
        words.add(new Word("I love you","(मैं तुमसे प्यार करता हुँ )"));
        words.add(new Word("One language is never enough","(एक भाषा कभी भी काफ़ी नहीं होती )"));



        WordAdapter adapter = new WordAdapter(this,words,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
