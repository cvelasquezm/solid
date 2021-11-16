package solid.common;

import solid.common.Door;

public class ConventionalDoor extends Door {

    public boolean isOpen() {
        return open;
    }

    public void Open(){
        System.out.println("Opening ConventionalDoor.....");
        open = true;
    }

    public void Close(){
        System.out.println("Closing ConventionalDoor.....");
        open = false;
    }
}
