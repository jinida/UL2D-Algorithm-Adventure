/*
베르트랑 공준
https://www.acmicpc.net/problem/4948
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
            while (true) {
                int num = Integer.parseInt(br.readLine());
                if (num == 0) {
                    break;
                }
                boolean[] primes = new boolean[2 * num + 1];
                int cnt = 0;
                primes[0] = primes[1] = true;
                for (int i = 2; i * i <= 2 * num; i++) {
                    if (!primes[i]) {
                        for (int j = i * i; j <= 2 * num; j += i) {
                            primes[j] = true;
                        }
                    }
                }
                for (int i = num + 1; i < primes.length; i++) {
                    if (!primes[i]) cnt++;
                }
                bufferedWriter.write(cnt + "\n");
            }
            bufferedWriter.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
