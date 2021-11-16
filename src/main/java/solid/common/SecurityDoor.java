package solid.common;

public class SecurityDoor extends Door {
    @Override
    public void Open() {
        System.out.println("Opening SecurityDoor...");
        open = true;
    }

    @Override
    public void Close() {
        System.out.println("Closing SecurityDoor...");
        open = false;
    }

    @Override
    public boolean isOpen() {
        return open;
    }
}
