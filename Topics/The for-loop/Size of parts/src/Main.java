import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] range = new int[sc.nextInt()];
        for (int i = 0; i < range.length; i++) {
            range[i] = sc.nextInt();
        }
        int larger = 0, smaler = 0, perfect = 0;
        for ( int i = 0; i < range.length; i++ ) {
            if (range[i] == 0) {
                perfect++;
            } else if (range[i] == 1) {
                larger++;
            } else if (range[i] == -1){
                smaler++;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaler);
    }
}