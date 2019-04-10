package com.example.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    private MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        final ArrayList<Colors> colors = new ArrayList<>();
        colors.add(new Colors("Red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        colors.add(new Colors("Green", "chokokki", R.drawable.color_green, R.raw.color_green));
        colors.add(new Colors("Brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        colors.add(new Colors("Gray", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        colors.add(new Colors("Black", "kululli", R.drawable.color_black, R.raw.color_black));
        colors.add(new Colors("White", "kelelli", R.drawable.color_white, R.raw.color_white));
        colors.add(new Colors("Dusty Yellow", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        colors.add(new Colors("Mustard Yellow", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        ColorsAdapter adapter = new ColorsAdapter(this, colors);
        ListView listView = findViewById(R.id.colorsID);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Colors colors1 = colors.get(position);
                releaseMediaPlayer();
                mediaPlayer = MediaPlayer.create(ColorsActivity.this, colors1.getmAudiouColors());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(onCompletionListener);
            }
        });
    }
    private void releaseMediaPlayer() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
