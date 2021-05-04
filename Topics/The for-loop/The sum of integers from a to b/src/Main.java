import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] range = {sc.nextInt(), sc.nextInt()};
        int sum = 0;
        for(int i = range[0]; i <= range[1]; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }
}