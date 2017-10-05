package com.example.ranad_000.recyclerpractice;


/**
 * Created by ranad_000 on 9/25/2017.
 */

public class Data_for_Cards {

    private String title;
    private int ImageID;



    public Data_for_Cards() {

    }

    public Data_for_Cards(String title, int ImageID) {
        this.title = title;
        this.ImageID = ImageID;
    }

    //private List<Card_for_nutrition> card;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageID() {
        return ImageID;
    }

    public void setImageID(int imageID) {
        ImageID = imageID;
    }

}

