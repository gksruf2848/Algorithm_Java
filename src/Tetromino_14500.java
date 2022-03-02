import java.io.*;
import java.util.StringTokenizer;

public class Tetromino_14500 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //세로 크기
        int M = Integer.parseInt(st.nextToken()); //가로 크기

        int[][] nums = new int[N][M];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                nums[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int imsi = 0;
        int max = 0;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M-3; j++) {
                imsi = nums[i][j] + nums[i][j+1] + nums[i][j+2] + nums[i][j+3];
                if(max < imsi)
                    max = imsi;
            }
        }

        for(int i = 0; i < N-1; i++) {
            for(int j = 0; j < M-2; j++) {
                imsi = nums[i][j] + nums[i][j+1] + nums[i][j+2] + nums[i+1][j];
                if(max < imsi)
                    max = imsi;
                imsi = nums[i][j] + nums[i][j+1] + nums[i][j+2] + nums[i+1][j+1];
                if(max < imsi)
                    max = imsi;
                imsi = nums[i][j] + nums[i][j+1] + nums[i][j+2] + nums[i+1][j+2];
                if(max < imsi)
                    max = imsi;

                imsi = nums[i+1][j] + nums[i+1][j+1] + nums[i+1][j+2] + nums[i][j];
                if(max < imsi)
                    max = imsi;
                imsi = nums[i+1][j] + nums[i+1][j+1] + nums[i+1][j+2] + nums[i][j+1];
                if(max < imsi)
                    max = imsi;
                imsi = nums[i+1][j] + nums[i+1][j+1] + nums[i+1][j+2] + nums[i][j+2];
                if(max < imsi)
                    max = imsi;

                imsi = nums[i][j] + nums[i][j+1] + nums[i+1][j+1] + nums[i+1][j+2];
                if(max < imsi)
                    max = imsi;
                imsi = nums[i][j+1] + nums[i][j+2] + nums[i+1][j] + nums[i+1][j+1];
                if(max < imsi)
                    max = imsi;
            }
        }

        for(int i = 0; i < N-2; i++) {
            for(int j = 0; j < M-1; j++) {
                imsi = nums[i][j] + nums[i][j+1] + nums[i+1][j] + nums[i+2][j];
                if(max < imsi)
                    max = imsi;
                imsi = nums[i][j] + nums[i][j+1] + nums[i+1][j+1] + nums[i+2][j+1];
                if(max < imsi)
                    max = imsi;

                imsi = nums[i][j] + nums[i+1][j] + nums[i+1][j+1] + nums[i+2][j];
                if(max < imsi)
                    max = imsi;
                imsi = nums[i][j+1] + nums[i+1][j] + nums[i+1][j+1] + nums[i+2][j+1];
                if(max < imsi)
                    max = imsi;

                imsi = nums[i][j] + nums[i+1][j] + nums[i+1][j+1] + nums[i+2][j+1];
                if(max < imsi)
                    max = imsi;
                imsi = nums[i][j+1] + nums[i+1][j] + nums[i+1][j+1] + nums[i+2][j];
                if(max < imsi)
                    max = imsi;

                imsi = nums[i][j] + nums[i+1][j] + nums[i+2][j] + nums[i+2][j+1];
                if(max < imsi)
                    max = imsi;
                imsi = nums[i][j+1] + nums[i+1][j+1] + nums[i+2][j] + nums[i+2][j+1];
                if(max < imsi)
                    max = imsi;
            }
        }

        for(int i = 0; i < N-1; i++) {
            for(int j = 0; j < M-1; j++) {
                imsi = nums[i][j] + nums[i][j+1] + nums[i+1][j] + nums[i+1][j+1];
                if(max < imsi)
                    max = imsi;
            }
        }

        for(int i = 0; i < N-3; i++) {
            for(int j = 0; j < M; j++) {
                imsi = nums[i][j] + nums[i+1][j] + nums[i+2][j] + nums[i+3][j];
                if(max < imsi)
                    max = imsi;
            }
        }
        System.out.println(max);
    }
}