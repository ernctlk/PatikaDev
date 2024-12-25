abstract class Elevator {
    protected Door door;
    protected FloorIndicator floorIndicator;
    protected ControlPanel controlPanel;
    protected int currentFloor;
    protected int targetFloor;

    public Elevator() {
        this.door = new Door();
        this.floorIndicator = new FloorIndicator();
        this.controlPanel = new ControlPanel();
        this.currentFloor = 0;
        this.targetFloor = -1;  // Hedef kat yok
    }

    public abstract void move();

    public void stop() {
        System.out.println("Asansör durdu.");
        door.operate();  // Kapı açılacak
        floorIndicator.operate();  // Kat gösterge ışığı güncellenir
    }

    public void setTargetFloor(int targetFloor) {
        this.targetFloor = targetFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getTargetFloor() {
        return targetFloor;
    }

    public void pressEmergencyButton() {
        controlPanel.pressEmergencyButton();
    }
}