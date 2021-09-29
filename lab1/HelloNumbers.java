package cs61b.lab1;

public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i < 10; i++) {
            x = i * (i + 1) / 2;
            System.out.print(x + " ");
        }
    }
}