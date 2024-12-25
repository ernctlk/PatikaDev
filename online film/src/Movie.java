import java.util.ArrayList;
import java.util.List;

class Movie {
    private String id;
    private String baslik;
    private String kategori;
    private double fiyat;
    private int stok;  // Mevcut film sayısı
    private boolean talepEdilebilir;

    public Movie(String id, String baslik, String kategori, double fiyat, int stok, boolean talepEdilebilir) {
        this.id = id;
        this.baslik = baslik;
        this.kategori = kategori;
        this.fiyat = fiyat;
        this.stok = stok;
        this.talepEdilebilir = talepEdilebilir;
    }

    // Getter ve Setter metodları
    public String getId() { return id; }
    public String getBaslik() { return baslik; }
    public String getKategori() { return kategori; }
    public double getFiyat() { return fiyat; }
    public int getStok() { return stok; }
    public boolean isTalepEdilebilir() { return talepEdilebilir; }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setTalepEdilebilir(boolean talepEdilebilir) {
        this.talepEdilebilir = talepEdilebilir;
    }
}