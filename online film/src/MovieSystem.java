import java.util.ArrayList;
import java.util.List;
class MovieSystem {
    private List<Movie> filmler;
    private List<User> kullanicilar;

    public MovieSystem() {
        this.filmler = new ArrayList<>();
        this.kullanicilar = new ArrayList<>();
    }

    // Film ekleme
    public void filmEkle(Movie film) {
        this.filmler.add(film);
    }

    // Kullanıcı ekleme
    public void kullaniciEkle(User user) {
        this.kullanicilar.add(user);
    }

    // Film listeleme
    public void filmListele() {
        for (Movie film : filmler) {
            System.out.println(film.getBaslik() + " - Kategori: " + film.getKategori() + " - Fiyat: " + film.getFiyat());
        }
    }

    // Filmi sıralama (örneğin fiyatına göre)
    public void filmSirala() {
        filmler.sort((f1, f2) -> Double.compare(f1.getFiyat(), f2.getFiyat()));
        filmListele();
    }

    // Film talep etme
    public void filmTalepEt(Movie film) {
        MovieRequest request = new MovieRequest(film);
        request.talepEt();
    }
}
