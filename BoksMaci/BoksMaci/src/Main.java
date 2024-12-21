import java.util.Random;

class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighter opponent) {
        System.out.println(this.name + " => " + opponent.name + " " + this.damage + " hasar verdi.");

        if (opponent.isDodge()) {
            System.out.println(opponent.name + " gelen hasarı savurdu!");
            return opponent.health;
        }

        return Math.max(opponent.health - this.damage, 0);
    }

    boolean isDodge() {
        Random random = new Random();
        return random.nextDouble() <= this.dodge;
    }
}

class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (checkWeight()) {
            Random random = new Random();
            boolean isF1Start = random.nextBoolean(); // %50 olasılık

            System.out.println("Maç Başlıyor!");
            while (this.f1.health > 0 && this.f2.health > 0) {
                if (isF1Start) {
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) break;
                } else {
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) break;
                }
                isF1Start = !isF1Start; // Her turda saldıran değişir
                printScore();
            }
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    boolean checkWeight() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) &&
                (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandı!");
            return true;
        } else if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandı!");
            return true;
        }
        return false;
    }

    void printScore() {
        System.out.println("---------------------");
        System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
        System.out.println(this.f2.name + " Sağlık: " + this.f2.health);
    }
}

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Ali", 10, 120, 100, 0.2);
        Fighter f2 = new Fighter("Mehmet", 15, 85, 100, 0.3);

        Ring ring = new Ring(f1, f2, 85, 100);
        ring.run();
    }
}
