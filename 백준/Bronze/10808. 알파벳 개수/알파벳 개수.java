import java.util.Scanner;
// 다시보기
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A[] = new int[26];
        char[] temp = sc.next().toCharArray();
        for(int i = 0; i < temp.length; i++)
        {
            A[temp[i] - 97]++;
        }
        for(int i = 0; i < A.length; i++)
        {
            System.out.print(A[i] + " ");
        }
    }
}