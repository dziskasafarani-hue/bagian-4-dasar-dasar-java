
public class Main7 {
    public static void main(String[] args) {

        // Menggunakan constructor pertama
        Animal7 animal1 = new Animal7();

        // Menggunakan constructor kedua
        Animal7 animal2 = new Animal7(70, 5, 10);

        // Menampilkan kecepatan kedua objek
        System.out.println("Animal #1 memiliki kecepatan "
                + animal1.getSpeed() + ".");

        System.out.println("Animal #2 memiliki kecepatan "
                + animal2.getSpeed() + ".");
    }
}

