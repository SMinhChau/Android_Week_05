package com.example.android_week_05;

public class Food {
    private int id;
    private String title;
    private String rice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public Food(int id, String title, String rice) {
        this.id = id;
        this.title = title;
        this.rice = rice;
    }
}
