package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseMedia implements Disk{
    private String cdType;

    public CD(int capacity, String type, int spinSpeed, String cdType, ArrayList<File> fileList) {
        super(capacity, type, spinSpeed,fileList);
        this.cdType = cdType;
    }

    @Override
    public Boolean spinDisk() {
        return true;
    }

    public Boolean addFile(File file){
        // you have to check the cdType before addFile -- some CDs are read only
        // some CDs are write once
        //you have to check capacity before adding a file

        int unavailableDiskSpace = 0;
        if (this.cdType.equals("RW")) {
            for (File diskFile : getFileList()) {
                unavailableDiskSpace+= diskFile.getSize();
            }
            if (!((this.getCapacity() - unavailableDiskSpace) < file.getSize())) {
                this.getFileList().add(file);
                return true;
            }
        }
        return false;
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
