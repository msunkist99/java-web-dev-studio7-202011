package org.launchcode.studio7;

public class MediaIdGenerator {
    private static int id = 0;

    public static int getMediaId() {
        id++;
        return id;
    }

}
