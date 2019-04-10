package com.example.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_family);

        final ArrayList<Family> families = new ArrayList<>();
        families.add(new Family("Father", "әpә", R.drawable.family_father, R.raw.family_father));
        families.add(new Family("Mother", "әṭa", R.drawable.family_mother, R.raw.family_mother));
        families.add(new Family("Son", "angsi", R.drawable.family_son, R.raw.family_son));
        families.add(new Family("Daughter", "tune", R.drawable.family_daughter, R.raw.family_daughter));
        families.add(new Family("Older brother", "taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        families.add(new Family("Younger brother", "chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        families.add(new Family("Older sister", "teṭe", R.drawable.family_older_sister, R.raw.family_older_sister));
        families.add(new Family("Younger sister", "kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        families.add(new Family("Grandmother", "amma", R.drawable.family_grandmother, R.raw.family_grandmother));
        families.add(new Family("Grandfather", "paapa", R.drawable.family_grandfather, R.raw.family_grandfather));

        FamilyAdapter adapter = new FamilyAdapter(this, families);
        ListView listView = findViewById(R.id.familyID);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Family family = families.get(position);
                releaseMediaPlayer();
                mediaPlayer = MediaPlayer.create(FamilyActivity.this, family.getmAudioFamily());
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
