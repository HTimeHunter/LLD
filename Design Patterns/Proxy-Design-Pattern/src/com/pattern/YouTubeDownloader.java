package com.pattern;

import java.util.HashMap;

public class YouTubeDownloader {
    private ThirdPartyYoutubeLib api;
    public YouTubeDownloader(ThirdPartyYoutubeLib api){
        this.api=api;
    }
    public void renderVideoPage(String videoId){
        Video video=api.getVideo(videoId);
        System.out.println("\n.......fancy com.pattern.Video page.....");
        System.out.println("ID: "+video.getId());
        System.out.println("Title: "+video.getTitle());
        System.out.println("com.pattern.Video: "+video.getData());
        System.out.println("............................\n");
    }
    public void renderPopularVideos(){
        HashMap<String,Video> list=api.popularVideos();
        System.out.println("\n...........................");
        System.out.println("Most popular videos on Youtube");
        for (Video video:list.values()){
            System.out.println("ID: "+video.getId()+" / Title: "+video.getTitle());
        }
        System.out.println(".............................\n");
    }
}
