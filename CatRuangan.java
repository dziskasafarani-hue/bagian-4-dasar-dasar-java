
import java.util.Scanner;

public class CatRuangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tinggi ruangan (kaki): ");
        double tinggi = input.nextDouble();

        System.out.print("Panjang ruangan (kaki): ");
        double panjang = input.nextDouble();

        System.out.print("Lebar ruangan (kaki): ");
        double lebar = input.nextDouble();

        double luasDinding = 2 * tinggi * (panjang + lebar);
        double luasPlafon = panjang * lebar;
        double luasTotal = luasDinding + luasPlafon;

        System.out.printf("Luas dinding: %.2f kaki persegi%n", luasDinding);
        System.out.printf("Luas plafon: %.2f kaki persegi%n", luasPlafon);
        System.out.printf("Luas total: %.2f kaki persegi%n", luasTotal);

        int ember5 = 0;
        int ember1 = 0;
        double biayaMinimum = Double.MAX_VALUE;

        for (int besar = 0; besar <= Math.ceil(luasTotal / 1500.0); besar++) {
            double sisa = luasTotal - besar * 1500.0;
            int kecil = Math.max(0, (int) Math.ceil(sisa / 300.0));

            double biaya = besar * 15.0 + kecil * 4.0;

            if (biaya < biayaMinimum) {
                biayaMinimum = biaya;
                ember5 = besar;
                ember1 = kecil;
            }
        }

        System.out.println("Ember 5 liter: " + ember5);
        System.out.println("Ember 1 liter: " + ember1);
        System.out.printf("Total biaya: $%.2f%n", biayaMinimum);

        input.close();
    }
}
