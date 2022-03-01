import java.io.*;
import java.util.Scanner;

public class One_4375 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = 0;

        while(sc.hasNext())
        {
            n = sc.nextInt();
            int one = 0;

            for(int i=0;i<n;i++) {
                one = one * 10 + 1;
                one %= n;
                if (one == 0)
                {
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}

/*
10 + 1 -> (1 * 10 + 1) -> ((1 % n) * 10 + 1) % n
110 + 1 -> (11 * 10 + 1) -> ((11 % n) * 10 + 1) % n
1110 + 1 -> (111 * 10 + 1)
11110 + 1 -> (1111 * 10 + 1)
*/
