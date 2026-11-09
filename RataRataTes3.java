
import java.util.Scanner;

public class RataRataTes3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilai = new int[5];
        int total = 0;
        double rataRata;

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nilai tes ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        rataRata = total / 5.0;

        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata mahasiswa: " + rataRata);

        input.close();
    }
}
