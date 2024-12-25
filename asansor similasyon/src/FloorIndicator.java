class FloorIndicator extends ElevatorComponent {
    private int floor;

    public FloorIndicator() {
        this.floor = 0;
    }

    @Override
    public void operate() {
        System.out.println("Asansör şu anda " + floor + ". katta.");
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}