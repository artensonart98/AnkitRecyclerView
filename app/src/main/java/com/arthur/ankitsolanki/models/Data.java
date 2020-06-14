package com.arthur.ankitsolanki.models;

public class Data {
    private Source source;
    private String author;
    private String title;
    private String description;

    public Data(Source source, String author, String title, String description) {
        this.source = source;
        this.author = author;
        this.title = title;
        this.description = description;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //now the JSOn data is modeled into java classes. got? yes
    //lets now create a class that will provide dummy data
}
