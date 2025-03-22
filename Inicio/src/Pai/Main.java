package Pai;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int mat[][] = new int[n][n];
		mat[0][1] = sc.nextInt();
		System.out.println("Olá mundo");
		sc.close();
	}

}
