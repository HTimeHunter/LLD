package com.pattern;

import com.pattern.proxy.YouTubeCacheProxy;
import com.pattern.remote.ThirdPartyYoutubeClass;

/**
 * in this code,
 * proxy pattern helps to implement the lazy initialization and caching to
 * an inefficient 3rd-party YouTube integration library.
 *
 * Proxy is very useful when we have to add some additional behaviors to a class which code you can't change.
 */
public class Main {
    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYoutubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive=test(naiveDownloader);
        long smart=test(smartDownloader);
        System.out.println("Time saved by caching proxy: "+(naive-smart)+" ms");
    }

    private static long test(YouTubeDownloader downloader){
        long startTime = System.currentTimeMillis();

        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis()-startTime;
        System.out.println("Time elapsed: "+estimatedTime+" ms\n");
        return estimatedTime;
    }
}