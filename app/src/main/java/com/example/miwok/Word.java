package com.example.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mSpanishTranslation;
    private int mWordImage = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String mDefaultTranslation, String mSpanishTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mSpanishTranslation = mSpanishTranslation;
    }
    public Word(String mDefaultTranslation, String mSpanishTranslation, int mWordImage) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mSpanishTranslation = mSpanishTranslation;
        this.mWordImage = mWordImage;
    }
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }
    public String getmSpanishTranslation() {
        return mSpanishTranslation;
    }
    public int getWordImage() {
        return mWordImage;
    }
    public boolean hasImage() {
        return (mWordImage != NO_IMAGE_PROVIDED);
    }
}
