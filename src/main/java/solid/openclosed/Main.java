package solid.openclosed;

import solid.common.ConventionalDoor;
import solid.common.Door;

public class Main {

    public static void main(String[] args) {
        openClosed();
    }

    /**
     * Demo OpenClosed Principle<br><br>
     * If I want to extend the software just I need to create another class that implement the Door class and their methods.<br>
     * Once created pass this class as param in resolveInstance() method
     */
    private static void openClosed() {
        Door door = null;

        //ElectronicDoor.class
        //SecurityDoor.class
        door = resolveInstance(ConventionalDoor.class);

        door.Open();
        door.Close();
    }

    private static Door resolveInstance(Class clazz) {
        try {
            return (Door) clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
