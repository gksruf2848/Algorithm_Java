import java.io.*;

public class Build_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int weight[] = new int[N];
        int height[] = new int[N];

        //입력 받는 부분
        for(int i = 0; i < N; i++) {
            String tmp[] = br.readLine().split(" ");
            weight[i] = Integer.parseInt(tmp[0]);
            height[i] = Integer.parseInt(tmp[1]);
        }

        for(int i = 0; i < N; i++) {
            int score = 1;
            for(int j = 0; j < N; j++) {
                if (weight[i] < weight[j] && height[i] < height[j])
                    score++;
            }
            System.out.println(score);
        }
    }
}
