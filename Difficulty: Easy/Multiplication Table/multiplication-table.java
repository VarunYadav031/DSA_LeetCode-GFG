import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int multi=n*i;
            System.out.print(multi+" ");
        }

        sc.close();
    }
}