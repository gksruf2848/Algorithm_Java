import java.io.*;
import java.util.Scanner;

public class WriteNumbers_1748 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int length = (int)Math.log10(N)+1;

        if (length == 1)
            System.out.println(N);
        else if (length == 2)
            System.out.println(9 + 2*(N-9));
        else if (length == 3)
            System.out.println(9 + 2*90 + 3*(N-99));
        else if (length == 4)
            System.out.println(9 + 2*90 + 3*900 + 4*(N-999));
        else if (length == 5)
            System.out.println(9 + 2*90 + 3*900 + 4*9000 + 5*(N-9999));
        else if (length == 6)
            System.out.println(9 + 2*90 + 3*900 + 4*9000 + 5*90000 + 6*(N-99999));
        else if (length == 7)
            System.out.println(9 + 2*90 + 3*900 + 4*9000 + 5*90000 + 6*900000 + 7*(N-999999));
        else if (length == 8)
            System.out.println(9 + 2*90 + 3*900 + 4*9000 + 5*90000 + 6*900000 + 7*9000000 + 8*(N-9999999));
        else if (length == 9)
            System.out.println(9 + 2*90 + 3*900 + 4*9000 + 5*90000 + 6*900000 + 7*9000000 + 8*90000000 + 9*(N-99999999));
    }
}
