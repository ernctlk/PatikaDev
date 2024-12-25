import java.util.List;
class Airline {
    private String id;
    private String isim;
    private List<Airplane> ucaklar;
    private List<Pilot> pilotlar;

    public Airline(String id, String isim, List<Airplane> ucaklar, List<Pilot> pilotlar) {
        this.id = id;
        this.isim = isim;
        this.ucaklar = ucaklar;
        this.pilotlar = pilotlar;
    }

    // Getter ve Setter metodları
    public String getId() { return id; }
    public String getIsim() { return isim; }
    public List<Airplane> getUcaklar() { return ucaklar; }
    public List<Pilot> getPilotlar() { return pilotlar; }
}
