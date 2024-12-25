import java.util.ArrayList;
import java.util.List;
class User {
    private String id;
    private String isim;
    private boolean aboneMi;
    private double kredi;
    private List<Movie> kiralananFilmler;

    public User(String id, String isim) {
        this.id = id;
        this.isim = isim;
        this.aboneMi = false;
        this.kredi = 0;
        this.kiralananFilmler = new ArrayList<>();
    }

    // Getter ve Setter metodları
    public String getId() { return id; }
    public String getIsim() { return isim; }
    public boolean isAboneMi() { return aboneMi; }
    public double getKredi() { return kredi; }
    public List<Movie> getKiralananFilmler() { return kiralananFilmler; }

    // Abonelik işlemleri
    public void aboneOl() {
        this.aboneMi = true;
    }

    public void krediAl(double miktar) {
        this.kredi += miktar;
    }

    // Film kiralama işlemi
    public boolean filmKirala(Movie film) {
        if (film.getStok() > 0 && this.kredi >= film.getFiyat()) {
            this.kredi -= film.getFiyat();
            film.setStok(film.getStok() - 1);
            this.kiralananFilmler.add(film);
            return true;
        }
        return false;
    }
    // Film satın alma işlemi
    public boolean filmSatınAl(Movie film) {
        if (film.getStok() > 0) {
            film.setStok(film.getStok() - 1);
            this.kiralananFilmler.add(film);
            return true;
        }
        return false;
    }
}
