/*
소수 구하기
https://www.acmicpc.net/problem/1929
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
            String[] nums = br.readLine().split(" ");
            int min = Integer.parseInt(nums[0]);
            int max = Integer.parseInt(nums[1]);
            boolean[] primes = new boolean[max + 1];
            primes[0] = primes[1] = true;
            for (int i = 2; i * i <= max; i++) {
                if (!primes[i]) {
                    for (int j = i * i; j <= max; j += i) {
                        primes[j] = true;
                    }
                }
            }
            for (int i = min; i < primes.length; i++) {
                if (!primes[i]) bufferedWriter.write(i + "\n");
            }
            bufferedWriter.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
