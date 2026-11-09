import java.util.Date;

public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student("Budi", "Santoso", "Wijaya", new Date(),
                "2024001", "Ilmu Komputer", "Sarjana", 2028);

        String[] nilai = {"A", "A-", "B+", "B", "C"};
        System.out.println(s.getName());
        System.out.println("IP: " + s.calculateGPA(nilai));

        s.changeMajor("Matematika");
        System.out.println("Jurusan: " + s.getMajor());
    }
}