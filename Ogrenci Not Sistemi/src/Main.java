import java.util.Scanner;

class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
}

class Course {
    String name;
    String code;
    String prefix;
    Teacher teacher;
    int examNote;
    int oralNote;
    double examWeight;
    double oralWeight;

    Course(String name, String code, String prefix, double examWeight, double oralWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examNote = 0;
        this.oralNote = 0;
        this.examWeight = examWeight;
        this.oralWeight = oralWeight;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            System.out.println("Öğretmen başarıyla atandı.");
        } else {
            System.out.println("Öğretmenin branşı dersin alanıyla eşleşmiyor!");
        }
    }

    void printTeacher() {
        if (teacher != null) {
            System.out.println("Derse Atanan Öğretmen: " + teacher.name);
        } else {
            System.out.println("Bu ders için öğretmen atanmamış.");
        }
    }
}

class Student {
    String name;
    String stuNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(Scanner scanner) {
        System.out.println(this.course1.name + " için sınav notunu girin: ");
        this.course1.examNote = scanner.nextInt();
        System.out.println(this.course1.name + " için sözlü notunu girin: ");
        this.course1.oralNote = scanner.nextInt();

        System.out.println(this.course2.name + " için sınav notunu girin: ");
        this.course2.examNote = scanner.nextInt();
        System.out.println(this.course2.name + " için sözlü notunu girin: ");
        this.course2.oralNote = scanner.nextInt();

        System.out.println(this.course3.name + " için sınav notunu girin: ");
        this.course3.examNote = scanner.nextInt();
        System.out.println(this.course3.name + " için sözlü notunu girin: ");
        this.course3.oralNote = scanner.nextInt();
    }

    void calcAverage() {
        double course1Average = (this.course1.examNote * this.course1.examWeight) + (this.course1.oralNote * this.course1.oralWeight);
        double course2Average = (this.course2.examNote * this.course2.examWeight) + (this.course2.oralNote * this.course2.oralWeight);
        double course3Average = (this.course3.examNote * this.course3.examWeight) + (this.course3.oralNote * this.course3.oralWeight);
        this.average = (course1Average + course2Average + course3Average) / 3.0;
    }

    void checkPass() {
        calcAverage();
        this.isPass = this.average >= 55;
    }

    void printNote() {
        System.out.println("Öğrenci: " + this.name);
        System.out.println(this.course1.name + " Sınav Notu: " + this.course1.examNote + " Sözlü Notu: " + this.course1.oralNote);
        System.out.println(this.course2.name + " Sınav Notu: " + this.course2.examNote + " Sözlü Notu: " + this.course2.oralNote);
        System.out.println(this.course3.name + " Sınav Notu: " + this.course3.examNote + " Sözlü Notu: " + this.course3.oralNote);
        System.out.println("Ortalama: " + this.average);
        System.out.println(this.isPass ? "Sınıfı Geçti." : "Sınıfta Kaldı.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Teacher t1 = new Teacher("Ahmet Hoca", "123", "FZK");
        Teacher t2 = new Teacher("Ayşe Hoca", "456", "MAT");
        Teacher t3 = new Teacher("Mehmet Hoca", "789", "KMY");

        Course fizik = new Course("Fizik", "101", "FZK", 0.8, 0.2);
        Course matematik = new Course("Matematik", "102", "MAT", 0.7, 0.3);
        Course kimya = new Course("Kimya", "103", "KMY", 0.9, 0.1);

        fizik.addTeacher(t1);
        matematik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Ali", "001", "10-A", fizik, matematik, kimya);
        s1.addBulkExamNote(scanner);
        s1.checkPass();
        s1.printNote();

        scanner.close();
    }
}
