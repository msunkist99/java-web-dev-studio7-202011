package org.launchcode.studio7;

import java.util.ArrayList;

public class BaseMedia {
    private int capacity;
    private String type;
    private int id;
    private int spinSpeed;


    private ArrayList<File> fileList;

    //constructor
    public BaseMedia(int capacity, String type, int spinSpeed, ArrayList<File> fileList){
        this.capacity = capacity;
        this.type = type;
        this.spinSpeed = spinSpeed;
        this.id = MediaIdGenerator.getMediaId();
        this.fileList = fileList;
    }

    public Boolean readDataFile(String fileName) {
        return searchFileList(fileName);
    }

    public int CalculateFreeSpace(){
        return 0;
    }

    public Boolean searchFileList(String name){
        for(File diskFile : fileList) {
            if (diskFile.getName().equals(name.toUpperCase())) {
                return true;
            }
        }
        return false;
    }

    public int getCapacity() {
        return capacity;
    }

//    public void setCapacity(int capacity) {
//        this.capacity = capacity;
//    }

    public String getType() {
        return type;
    }

//    public void setType(String type) {
//        this.type = type;
//    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

//    public void setSpinSpeed(int spinSpeed) {
//        this.spinSpeed = spinSpeed;
//    }

    public ArrayList<File> getFileList() {
        return fileList;
    }
}
