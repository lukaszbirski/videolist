package com.example.videos;


public class Video {
    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Video(String name, String url) {
        this.name = name;
        this.url = url;
    }
}
