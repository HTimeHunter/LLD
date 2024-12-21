package com.pattern.client;

import java.io.File;
import com.pattern.facade.VideoConversionFacade;

/**
 * In this code, the Facade simplifies communication with a complex video conversion framework.
 * here, Facade provides a single class with a single method that handles all the complexity of configuring
 * the right classes of the framework and retrieving the result in a correct format.
 */
public class Main {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubeVideo.ogg","mp4");
        System.out.println(mp4Video.getName());
    }
}