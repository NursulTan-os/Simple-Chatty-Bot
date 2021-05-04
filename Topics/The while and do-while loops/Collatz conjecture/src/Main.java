import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), collatz = n;
        while (collatz != 1) {
            System.out.print(collatz + " ");
            collatz = collatz % 2 == 0 ? collatz / 2 : collatz * 3 +1;
        }
        System.out.print(collatz + " ");
    }
}