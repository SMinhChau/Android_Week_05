package com.example.android_week_05;

public class Food {
    private String title;
    private String rice;
    private int img;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Food() {
    }

    public Food(String title, String rice, int img) {
        this.title = title;
        this.rice = rice;
        this.img = img;
    }
}
