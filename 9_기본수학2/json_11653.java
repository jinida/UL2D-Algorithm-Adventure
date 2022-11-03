/*
소인수분해
https://www.acmicpc.net/problem/11653
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
            int num = Integer.parseInt(br.readLine());
            while (num > 1) {
                for (int i = 2; i <= num; i++) {
                    if (num % i == 0) {
                        bufferedWriter.write(i + "\n");
                        num = num / i;
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
