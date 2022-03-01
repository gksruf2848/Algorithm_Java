import java.io.*;

public class CandyGame_3085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] candies = new char[N][N];
        //2차원 배열로 입력 받음
        for(int i = 0; i < N; i++) {
            candies[i] = br.readLine().toCharArray();
        }

        int cnt = 1;
        int max = 0;
        //가로로 바꿔 탐색
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N - 1; j++) {
                char tmp = 0;
                tmp = candies[i][j];
                candies[i][j] = candies[i][j+1];
                candies[i][j+1] = tmp;

                //가로로 최대값 탐색
                for(int k = 0; k < N; k++) {
                    cnt = 1;
                    for(int l = 0; l < N - 1; l++) {
                        if (candies[k][l] == candies [k][l+1])
                            cnt++;
                        else cnt = 1;
                        if (cnt > max)
                            max = cnt;
                    }
                }

                //세로로 최대값 탐색
                for(int k = 0; k < N; k++) {
                    cnt = 1;
                    for(int l = 0; l < N - 1; l++) {
                        if (candies[l][k] == candies [l+1][k])
                            cnt++;
                        else cnt = 1;
                        if (cnt > max)
                            max = cnt;
                    }
                }

                //원상복구
                tmp = candies[i][j];
                candies[i][j] = candies[i][j+1];
                candies[i][j+1] = tmp;
            }
        }

        //세로로 바꿔 탐색
        for(int i = 0; i < N - 1; i++) {
            for(int j = 0; j < N; j++) {
                char tmp = 0;
                tmp = candies[i][j];
                candies[i][j] = candies[i+1][j];
                candies[i+1][j] = tmp;

                //가로로 최대값 탐색
                for(int k = 0; k < N; k++) {
                    cnt = 1;
                    for(int l = 0; l < N - 1; l++) {
                        if (candies[k][l] == candies [k][l+1])
                            cnt++;
                        else cnt = 1;
                        if (cnt > max)
                            max = cnt;
                    }
                }
                //세로로 최대값 탐색
                for(int k = 0; k < N; k++) {
                    cnt = 1;
                    for(int l = 0; l < N - 1; l++) {
                        if (candies[l][k] == candies [l+1][k])
                            cnt++;
                        else cnt = 1;
                        if (cnt > max)
                            max = cnt;
                    }
                }
                //원상복구
                tmp = candies[i][j];
                candies[i][j] = candies[i+1][j];
                candies[i+1][j] = tmp;
            }
        }
        System.out.println(max);
    }
}
