import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] range = {sc.nextInt(), sc.nextInt() };
        long prod = 1;
        for(long i = range[0]; i < range[1]; i++) {
            prod *= i;
        }
        System.out.println(prod);
    }
}