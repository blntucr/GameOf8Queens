import java.util.Scanner;
public class gameofq {



	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k = 0;
		int[][] a = new int[8][8];
		ZeroMultiArray.createArray(a);
		
	while(k < a.length) {
		System.out.print("Enter the position of Queen: ");
		int row = input.nextInt();
		int column = input.nextInt();
		if(a[row][column] == 1) {
			System.out.print("Wrong place!\n");
			continue;
		}
		System.out.print("\n");
		a[row][column] = 0;
		for(int i = 0; i < a.length - 1; i++) {
			if(row - column + i <= 7 && column - row + i <= 7) {
				if(row > column)
					a[row - column + i][column - column + i] = 1;
				else if(column > row)
					a[row - row + i][column - row + i] = 1;
				else {
			a[i][i] = 1;
			a[7][7] = 1;
			}}
			else
				break;
		}
		for(int i = 0; i < a.length; i++) {
			a[row][i] = 1;
			a[i][column] = 1;
		}
		a[row][column] = 2;
		k++;
		
		char[][] b = new char[8][8];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(a[i][j] == 0)
					b[i][j] = ' ';
				else if(a[i][j] == 1)
					b[i][j] = 'X';
				else if(a[i][j] == 2)
					b[i][j] = 'Q';
			}
		}
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(j % 8 == 0)
					System.out.print("\n");
				System.out.printf("|%c|", b[i][j]);
				}
		}System.out.print("\n");
	}		
	
}}
