package com.example.miwok;

public class Family {
    private String mEngFamily;
    private String mMiwokFamily;
    private int mImageFamily;
    private int mAudioFamily;

    public Family(String mEngFamily, String mMiwokFamily, int mImageFamily, int mAudioFamily) {
        this.mEngFamily = mEngFamily;
        this.mMiwokFamily = mMiwokFamily;
        this.mImageFamily = mImageFamily;
        this.mAudioFamily = mAudioFamily;
    }

    public String getmEngFamily() {
        return mEngFamily;
    }

    public String getmMiwokFamily() {
        return mMiwokFamily;
    }

    public int getmImageFamily() {
        return mImageFamily;
    }

    public int getmAudioFamily() {
        return mAudioFamily;
    }
}
