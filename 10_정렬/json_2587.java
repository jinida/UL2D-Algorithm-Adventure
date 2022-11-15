/*
대표값2
https://www.acmicpc.net/problem/2587
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
            int testCnt = 5;
            int sum = 0;
            ArrayList<Integer> nums = new ArrayList<>();
            for (int i = 0; i < testCnt; i++) {
                int num = Integer.parseInt(br.readLine());
                nums.add(num);
                sum += num;
            }
            nums.sort(Comparator.naturalOrder());
            bufferedWriter.write(sum / testCnt + "\n");
            bufferedWriter.write(nums.get(2) + "");
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}