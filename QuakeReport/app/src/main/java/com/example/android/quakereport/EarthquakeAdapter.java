package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rajpa on 24-Oct-16.
 */

public class  EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, parent, false);

        }
        //Find the Eatrhquake at given position in the list of earthquake
        Earthquake currentEarthquake = getItem(position);

        //Find the TextView with the id magnitude
        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitute);
        //display the value of the current magnitude in the TextView
        magnitudeView.setText(currentEarthquake.getmMagnitute());

        //Find the TextView with the id location
        TextView locationView = (TextView) listItemView.findViewById(R.id.location);
        //display the value of the current location in the TextView
        locationView.setText(currentEarthquake.getmLocation());


        //Find the TextView with the id date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        //display the value of the current date in the TextView
        dateView.setText(currentEarthquake.getmDate());


        return listItemView;
    }
}
