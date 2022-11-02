/*
부녀회장이 될테야
https://www.acmicpc.net/problem/2775
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        new Main().sol();
    }

    public void sol() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int cnt = Integer.parseInt(br.readLine());
            // 테스트 케이스 반복
            for (int i = 0; i < cnt; i++) {
                int floor = Integer.parseInt(br.readLine());
                int roomNum = Integer.parseInt(br.readLine());
                int[] downFloor = new int[roomNum];
                int[] curFloor = new int[roomNum];
                // 층별 반복 (입력받은 층 포함)
                for (int k = 0; k <= floor; k++) {
                    if (k != 0) {
                        downFloor = curFloor.clone();
                    }
                    // 현재층의 호수만큼 반복
                    for (int j = 1; j <= roomNum; j++) {
                        if (k == 0) {
                            downFloor[j - 1] = j;
                            curFloor = downFloor.clone();
                        } else {
                            int sum = 0;
                            // 아래층의 호수만큼 반복
                            for (int l = 1; l <= j; l++) {
                                sum += downFloor[l - 1];
                            }
                            curFloor[j - 1] = sum;
                        }
                    }
                }
                bufferedWriter.write(curFloor[roomNum - 1] + "\n");
            }
            bufferedWriter.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}