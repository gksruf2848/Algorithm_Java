import java.io.*;
import java.util.Arrays;

public class Divisor_1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        int[] nums = new int[N];
        for(int i=0;i<numbers.length;i++){
            nums[i] = Integer.parseInt(numbers[i]);
        }

        Arrays.sort(nums);
        int answer = nums[0] * nums[N-1];
        System.out.println(answer);
    }
}