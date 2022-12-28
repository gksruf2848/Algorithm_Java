import java.io.*;

public class RewardHunter_15953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i = 0; i < T; i++) {
            String[] nums = br.readLine().split(" ");
            int A = Integer.parseInt(nums[0]);
            int B = Integer.parseInt(nums[1]);
            sum = Reward_a(A) + Reward_b(B);
            System.out.println(sum);
        }
    }

    public static int Reward_a(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 5000000;
        else if (n <= 3)
            return 3000000;
        else if (n <= 6)
            return 2000000;
        else if (n <= 10)
            return 500000;
        else if (n <= 15)
            return 300000;
        else if (n <= 21)
            return 100000;
        return 0;
    }

    public static int Reward_b(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 5120000;
        else if (n <= 3)
            return 2560000;
        else if (n <= 7)
            return 1280000;
        else if (n <= 15)
            return 640000;
        else if (n <= 31)
            return 320000;
        return 0;
    }
}