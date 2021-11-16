package solid.dependencyinversion;

public class Contability1 implements Contability{

    @Override public void processPayments() {
        System.out.println("Processing payments... " + this.getClass().getName());
    }

    @Override public void calculatePayments() {

    }
}
