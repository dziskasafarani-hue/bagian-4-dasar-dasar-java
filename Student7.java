
public class Student7 {
    private String name;
    private int credits;
    private double gpa;
    private int qualityPoints;

    public Student7(String name, int credits, int qualityPoints) {
        this.name = name;
        this.credits = credits;
        this.qualityPoints = qualityPoints;
        calculateGPA();
    }

    public double calculateGPA() {
        if (credits == 0) {
            gpa = 0.0;
        } else {
            gpa = (double) qualityPoints / credits;
        }
        return gpa;
    }

    public void addCourse(int newCredits, int newQualityPoints) {
        credits += newCredits;
        qualityPoints += newQualityPoints;
        calculateGPA();
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public int getQualityPoints() {
        return qualityPoints;
    }

    public double getGPA() {
        return gpa;
    }

  
public static void main(String[] args) {
    Student7 student1 = new Student7("Mary Jones", 14, 46);
    Student7 student2 = new Student7("John Stiner", 60, 173);
    Student7 student3 = new Student7("Ari Samala", 31, 69);
    student3.addCourse(13, 52);

    System.out.println("=== DATA MAHASISWA ===");

    System.out.println("Nama: " + student1.getName());
    System.out.println("Kredit: " + student1.getCredits());
    System.out.println("Poin Mutu: " + student1.getQualityPoints());
    System.out.println("IP: " + student1.getGPA());

    System.out.println();

    System.out.println("Nama: " + student2.getName());
    System.out.println("Kredit: " + student2.getCredits());
    System.out.println("Poin Mutu: " + student2.getQualityPoints());
    System.out.println("IP: " + student2.getGPA());

    System.out.println();

    System.out.println("Nama: " + student3.getName());
    System.out.println("Kredit: " + student3.getCredits());
    System.out.println("Poin Mutu: " + student3.getQualityPoints());
    System.out.println("IP: " + student3.getGPA());
}

    }

