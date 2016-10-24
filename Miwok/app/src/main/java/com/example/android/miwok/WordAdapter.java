package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rajpa on 27-Aug-16.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    int mColorResourseId;

    public WordAdapter(Activity context, ArrayList<Word> words,int colorResourseId){

        super(context,0,words);
        mColorResourseId = colorResourseId;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.number_item,parent,false);
        }

        Word currentWord = getItem(position);

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.defalut_text_view);
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image);

        if(currentWord.hasImage())
        {
            imageView.setImageResource(currentWord.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else { imageView.setVisibility(View.GONE);}

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourseId);

        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}
