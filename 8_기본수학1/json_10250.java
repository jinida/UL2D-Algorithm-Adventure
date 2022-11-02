/*
ACM 호텔
https://www.acmicpc.net/problem/10250
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
                String[] nums = br.readLine().split(" ");
                int height = Integer.parseInt(nums[0]);
                int pCnt = Integer.parseInt(nums[2]);
                String roomNum = "";
                if (pCnt % height == 0) {
                    roomNum += height;
                } else {
                    roomNum += (pCnt % height);
                }
                String name = String.valueOf((int)Math.ceil((double) pCnt / height));
                roomNum += name.length() == 1 ? "0" + name : name;
                bufferedWriter.write(roomNum + "\n");
            }
            bufferedWriter.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}