import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sides = new int[3];
        for (int i = 0; i < 3; i++) {
            sides[i] = sc.nextInt();
        }
        if(sides[0] + sides[1] > sides[2])
            if(sides[0] + sides[2] > sides[1])
                if(sides[2] + sides[1] > sides[0])
                    System.out.println("YES");
                else System.out.println("NO");
            else System.out.println("NO");
        else System.out.println("NO");
    }
}