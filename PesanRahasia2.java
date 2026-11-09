import java.util.Scanner;

public class PesanRahasia2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah = 0;
        String pesan = "";

        while (jumlah < 10) {
            System.out.print("Masukkan angka ke-" + (jumlah + 1) + ": ");
            int angka = input.nextInt();

            switch (angka) {
                case 1:
                    pesan += "D";
                    jumlah++;
                    break;
                case 2:
                    pesan += "W";
                    jumlah++;
                    break;
                case 3:
                    pesan += "E";
                    jumlah++;
                    break;
                case 4:
                    pesan += "L";
                    jumlah++;
                    break;
                case 5:
                    pesan += "H";
                    jumlah++;
                    break;
                case 6:
                    pesan += "O";
                    jumlah++;
                    break;
                case 7:
                    pesan += "R";
                    jumlah++;
                    break;
                default:
                    System.out.println("Angka tidak valid! Masukkan angka 1-7.");
            }
        }

        System.out.println("Pesan rahasia: " + pesan);

        input.close();
    }
}
