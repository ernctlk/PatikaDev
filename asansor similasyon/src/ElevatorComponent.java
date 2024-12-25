
abstract class ElevatorComponent {
    public abstract void operate();
}

// Kapsülleme: Kapı bileşeni
class Door extends ElevatorComponent {
    private boolean isOpen;

    public Door() {
        this.isOpen = false;
    }

    @Override
    public void operate() {
        this.isOpen = !this.isOpen;
        System.out.println("Kapı " + (isOpen ? "açıldı" : "kapandı"));
    }

    public boolean isOpen() {
        return isOpen;
    }
}
