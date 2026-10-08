public class TugasString {
    public static void main(String[] args) {
        // --- SOAL NOMOR 2 ---
        String s1 = "ABC";
        String s2 = new String("DEF");
        String s3 = "AB" + "C";

        System.out.println("--- Hasil Soal Nomor 2 ---");
        System.out.println("a. s1.compareTo(s2) : " + s1.compareTo(s2)); // Output: -3
        System.out.println("b. s2.equals(s3)    : " + s2.equals(s3));    // Output: false
        System.out.println("c. s3 == s1         : " + (s3 == s1));       // Output: true
        System.out.println("d. s2.compareTo(s3) : " + s2.compareTo(s3)); // Output: 3
        System.out.println("e. s3.equals(s1)    : " + s3.equals(s1));    // Output: true

        // --- SOAL NOMOR 3 ---
        System.out.println("\n--- Hasil Soal Nomor 3 ---");
        // Deklarasi dan instansiasi dua object String terpisah
        String kataPertama = "Halo";
        String kataKedua = "Dunia";

        // Menggabungkan keduanya dan menetapkan ke object String ketiga
        String kataKetiga = kataPertama + " " + kataKedua;

        System.out.println("String 1: " + kataPertama);
        System.out.println("String 2: " + kataKedua);
        System.out.println("String 3 (Hasil Gabungan): " + kataKetiga);
    }
}