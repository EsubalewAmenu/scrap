package com.visionapps.grade12;

public class subject {
    private int imageURL;
    private String name;

    public subject(String str, int i) {
        this.name = str;
        this.imageURL = i;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public int getImageURL() {
        return this.imageURL;
    }

    public void setImageURL(int i) {
        this.imageURL = i;
    }

    public String toString() {
        return "subject{name='" + this.name + '\'' + ", imageURL='" + this.imageURL + '\'' + '}';
    }
}
