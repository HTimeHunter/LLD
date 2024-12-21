package com.pattern;

public class OggCompressionCodec implements Codec {
    public static final String TYPE = "ogg";

    @Override
    public String getType() {
        return TYPE;
    }
}
