package com.decorator.utils;

import java.io.*;

public class FileUtils {

    /**
     * InputStream & FileReader
     * suitable for smaller files
     * it directly accesses data with less overhead, but lacks the performance benefits of buffering.
     */

    /**
     * InputStream: when working with binary files (images, videos, audio files)
     * when reading raw data that doesn't need to be interpreted as text.
     */
    public static InputStream createInputStream(String file){
        try {
            return new FileInputStream(file);
        } catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * FileReader: when working with text files that need to be processed as characters.
     * when character encoding and text readability are important.
     */
    public static FileReader createFileReader(String file){
        try {
            return new FileReader(file);
        } catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * use this for large files or high-frequency I/O operations
     * it reduces number of read/write system calls by buffering the chunk of data
     */
    public static BufferedReader createBufferedFileReader(String file){
        return new BufferedReader(createFileReader(file));
    }

    public static BufferedInputStream createBufferedInputStream(String file){
        return new BufferedInputStream(createInputStream(file));
    }

    public static OutputStream createOutputStream(String file){
        try {
            return new FileOutputStream(file);
        } catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void closeStream(AutoCloseable... closeables){
        for (AutoCloseable closeable:closeables){
            try {
                if (closeable!=null){
                    closeable.close();
                }
            } catch (Exception e){
                throw new RuntimeException(e.getMessage());
            }
        }
    }

    public static void writeToStream(OutputStream outputStream,String data){
        try {
            outputStream.write(data.getBytes(),0,data.length());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static char[] readFromFile(FileReader reader,String data){
        char[]buffer=null;
        try {
            buffer=new char[(int)data.length()];
            reader.read(buffer);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return buffer;
    }
}
