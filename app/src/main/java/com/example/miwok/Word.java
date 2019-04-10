package com.example.miwok;

public class Word {
    private String mMiwokDefultTranslation;
    private String mMiwokTranslation;
    private int mImageRes;
    private int mAudioNumbers;

    public Word(String mMiwokDefultTranslation, String mMiwokTranslation, int mImageRes, int mAudioNumbers) {
        this.mMiwokDefultTranslation = mMiwokDefultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageRes = mImageRes;
        this.mAudioNumbers = mAudioNumbers;
    }

    public String getmMiwokDefultTranslation() {
        return mMiwokDefultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageRes() {
        return mImageRes;
    }

    public int getmAudioNumbers() {
        return mAudioNumbers;
    }
}
