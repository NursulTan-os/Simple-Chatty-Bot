import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();
        if(h1 <= h2 ) {
            if (h2 <= h3)
                System.out.println("true");
            else
                System.out.println("false");
        } else if(h2 >= h3) {
            System.out.println("true");
        } else
            System.out.println("false");
    }
}
