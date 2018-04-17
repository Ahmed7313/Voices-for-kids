package com.example.android.musicstructureapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ahmed Rabie on 4/2/2018.
 */

public class CustomAdabter extends ArrayAdapter<Sample> {

    public CustomAdabter(@NonNull Context context, @NonNull ArrayList<Sample> sampleArrayList) {
        super(context, 0, sampleArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list, parent, false);
        }
        // Get the {@link Sample} object located at this position in the list
        Sample sample = getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.listImage);
        TextView name = listItemView.findViewById(R.id.listText);

        imageView.setImageResource(sample.getmImageRecourceId());
        name.setText(sample.getAnimal_name());

        return listItemView;
    }
}
