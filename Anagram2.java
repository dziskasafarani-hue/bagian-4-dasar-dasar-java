import java.util.Scanner;
import java.util.Arrays;

public class Anagram2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata pertama: ");
        String kata1 = input.nextLine();

        System.out.print("Masukkan kata kedua: ");
        String kata2 = input.nextLine();

        // Mengubah huruf menjadi huruf kecil
        kata1 = kata1.toLowerCase();
        kata2 = kata2.toLowerCase();

        // Menghapus spasi dan tanda baca
        kata1 = kata1.replaceAll("[^a-z]", "");
        kata2 = kata2.replaceAll("[^a-z]", "");

        // Mengubah String menjadi array karakter
        char[] huruf1 = kata1.toCharArray();
        char[] huruf2 = kata2.toCharArray();

        // Mengurutkan karakter
        Arrays.sort(huruf1);
        Arrays.sort(huruf2);

        // Membandingkan kedua array
        if (Arrays.equals(huruf1, huruf2)) {
            System.out.println("Kedua kata adalah anagram.");
        } else {
            System.out.println("Kedua kata bukan anagram.");
        }

        input.close();
    }
}
