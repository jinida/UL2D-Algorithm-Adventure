/*
커트라인
https://www.acmicpc.net/problem/25305
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
            String[] input = br.readLine().split(" ");
            int testCnt = Integer.parseInt(input[0]);
            int cutCnt = Integer.parseInt(input[1]);
            ArrayList<Integer> nums = new ArrayList<>();
            String[] numInput = br.readLine().split(" ");
            for (int i = 0; i < testCnt; i++) {
                int num = Integer.parseInt(numInput[i]);
                nums.add(num);
            }
            nums.sort(Comparator.reverseOrder());
            bufferedWriter.write(nums.get(cutCnt - 1) + "");
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
