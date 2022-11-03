/*
소수 찾기
https://www.acmicpc.net/problem/1978
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
            boolean[] primes = new boolean[1001];
            primes[0] = primes[1] = true;
            for (int i = 2; i * i <= 1000; i++) {
                if (!primes[i]) {
                    for (int j = i * i; j <= 1000; j += i) {
                        primes[j] = true;
                    }
                }
            }
            int primeCnt = 0;
            String[] nums = br.readLine().split(" ");
            for (int i = 0; i < cnt; i++) {
                if (!primes[Integer.parseInt(nums[i])]) {
                    primeCnt += 1;
                }
            }
            bufferedWriter.write(primeCnt + "");
            bufferedWriter.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
