package com.example.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmSpanishTranslation() {
        return mMiwokTranslation;
    }
}
