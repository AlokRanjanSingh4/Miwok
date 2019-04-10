package com.example.miwok;

import android.app.Activity;
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

public class ColorsAdapter extends ArrayAdapter<Colors> {

    public ColorsAdapter(Context context, ArrayList<Colors> colors) {
        super(context, 0, colors);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(getContext()).inflate(
                    R.layout.colors_list_item, parent, false);
        }

        Colors currentColor = getItem(position);
        TextView miwokText = listItem.findViewById(R.id.colorsMiwok);
        miwokText.setText(currentColor.getmMiwokColors());

        TextView englishText = listItem.findViewById(R.id.colorsEnglish);
        englishText.setText(currentColor.getmEngColors());

        ImageView imageView = listItem.findViewById(R.id.imageColors);
        imageView.setImageResource(currentColor.getmImageColors());

        return listItem;
    }
}
