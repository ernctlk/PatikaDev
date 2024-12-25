import java.util.List;
class Airplane {
    private String id;
    private String tur;
    private String durum;  // Çalışır veya Onarımda
    private List<Flight> ucuslar;

    public Airplane(String id, String tur, String durum, List<Flight> ucuslar) {
        this.id = id;
        this.tur = tur;
        this.durum = durum;
        this.ucuslar = ucuslar;
    }

    // Getter ve Setter metodları
    public String getId() { return id; }
    public String getTur() { return tur; }
    public String getDurum() { return durum; }
    public List<Flight> getUcuslar() { return ucuslar; }
}
