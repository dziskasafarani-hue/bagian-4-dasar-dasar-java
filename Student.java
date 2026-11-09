import java.util.Date;

public class Student extends Person {

    private String nim;
    private double gpa;
    private String major;
    private String degree;          // Sarjana, Magister, Doktor
    private int expectedGradYear;

    public Student(String firstName, String middleName, String lastName,
                   Date dateOfBirth, String nim, String major,
                   String degree, int expectedGradYear) {
        super(firstName, middleName, lastName, dateOfBirth);
        this.nim = nim;
        this.major = major;
        this.degree = degree;
        this.expectedGradYear = expectedGradYear;
        this.gpa = 0.0;
    }

    // method akses (getter)
    public String getNim() { return nim; }
    public double getGpa() { return gpa; }
    public String getMajor() { return major; }
    public String getDegree() { return degree; }
    public int getExpectedGradYear() { return expectedGradYear; }

    // administrator mengubah jurusan
    public void changeMajor(String newMajor) {
        this.major = newMajor;
    }

    // hitung IP dari array nilai, mis. {"A", "B+", "A-"}
    public double calculateGPA(String[] grades) {
        if (grades == null || grades.length == 0) {
            return 0.0;
        }
        double total = 0;
        for (String grade : grades) {
            total += gradeToPoint(grade);
        }
        gpa = total / grades.length;
        return gpa;
    }

    private double gradeToPoint(String grade) {
        switch (grade.trim().toUpperCase()) {
            case "A":  return 4.0;
            case "A-": return 3.67;
            case "B+": return 3.33;
            case "B":  return 3.0;
            case "B-": return 2.67;
            case "C+": return 2.33;
            case "C":  return 2.0;
            case "D":  return 1.0;
            case "F":  return 0.0;
            default:
                throw new IllegalArgumentException("Nilai tidak valid: " + grade);
        }
    }
}