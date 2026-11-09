
import java.util.Scanner;

public class KalkulatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double a = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /, %): ");
        char op = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double b = input.nextDouble();

        switch (op) {
            case '+':
                System.out.println("Hasil: " + (a + b));
                break;
            case '-':
                System.out.println("Hasil: " + (a - b));
                break;
            case '*':
                System.out.println("Hasil: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Hasil: " + (a / b));
                } else {
                    System.out.println("Tidak bisa dibagi nol.");
                }
                break;
            case '%':
                if (b != 0) {
                    System.out.println("Hasil: " + (a % b));
                } else {
                    System.out.println("Tidak bisa menghitung sisa bagi dengan nol.");
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
        }

        input.close();
    }
}
