import java.util.List;
class Pilot {
    private String isim;
    private int deneyim;  // Deneyim seviyesi
    private List<Flight> ucuslar;

    public Pilot(String isim, int deneyim, List<Flight> ucuslar) {
        this.isim = isim;
        this.deneyim = deneyim;
        this.ucuslar = ucuslar;
    }

    // Getter ve Setter metodları
    public String getIsim() { return isim; }
    public int getDeneyim() { return deneyim; }
    public List<Flight> getUcuslar() { return ucuslar; }
}
