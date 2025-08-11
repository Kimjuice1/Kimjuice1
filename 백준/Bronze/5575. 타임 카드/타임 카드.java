import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++)
        {
            int sh = sc.nextInt(); // 시작 시
            int sm = sc.nextInt(); // 시작 분
            int ss = sc.nextInt(); // 시작 초
            int eh = sc.nextInt(); // 끝 시
            int em = sc.nextInt(); // 끝 분
            int es = sc.nextInt(); // 끝 초

            if(ss > es)
            {
                es +=60;
                em--;
            }
            es -= ss;

            if(sm > em)
            {
                em +=60;
                eh--;
            }
            em -= sm;

            eh -= sh;

            System.out.println(eh + " " + em + " " + es);
        }
    }
}