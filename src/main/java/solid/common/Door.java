package solid.common;

public abstract class Door {

    boolean open = false;
    public abstract void Open();
    public abstract void Close();
    public abstract boolean isOpen();
}
