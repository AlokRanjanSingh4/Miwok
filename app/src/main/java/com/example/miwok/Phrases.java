package com.example.miwok;

public class Phrases {
    private String mEngPhrases;
    private String mMiwokPhrases;
    private int mAudioPhrases;

    public Phrases(String mEngPhrases, String mMiwokPhrases, int mAudioPhrases) {
        this.mEngPhrases = mEngPhrases;
        this.mMiwokPhrases = mMiwokPhrases;
        this.mAudioPhrases = mAudioPhrases;
    }

    public String getmEngPhrases() {
        return mEngPhrases;
    }

    public String getmMiwokPhrases() {
        return mMiwokPhrases;
    }

    public int getmAudioPhrases() {
        return mAudioPhrases;
    }
}
