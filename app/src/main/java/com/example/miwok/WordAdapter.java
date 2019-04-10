package com.example.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {


    WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

        @Override
        public View getView (int position, View convertView, ViewGroup parent){
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item, parent, false);
            }

            Word currentWord = getItem(position);

            TextView miwokTextView = listItemView.findViewById(R.id.miwok_text_view);
            miwokTextView.setText(currentWord.getmMiwokTranslation());

            TextView defultTextView = listItemView.findViewById(R.id.defult_text_view);
            defultTextView.setText(currentWord.getmMiwokDefultTranslation());

            ImageView miwokImage = listItemView.findViewById(R.id.imageNumber);
            miwokImage.setImageResource(currentWord.getmImageRes());

            return listItemView;
        }
    }
