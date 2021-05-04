import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        if(( k % m == 0 || k % n == 0) && n * m > k ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}