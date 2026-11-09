
public class MainFish {

    public static Fish7 nicestFish(Fish7... fishes) {
        Fish7 temp = fishes[0];

        for (int i = 1; i < fishes.length; i++) {
            if (fishes[i].getFriendliness()
                    > temp.getFriendliness()) {
                temp = fishes[i];
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        Fish7 ikan1 = new Fish7("Amber", "AngelFish", 5);
        Fish7 ikan2 = new Fish7("James", "Guppy", 3);
        Fish7 ikan3 = new Fish7("Bubbles", "Goldfish", 4);

        Fish7 ikanTerbaik = nicestFish(ikan1, ikan2, ikan3);

        System.out.println("=== DATA IKAN ===");
        System.out.println(ikan1.name + " - Keramahan: "
                + ikan1.getFriendliness());
        System.out.println(ikan2.name + " - Keramahan: "
                + ikan2.getFriendliness());
        System.out.println(ikan3.name + " - Keramahan: "
                + ikan3.getFriendliness());

        System.out.println();
        System.out.println("Ikan paling ramah: " + ikanTerbaik.name);
        System.out.println("Tingkat keramahan: "
                + ikanTerbaik.getFriendliness());
    }
}
