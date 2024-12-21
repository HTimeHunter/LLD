package com.pattern.facade;

import com.pattern.AudioMixer;
import com.pattern.BitrateReader;
import com.pattern.MPEG4CompressionCodec;
import com.pattern.OggCompressionCodec;
import com.pattern.factory.CodecFactory;
import com.pattern.VideoFile;
import com.pattern.Codec;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format){
        System.out.println("facade.VideoConversionFacade: conversion started.");
        VideoFile file=new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals(MPEG4CompressionCodec.TYPE)){
            destinationCodec=new MPEG4CompressionCodec();
        } else {
            destinationCodec=new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file,sourceCodec);
        VideoFile intermediateResult= BitrateReader.convert(file,destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);

        System.out.println("facade.VideoConversionFacade: conversion completed.");
        return result;
    }
}
