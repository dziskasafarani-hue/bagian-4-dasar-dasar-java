
import java.util.Scanner;

public class BeratPlanet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat di Bumi (lbs): ");
        double berat = input.nextDouble();

        System.out.println("Pilih planet:");
        System.out.println("1. Merkurius");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.println("5. Saturnus");
        System.out.println("6. Uranus");
        System.out.println("7. Neptunus");

        System.out.print("Masukkan pilihan (1-7): ");
        int pilihan = input.nextInt();

        String planet = "";
        double faktor = 0;

        switch (pilihan) {
            case 1:
                planet = "Merkurius";
                faktor = 0.38;
                break;
            case 2:
                planet = "Venus";
                faktor = 0.91;
                break;
            case 3:
                planet = "Mars";
                faktor = 0.38;
                break;
            case 4:
                planet = "Jupiter";
                faktor = 2.36;
                break;
            case 5:
                planet = "Saturnus";
                faktor = 0.92;
                break;
            case 6:
                planet = "Uranus";
                faktor = 0.89;
                break;
            case 7:
                planet = "Neptunus";
                faktor = 1.13;
                break;
            default:
                System.out.println("Pilihan planet tidak valid.");
                input.close();
                return;
        }

        double hasil = berat * faktor;
        System.out.printf(
            "Your weight on %s is %.2f lbs.%n", planet, hasil
        );

        input.close();
    }
}
