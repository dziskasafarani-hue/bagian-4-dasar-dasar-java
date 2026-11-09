
import java.util.Scanner;

public class Penerimaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah valedictorian atau salutatorian? (true/false): ");
        boolean peringkat = input.nextBoolean();

        System.out.print("Jumlah siswa di sekolah: ");
        int jumlahSiswa = input.nextInt();

        System.out.print("Masukkan GPA: ");
        double gpa = input.nextDouble();

        System.out.print("Masukkan skor SAT: ");
        int sat = input.nextInt();

        boolean diterima =
            (peringkat && jumlahSiswa >= 1400)
            || (gpa >= 4.0 && sat >= 1100)
            || (gpa >= 3.5 && sat >= 1300)
            || (gpa >= 3.0 && sat >= 1500);

        if (diterima) {
            System.out.println("Mahasiswa diterima.");
        } else {
            System.out.println("Mahasiswa tidak diterima.");
        }

        input.close();
    }
}
