import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] range = { sc.nextInt(), sc.nextInt() };
        double avrg = 0, count = 0;
        for( int i = range[0]; i <= range[1]; i++) {
            if( i % 3 == 0) {
                avrg += i;
                count++;
                //System.out.println(i);
            }
        }
        System.out.println(avrg/count);
    }
}