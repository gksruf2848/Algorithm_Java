import java.io.*;
import java.util.Arrays;

public class Sorting_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nums);

        for(int i = 0; i < N; i++) {
            System.out.println(nums[i]);
        }
    }
}