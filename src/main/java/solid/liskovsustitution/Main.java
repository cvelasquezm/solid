package solid.liskovsustitution;

import solid.common.ConventionalDoor;
import solid.common.Door;

public class Main {

    public static void main(String[] args) {
        liskovSubstitution();
    }



    /**
     * Liskov Substitution Principle<br>
     * 1. I have an instance of ConventionalDoor (sub class)<br>
     * 2. The invoked methods also have a ConventionalDoor param<br>
     * 3. We can change all occurrences of the ConventionalDoor for Door (base class) and the code must follow working
     */
    private static void liskovSubstitution() {

        //ConventionalDoor conventionalDoor = new ConventionalDoor();
        Door conventionalDoor = new ConventionalDoor();
        openDoor(conventionalDoor);
        closeDoor(conventionalDoor);
    }

    //private static void closeDoor(ConventionalDoor door) {
    private static void closeDoor(Door door) {
        door.Close();
    }

    //private static void openDoor(ConventionalDoor door) {
    private static void openDoor(Door door) {
        door.Open();
    }
}
