package com.example.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PhrasesAdapter extends ArrayAdapter<Phrases> {
    public PhrasesAdapter(Context context, ArrayList<Phrases> phrases) {
        super(context,0, phrases);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(getContext()).inflate(
                    R.layout.phrases_list_item, parent, false
            );

            Phrases cuurentPhrases = getItem(position);
            TextView miwokText = listItem.findViewById(R.id.miwokPhrases);
            miwokText.setText(cuurentPhrases.getmMiwokPhrases());

            TextView englishText = listItem.findViewById(R.id.englishPhrases);
            englishText.setText(cuurentPhrases.getmEngPhrases());
        }
        return listItem;
    }
}
