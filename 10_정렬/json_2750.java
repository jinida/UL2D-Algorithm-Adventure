/*
수 정렬하기
https://www.acmicpc.net/problem/2750
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        new Main().sol();
    }

    public void sol() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int testCnt = Integer.parseInt(br.readLine());
            ArrayList<Integer> nums = new ArrayList<>();
            for (int i = 0; i < testCnt; i++) {
                nums.add(Integer.parseInt(br.readLine()));
            }
            nums.sort(Comparator.naturalOrder());
            for (int num : nums) {
                bufferedWriter.write(num + "\n");
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}