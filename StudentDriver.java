// File: StudentDriver.java

// 1. Class Student (Rancangan Objek)
class Student {
    String fName;
    String lName;
    int stuId;
    String stuStatus;

    // Method untuk cetak data
    public void displayInfo() {
        System.out.println("Student Name: " + fName + " " + lName);
        System.out.println("Student ID: " + stuId);
        System.out.println("Student Status: " + stuStatus);
    }
}

// 2. Driver Class (Kelas utama yang ada main method-nya)
public class StudentDriver {
    public static void main(String[] args) {
        // Membuat/instansiasi objek Student baru
        Student s1 = new Student();
        
        // Mengisi data ke variabel objek
        s1.fName = "Lisa"; 
        s1.lName = "Palombo";
        s1.stuId = 123456789;
        s1.stuStatus = "Active";

        // Memanggil method untuk mencetak ke layar
        s1.displayInfo();
    }
}