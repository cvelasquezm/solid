package FunctionalInterfaces;

@FunctionalInterface
public interface Square {

    public void getArea(int x);

    default public String defaultMethod(){
        return "returning from default method";
    }
}
