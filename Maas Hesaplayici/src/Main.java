public class Main {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Main(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary <= 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public int bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int currentYear = 2021;
        int workYears = currentYear - hireYear;

        if (workYears < 10) {
            return salary * 0.05;
        } else if (workYears >= 10 && workYears < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    @Override
    public String toString() {
        double tax = tax();
        int bonus = bonus();
        double raise = raiseSalary();
        double totalSalary = salary - tax + bonus + raise;

        return "Adı: " + name + "\n" +
                "Maaşı: " + salary + "\n" +
                "Çalışma Saati: " + workHours + "\n" +
                "Başlangıç Yılı: " + hireYear + "\n" +
                "Vergi: " + tax + "\n" +
                "Bonus: " + bonus + "\n" +
                "Maaş Artışı: " + raise + "\n" +
                "Vergi ve Bonuslar ile Toplam Maaş: " + totalSalary + "\n";
    }

    public static void main(String[] args) {
        Main emp = new Main("Ahmet Yılmaz", 1200, 45, 2015);
        System.out.println(emp);
    }
}
