
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Card[] hand = new Card[5];
        int totalPoin = 0;
        int jumlahKartu = 0;
        String pilihan = "ya";

        // Membuat dua kartu pertama
        for (int i = 0; i < 2; i++) {
            int suitNumber = (int) (Math.random() * 4.0 + 1);
            int faceNumber = (int) (Math.random() * 13.0 + 1);

            hand[jumlahKartu] = new Card(suitNumber, faceNumber);

            System.out.println("Kartu " + (jumlahKartu + 1) + ": "
                    + hand[jumlahKartu]);

            totalPoin += hand[jumlahKartu].getPoints();
            jumlahKartu++;
        }

        System.out.println("Total poin: " + totalPoin);

        // Mengambil kartu tambahan
        while (totalPoin <= 21 && jumlahKartu < 5
                && pilihan.equalsIgnoreCase("ya")) {

            System.out.print("Mau mengambil kartu lagi? (ya/tidak): ");
            pilihan = input.nextLine();

            if (pilihan.equalsIgnoreCase("ya")) {
                int suitNumber = (int) (Math.random() * 4.0 + 1);
                int faceNumber = (int) (Math.random() * 13.0 + 1);

                hand[jumlahKartu] = new Card(suitNumber, faceNumber);

                System.out.println("Kartu " + (jumlahKartu + 1) + ": "
                        + hand[jumlahKartu]);

                totalPoin += hand[jumlahKartu].getPoints();
                jumlahKartu++;

                System.out.println("Total poin sekarang: " + totalPoin);
            }
        }

        System.out.println("\n=== HASIL AKHIR ===");

        for (int i = 0; i < jumlahKartu; i++) {
            System.out.println(hand[i]);
            System.out.println("Poin: " + hand[i].getPoints());
        }

        System.out.println("Jumlah kartu: " + jumlahKartu);
        System.out.println("Total poin akhir: " + totalPoin);

        if (totalPoin > 21) {
            System.out.println("Poin melebihi 21!");
        } else {
            System.out.println("Permainan selesai.");
        }

        input.close();
    }
}
