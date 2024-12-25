import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Örnek bir havaalanı oluşturma
        Airport istanbul = new Airport("IST", "İstanbul Havaalanı");
        Airport london = new Airport("LHR", "London Heathrow");

        // Örnek bir pilot oluşturma
        Pilot pilot1 = new Pilot("Ahmet Yılmaz", 5, null);
        Pilot yardimciPilot1 = new Pilot("Mehmet Kara", 3, null);

        // Örnek bir uçak oluşturma
        Airplane ucak1 = new Airplane("A123", "Boeing 737", "Çalışıyor", null);

        // Örnek bir uçuş oluşturma
        Flight ucus1 = new Flight("F001", istanbul, london, "08:00", "10:00", pilot1, yardimciPilot1, ucak1);

        // Örnek bir hava yolu şirketi oluşturma
        Airline thyp = new Airline("THY", "Türk Hava Yolları", null, null);

        // Çıktı: Uçuş Bilgisi
        System.out.println("Uçuş ID: " + ucus1.getId());
        System.out.println("Kalkış Havaalanı: " + ucus1.getKalkisHavaalani().getIsim());
        System.out.println("İniş Havaalanı: " + ucus1.getInisHavaalani().getIsim());
        System.out.println("Pilot: " + ucus1.getPilot().getIsim());
    }
}