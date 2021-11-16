package solid.common;

public class ElectronicDoor extends Door {
    @Override
    public void Open() {
        System.out.println("Opening ElectronicDoor");
        open = !open;
    }

    @Override
    public void Close() {
        System.out.println("Closing ElectronicDoor");
        open = !open;
    }

    @Override
    public boolean isOpen() {
        return open;
    }
}
