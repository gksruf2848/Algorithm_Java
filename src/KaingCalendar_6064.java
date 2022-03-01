import java.io.*;

public class KaingCalendar_6064 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //testcase

        for(int i = 0; i < T; i++) {
            String[] nums = br.readLine().split(" ");
            int M = Integer.parseInt(nums[0]);
            int N = Integer.parseInt(nums[1]);
            int x = Integer.parseInt(nums[2]) - 1;
            int y = Integer.parseInt(nums[3]) - 1;
            int err = 0;

            for (int j = x; j < N * M; j += M) {
                if (j % N == y) {
                    System.out.println(j + 1);
                    err = 1;
                    break;
                }
            }
            if (err == 0)
                System.out.println("-1");
        }
    }
}
