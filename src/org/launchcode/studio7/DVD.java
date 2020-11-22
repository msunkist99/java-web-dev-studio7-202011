package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseMedia implements Disk {

    public DVD(int capacity, String type, int spinSpeed, ArrayList<File> fileList) {
        super(capacity, type, spinSpeed, fileList);
    }

    @Override
    public Boolean spinDisk() {
        return null;
    }

    public Boolean addFile(File file){
        //you have to check capacity before adding a file
        int unavailableDiskSpace = 0;

        for (File diskFile : getFileList()) {
            unavailableDiskSpace+= diskFile.getSize();
        }
        if (!((this.getCapacity() - unavailableDiskSpace) < file.getSize())) {
            this.getFileList().add(file);
            return true;
        }
        return false;
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
