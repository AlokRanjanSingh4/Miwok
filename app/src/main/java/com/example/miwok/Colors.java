package com.example.miwok;

class Colors {
    private String mEngColors;
    private String mMiwokColors;
    private int mImageColors;
    private int mAudiouColors;


    public Colors(String mEngColors, String mMiwokColors, int mImageColors, int mAudiouColors) {
        this.mEngColors = mEngColors;
        this.mMiwokColors = mMiwokColors;
        this.mImageColors = mImageColors;
        this.mAudiouColors = mAudiouColors;
    }

    String getmEngColors() {
        return mEngColors;
    }

    String getmMiwokColors() {
        return mMiwokColors;
    }

    int getmImageColors() {
        return mImageColors;
    }

    public int getmAudiouColors() {
        return mAudiouColors;
    }
}
