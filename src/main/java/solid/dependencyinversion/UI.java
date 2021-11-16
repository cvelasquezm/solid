package solid.dependencyinversion;

public class UI {

    public void calculatePayments(Contability contability){
        contability.calculatePayments();
    }

    public void processPayments(Contability contability){
        contability.processPayments();
    }
}
