
package com.example.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_phrases);

        final ArrayList<Phrases> phrases = new ArrayList<>();
        phrases.add(new Phrases("Where are going", "minto wuksus", R.raw.phrase_where_are_you_going));
        phrases.add(new Phrases("What is your name", "tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        phrases.add(new Phrases("My name is....", "oyaaset...", R.raw.phrase_my_name_is));
        phrases.add(new Phrases("Who are you feeling", "michәksәs?", R.raw.phrase_how_are_you_feeling));
        phrases.add(new Phrases("I am feeling good", "kuchi achit", R.raw.phrase_im_feeling_good));
        phrases.add(new Phrases("Are you coming", "әәnәs'aa", R.raw.phrase_are_you_coming));
        phrases.add(new Phrases("Yes I am coming", "hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        phrases.add(new Phrases("I am coming", "әәnәm", R.raw.phrase_im_coming));
        phrases.add(new Phrases("Lets go", "yoowutis", R.raw.phrase_lets_go));
        phrases.add(new Phrases("Come here", "әnni'nem", R.raw.phrase_come_here));

        PhrasesAdapter adapter = new PhrasesAdapter(this, phrases);
        ListView listView = findViewById(R.id.phrasesID);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Phrases phrases1 = phrases.get(position);
                releaseMediaPlayer();
                mediaPlayer = MediaPlayer.create(PhrasesActivity.this, phrases1.getmAudioPhrases());
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
