import java.util.List;
class Flight {
    private String id;
    private Airport kalkisHavaalani;
    private Airport inisHavaalani;
    private String kalkisSaati;
    private String inisSaati;
    private Pilot pilot;
    private Pilot yardimciPilot;
    private Airplane ucak;

    public Flight(String id, Airport kalkisHavaalani, Airport inisHavaalani,
                  String kalkisSaati, String inisSaati, Pilot pilot,
                  Pilot yardimciPilot, Airplane ucak) {
        this.id = id;
        this.kalkisHavaalani = kalkisHavaalani;
        this.inisHavaalani = inisHavaalani;
        this.kalkisSaati = kalkisSaati;
        this.inisSaati = inisSaati;
        this.pilot = pilot;
        this.yardimciPilot = yardimciPilot;
        this.ucak = ucak;
    }

    // Getter ve Setter metodları
    public String getId() { return id; }
    public Airport getKalkisHavaalani() { return kalkisHavaalani; }
    public Airport getInisHavaalani() { return inisHavaalani; }
    public String getKalkisSaati() { return kalkisSaati; }
    public String getInisSaati() { return inisSaati; }
    public Pilot getPilot() { return pilot; }
    public Pilot getYardimciPilot() { return yardimciPilot; }
    public Airplane getUcak() { return ucak; }
}