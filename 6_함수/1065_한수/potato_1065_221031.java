import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 99;
		
		if(n < 100) {
			cnt = n;
		}
		else {
			for(int i=100; i<=n; i++) {
				int n100 = i / 100; 
				int n10 = (i / 10) % 10; 
				int n1 = i % 10;
				
				if((n100 - n10) == (n10 - n1)) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
}