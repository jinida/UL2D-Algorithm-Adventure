/*
골드바흐의 추측
https://www.acmicpc.net/problem/9020
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
            int testCnt = Integer.parseInt(br.readLine());
            for (int t = 0; t < testCnt; t++) {
                int num = Integer.parseInt(br.readLine());
                boolean[] primes = new boolean[num + 1];
                primes[0] = primes[1] = true;
                for (int i = 2; i * i <= num; i++) {
                    if (!primes[i]) {
                        for (int j = i * i; j <= num; j += i) {
                            primes[j] = true;
                        }
                    }
                }
                for (int i = num / 2; i <= num; i++) {
                    if (!primes[i] && !primes[num - i]) {
                        bufferedWriter.write(num - i + " " + i + "\n");
                        break;
                    }
                }
            }
            bufferedWriter.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
