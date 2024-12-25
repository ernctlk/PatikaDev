
import java.util.*;
    class ControlPanel {
    private Map<Integer, Boolean> targetButtons;
    private boolean doorOpenButton;
    private boolean emergencyButton;

    public ControlPanel() {
        targetButtons = new HashMap<>();
        doorOpenButton = false;
        emergencyButton = false;
    }

    public void pressTargetButton(int targetFloor) {
        targetButtons.put(targetFloor, true);
        System.out.println(targetFloor + ". kat hedefi seçildi.");
    }

    public void openDoor() {
        doorOpenButton = true;
        System.out.println("Kapı açıldı.");
    }

    public void pressEmergencyButton() {
        emergencyButton = true;
        System.out.println("Acil durum butonu basıldı.");
    }

    public boolean isEmergencyButtonPressed() {
        return emergencyButton;
    }
}
