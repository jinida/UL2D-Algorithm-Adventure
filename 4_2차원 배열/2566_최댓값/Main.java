import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		int [][] arrA = new int[x][y];
		int [][] arrB = new int[x][y];
		int [][] arrC = new int[x][y];
		
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				arrA[i][j] = scanner.nextInt();
			}
		}
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				arrB[i][j] = scanner.nextInt();
				arrC[i][j] = arrA[i][j]+arrB[i][j];
			}
		}
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				System.out.print(arrC[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
