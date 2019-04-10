package com.example.miwok;

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
import java.util.List;

public class FamilyAdapter extends ArrayAdapter<Family> {
    public FamilyAdapter(Context context, ArrayList<Family> families) {
        super(context, 0, families);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(getContext()).inflate(
                    R.layout.family_list_item, parent, false
            );
        }

        Family currentFamily = getItem(position);
        TextView miwokFamily = listItem.findViewById(R.id.miwokFamily);
        miwokFamily.setText(currentFamily.getmMiwokFamily());

        TextView englishFamily = listItem.findViewById(R.id.englishFamily);
        englishFamily.setText(currentFamily.getmEngFamily());

        ImageView imageView = listItem.findViewById(R.id.imageFamily);
        imageView.setImageResource(currentFamily.getmImageFamily());
        return listItem;
    }
}
