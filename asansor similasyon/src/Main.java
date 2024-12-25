public class Main {
    public static void main(String[] args) {
        // Asansör sistemi oluşturuluyor
        ElevatorSystem elevatorSystem = new ElevatorSystem();

        // 5 adet asansör ekleniyor
        elevatorSystem.addElevator(new PassengerElevator());
        elevatorSystem.addElevator(new CargoElevator());
        elevatorSystem.addElevator(new PassengerElevator());
        elevatorSystem.addElevator(new CargoElevator());
        elevatorSystem.addElevator(new PassengerElevator());

        // Asansör çağırma
        elevatorSystem.requestElevator(3);
        elevatorSystem.requestElevator(7);
        elevatorSystem.requestElevator(10);
    }
}