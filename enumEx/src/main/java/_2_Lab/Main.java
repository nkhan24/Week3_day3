package _2_Lab;

public class Main {
    public static void main(String[] args) {


        Pair<String, Integer> pair1 = new Pair<>("Hello", 10);
        Pair<Integer, String> pair2 = new Pair<>(20, "Welcome");
        Pair<String, String> pair3 = new Pair<>("Hi", "Bye");

        System.out.println("Pair 1 contains: " + pair1);
        System.out.println("Pair 2 contains: " + pair2);
        System.out.println("Pair 2 contains: "+ pair3);

        System.out.println("Specifically for pair 1: " + pair1.getK());
        System.out.println("And also for pair 1: " +pair1.getV());
        System.out.println("Specifically for pair 2: " + pair2.getK());
        System.out.println("And also for pair 2: " +pair2.getV());
        System.out.println("Specifically for pair 3: " + pair3.getK());
        System.out.println("And also for pair 3: " +pair3.getV());

    }
}
