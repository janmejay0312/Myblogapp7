package com.example.janmejay.myblogapp;

public class Blog {
    private String title;
    private String image;
    private String description;
    private String id;
    public Blog(){}
    public Blog(String title,String image,String description)
    {
        this.description=description;
        this.image=image;
        this.title=title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
