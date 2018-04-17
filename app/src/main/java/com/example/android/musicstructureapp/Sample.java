package com.example.android.musicstructureapp;

/**
 * Created by Ahmed Rabie on 4/2/2018.
 */

public class Sample {


    private String animal_name;
    private int mImageRecourceId;
    private int mAudioRecourceId;

    public Sample() {
    }

    public Sample(String animal_name, int mImageRecourceId, int mAudioRecourceId) {
        this.animal_name = animal_name;
        this.mImageRecourceId = mImageRecourceId;
        this.mAudioRecourceId = mAudioRecourceId;
    }

    public Sample(String animal_name, int mImageRecourceId) {
        this.animal_name = animal_name;
        this.mImageRecourceId = mImageRecourceId;
    }

    public Sample(String animal_name) {
        this.animal_name = animal_name;
    }

    public String getAnimal_name() {
        return animal_name;
    }

    public int getmAudioRecourceId() {
        return mAudioRecourceId;
    }

    public int getmImageRecourceId() {
        return mImageRecourceId;
    }

}
