import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total jumlah orang yang mendaftar: ");
        int totalOrang = input.nextInt();

        // Kapasitas bus 45 orang
        int jumlahBus = totalOrang / 45;      // Pembagian bulat
        int jumlahVan = totalOrang % 45;      // Sisa pembagian (modulus)

        System.out.println("Jumlah bus yang diperlukan: " + jumlahBus);
        System.out.println("Jumlah orang yang harus naik van: " + jumlahVan);

        input.close();
    }
}