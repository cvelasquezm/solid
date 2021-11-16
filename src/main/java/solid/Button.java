package solid;

import solid.common.Door;

public class Button {

    public void press(Door door){
        if(door.isOpen()){
            door.Close();
            return;
        }
        door.Open();
    }
}
