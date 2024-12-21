package com.pattern;

public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec){
        System.out.println("com.pattern.BitrateReader: reading File ..........."+codec.getType());
        return file;
    }
    public static VideoFile convert(VideoFile file, Codec codec){
        System.out.println("com.pattern.BitrateReader: writing File ............"+codec.getType());
        return file;
    }
}
