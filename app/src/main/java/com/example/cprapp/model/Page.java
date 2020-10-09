package com.example.cprapp.model;

import android.media.Image;

public class Page {
    private int ImageID;
    private int textID;
    private Choice choiceOne;
    private Choice choiceTwo;
    private Boolean FinalPage = false;

    public Page(int imageID, int textID) {
        ImageID = imageID;
        this.textID = textID;
        this.FinalPage=true;
    }

    public int getImageID() {
        return ImageID;
    }


    public Page(int ImageID,int textID, Choice choiceOne, Choice choiceTwo) {
        this.ImageID = ImageID;
        this.textID = textID;
        this.choiceOne = choiceOne;
        this.choiceTwo = choiceTwo;
    }

    public void setImageID(int imageID) {
        ImageID = imageID;
    }

    public int getTextID() {
        return textID;
    }

    public void setTextID(int textID) {
        this.textID = textID;
    }

    public Choice getChoiceOne() {
        return choiceOne;
    }

    public void setChoiceOne(Choice choiceOne) {
        this.choiceOne = choiceOne;
    }

    public Choice getChoiceTwo() {
        return choiceTwo;
    }

    public void setChoiceTwo(Choice choiceTwo) {
        this.choiceTwo = choiceTwo;
    }

    public int getImageId() {
        return ImageID;
    }

    public void setImageId(int ImageId) {
        this.ImageID = ImageID;
    }
}
