package com.example.videos;

import java.util.LinkedList;
import java.util.List;

public class VideoDao {

    private static List<Video> videoList = new LinkedList<>();
    private boolean listIsEmpty;

    public VideoDao() {
    }

    public static List<Video> getVideoList() {
        return videoList;
    }

    public static void setVideoList(List<Video> videoList) {
        VideoDao.videoList = videoList;
    }

    public void addVideo(Video video){
        videoList.add(video);
    }

    public List<Video> findAllVideo(){
        return videoList;
    }

    public boolean isListIsEmpty() {
        return listIsEmpty;
    }

    public void setListIsEmpty(boolean listIsEmpty) {
        this.listIsEmpty = listIsEmpty;
    }
}
