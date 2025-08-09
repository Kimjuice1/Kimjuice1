import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int P = sc.nextInt();

        int N = L * P;
        for(int i = 0; i < 5; i++)
        {
            int A = sc.nextInt();
            A = A - N;
            System.out.print(A + " ");
        }
    }
}
