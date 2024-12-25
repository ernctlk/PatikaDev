public class Main {
    public static void main(String[] args) {
        MovieSystem sistem = new MovieSystem();

        // Film ekleme
        Movie film1 = new Movie("1", "Matrix", "Aksiyon", 10, 5, true);
        Movie film2 = new Movie("2", "Inception", "Bilim Kurgu", 12, 0, true);  // Stokta yok
        Movie film3 = new Movie("3", "The Lion King", "Animasyon", 8, 3, true);
        sistem.filmEkle(film1);
        sistem.filmEkle(film2);
        sistem.filmEkle(film3);

        // Kullanıcı ekleme
        User user1 = new User("1", "Ahmet");
        User user2 = new User("2", "Mehmet");
        sistem.kullaniciEkle(user1);
        sistem.kullaniciEkle(user2);

        // Kullanıcı işlemleri
        user1.aboneOl();
        user1.krediAl(20);

        // Film kiralama
        boolean kiralamaSonucu = user1.filmKirala(film1);
        if (kiralamaSonucu) {
            System.out.println(user1.getIsim() + " " + film1.getBaslik() + " filmini kiraladı.");
        } else {
            System.out.println(user1.getIsim() + " kiralama işlemi başarısız.");
        }

        // Film satın alma
        boolean satinAlmaSonucu = user2.filmSatınAl(film3);
        if (satinAlmaSonucu) {
            System.out.println(user2.getIsim() + " " + film3.getBaslik() + " filmini satın aldı.");
        } else {
            System.out.println(user2.getIsim() + " satın alma işlemi başarısız.");
        }

        // Film listeleme ve sıralama
        System.out.println("\nFilmler Listesi:");
        sistem.filmListele();

        System.out.println("\nFilmler Sıralandı (Fiyat):");
        sistem.filmSirala();

        // Film talep etme
        sistem.filmTalepEt(film2);  // Stokta olmayan bir film talep ediliyor
    }
}