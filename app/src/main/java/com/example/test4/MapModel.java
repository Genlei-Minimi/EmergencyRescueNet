package com.example.test4;

public class MapModel {
    String mapList;
    int mapImage;
    int mapImage2;

    public MapModel(String mapList, int mapImage, int mapImage2) {
        this.mapList = mapList;
        this.mapImage = mapImage;
        this.mapImage2 = mapImage2;
    }


    public String getMapList() {
        return mapList;
    }

    public int getMapImage() {
        return mapImage;
    }

    public int getMapImage2() {
        return mapImage2;
    }
}
