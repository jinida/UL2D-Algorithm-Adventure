/*
6147
https://www.acmicpc.net/problem/9407
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        new Main().sol();
    }

    public void sol() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int cnt = Integer.parseInt(br.readLine());
            for (int i = 0; i < cnt; i++) {
                StringBuilder amtStr = new StringBuilder(br.readLine());
                int count = 0;
                while (!amtStr.toString().equals("6174")) {
                    Integer[] nums = new Integer[4];
                    Integer[] nums2;
                    nums[0] = Integer.parseInt(String.valueOf(amtStr.charAt(0)));
                    nums[1] = Integer.parseInt(String.valueOf(amtStr.charAt(1)));
                    nums[2] = Integer.parseInt(String.valueOf(amtStr.charAt(2)));
                    nums[3] = Integer.parseInt(String.valueOf(amtStr.charAt(3)));
                    nums2 = nums.clone();
                    Arrays.sort(nums2, Collections.reverseOrder());
                    Arrays.sort(nums);
                    int a = Integer.parseInt(Arrays.toString(nums2).replaceAll("[^0-9]", ""));
                    int b = Integer.parseInt(Arrays.toString(nums).replaceAll("[^0-9]", ""));
                    int num = a - b;
                    amtStr = new StringBuilder(String.valueOf(num));
                    for (int j = 0; j < 4 - amtStr.length(); j++) {
                        amtStr.insert(0, "0");
                    }
                    count++;
                }
                bufferedWriter.write(count + "\n");
            }
            bufferedWriter.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
