package com.pattern;

public interface DataSource {
    void writeData(String data);
    String readData();
}
