import java.util.*;


class ElevatorSystem {
    private List<Elevator> elevators;
    private Random random;

    public ElevatorSystem() {
        elevators = new ArrayList<>();
        random = new Random();
    }

    public void addElevator(Elevator elevator) {
        elevators.add(elevator);
    }

    public void requestElevator(int requestedFloor) {
        System.out.println(requestedFloor + ". kattan asansör çağrıldı.");

        Elevator assignedElevator = elevators.get(random.nextInt(elevators.size())); // Rastgele bir asansör seçilir
        assignedElevator.setTargetFloor(requestedFloor);

        assignedElevator.move();
    }
}