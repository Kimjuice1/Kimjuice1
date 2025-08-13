import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String check1 = "dz=";
        String[] check2 = {"c=", "c-", "d-", "lj", "nj", "s=", "z="};
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int count = 0;
        for(int i = 0; i < text.length() - 1;)
        {
            // dz= 맞았을 때
            if(i < text.length() - 2 && check1.equals(text.substring(i, i + 3)))
            {
                count += 2;
                i += 3;
            }
            // 2개 길이의 크로아티아 언어가 맞았을 때
            else
            {
                boolean match = false;
                String now = text.substring(i, i + 2);
                for(int j = 0 ; j < check2.length; j++)
                {
                    if(check2[j].equals(now))
                    {
                        count += 1;
                        i += 2;
                        match = true;
                        break;
                    }
                }
                // 그냥 문자일 때
                if(!match)
                {
                    i++;
                }
            }
        }
        System.out.println(text.length() - count);
    }
}
