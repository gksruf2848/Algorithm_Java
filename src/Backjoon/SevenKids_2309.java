import java.io.*;
import java.util.Arrays;

public class SevenKids_2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[9];

        int sum = 0;
        for(int i=0;i<9;i++){
            numbers[i] = Integer.parseInt(br.readLine());
            sum += numbers[i];
        }
        Arrays.sort(numbers);

        int i = 0;
        int j = 0;
        int hundred = 0;
        while(i < 8)
        {
            j = i + 1;
            while(j < 9)
            {
                hundred = sum;
                hundred -= numbers[i] + numbers[j];
                if(hundred == 100)
                    break;
                else
                    j++;
            }
            if(hundred == 100)
                break;
            i++;
        }

        for(int k=0;k<9;k++){
            if(k!=i && k!=j)
                System.out.println(numbers[k]);
        }
    }
}