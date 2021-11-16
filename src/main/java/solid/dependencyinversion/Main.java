package solid.dependencyinversion;

public class Main {

    public static void main(String[] args) {
        final Contability contability = resolveInstance();
        final UI ui = new UI();

        ui.calculatePayments(contability);
        ui.processPayments(contability);
    }

    public static Contability resolveInstance(){
        return new Contability2();
    }
}
