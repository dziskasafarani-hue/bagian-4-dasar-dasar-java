import java.util.Scanner;

public class OperasiMatriks3 {
    static Scanner input = new Scanner(System.in);

    static int[][] A = new int[2][2];
    static int[][] B = new int[2][2];

    static boolean matriksAIsi = false;
    static boolean matriksBIsi = false;

    public static void main(String[] args) {
        char pilihan;

        do {
            System.out.println("\n=== MENU OPERASI MATRIKS ===");
            System.out.println("a. Masukkan Matriks A");
            System.out.println("b. Masukkan Matriks B");
            System.out.println("c. Tampilkan A + B");
            System.out.println("d. Tampilkan A - B");
            System.out.println("e. Tampilkan A * B");
            System.out.println("f. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.next().toLowerCase().charAt(0);

            switch (pilihan) {
                case 'a':
                    A = masukkanMatriks("A");
                    matriksAIsi = true;
                    break;

                case 'b':
                    B = masukkanMatriks("B");
                    matriksBIsi = true;
                    break;

                
case 'c':
    System.out.println("Matriks A terisi: " + matriksAIsi);
    System.out.println("Matriks B terisi: " + matriksBIsi);

    if (siapOperasi()) {
        int[][] hasil = jumlah(A, B);
        tampilkanMatriks(hasil);
    }
    break;


                case 'd':
                    if (siapOperasi()) {
                        tampilkanMatriks(kurang(A, B));
                    }
                    break;

                case 'e':
                    if (siapOperasi()) {
                        tampilkanMatriks(kali(A, B));
                    }
                    break;

                case 'f':
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 'f');

        input.close();
    }

    static int[][] masukkanMatriks(String nama) {
        int[][] matriks = new int[2][2];

        System.out.println("Masukkan elemen Matriks " + nama + ":");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Baris " + (i + 1)
                        + ", kolom " + (j + 1) + ": ");
                matriks[i][j] = input.nextInt();
            }
        }

        return matriks;
    }

    static boolean siapOperasi() {
        if (!matriksAIsi || !matriksBIsi) {
            System.out.println(
                "Masukkan Matriks A dan B terlebih dahulu!"
            );
            return false;
        }

        return true;
    }

    static int[][] jumlah(int[][] A, int[][] B) {
        int[][] hasil = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Hasil A + B:");
        return hasil;
    }

    static int[][] kurang(int[][] A, int[][] B) {
        int[][] hasil = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = A[i][j] - B[i][j];
            }
        }

        System.out.println("Hasil A - B:");
        return hasil;
    }

    static int[][] kali(int[][] A, int[][] B) {
        int[][] hasil = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    hasil[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Hasil A * B:");
        return hasil;
    }

    static void tampilkanMatriks(int[][] matriks) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
