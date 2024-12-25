class PassengerElevator extends Elevator {
    @Override
    public void move() {
        if (targetFloor > currentFloor) {
            System.out.println("Asansör yukarı hareket ediyor.");
            currentFloor++;
        } else if (targetFloor < currentFloor) {
            System.out.println("Asansör aşağı hareket ediyor.");
            currentFloor--;
        } else {
            System.out.println("Hedef kat zaten mevcut.");
            stop();
        }
    }
}