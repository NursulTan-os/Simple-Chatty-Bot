import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long n = 0;
        long fac = 0;
        long k ;
        while (fac < m || fac == m) {
            n++;
            fac = n;
            k = n;
            while(k != 1) {
                k--;
                fac *= k;
            }
        }
        System.out.println(n);
    }
}