package com.pattern;

public class MPEG4CompressionCodec implements Codec {
    public static final String TYPE = "mp4";

    @Override
    public String getType() {
        return TYPE;
    }
}
