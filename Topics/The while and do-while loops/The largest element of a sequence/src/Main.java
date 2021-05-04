import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int number = -1;
        do {
            number = sc.nextInt();
            max = number > max ? number : max;
        } while (number != 0);
        System.out.println(max);
    }
}