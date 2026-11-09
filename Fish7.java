public class Fish7 {
    String name;
    String typeOfFish;
    int friendliness;

    public Fish7() {
        name = "Unknown";
        typeOfFish = "Unknown";
        friendliness = 3;
    }

     public Fish7(String t, int f) {
        name = "Unknown";
        typeOfFish = t;
        friendliness = f;
    }

    public Fish7(String n, String t, int f) {
        name = n;
        typeOfFish = t;
        friendliness = f;
    }

    public int getFriendliness() {
        return friendliness;
    }
}
