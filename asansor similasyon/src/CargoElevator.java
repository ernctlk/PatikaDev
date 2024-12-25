class CargoElevator extends Elevator {
    @Override
    public void move() {
        if (targetFloor > currentFloor) {
            System.out.println("Yük asansörü yukarı hareket ediyor.");
            currentFloor++;
        } else if (targetFloor < currentFloor) {
            System.out.println("Yük asansörü aşağı hareket ediyor.");
            currentFloor--;
        } else {
            System.out.println("Hedef kat zaten mevcut.");
            stop();
        }
    }
}