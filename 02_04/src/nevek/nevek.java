package nevek;

import java.util.Scanner;

public class nevek {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;

		do {
			System.out.println("Enter a number between 1 and 10");
			while (!input.hasNextInt()) {
				System.out.println("That's not a number");
				input.next();
			}
			n = input.nextInt();
		} while (n < 1 || n > 10);

		System.out.println("kerem a neveket:");
		String[] nevek = new String[n];
		for (int i = 0; i < nevek.length; i++) {
			nevek[i] = input.next();
		}
		input.close();

		for (int i = 0; i < nevek.length; i++) {
			System.out.println(nevek[i]);
		}
		int db=0;
		for(int i =0; i< nevek.length; i++) {
			for (int j = i+1; j < nevek.length; j++) {
				if(nevek[i].equals(nevek[j])) {
					System.out.println("Azonos: "+ nevek[i]+ " "+nevek[j]);
					db++;
				}
			}
		}
		System.out.println(db+" darab azonos nevu van");
		
		
		int db2=0;
		for(int i =0; i< nevek.length; i++) {
			for (int j = i+1; j < nevek.length; j++) {
				if(nevek[i].charAt(0)==nevek[j].charAt(0)) {
					System.out.println("Azonos kezdobetusek: "+ nevek[i]+ " "+nevek[j]);
					db2++;
				}
			}
		}
		System.out.println(db2+" darab azonos kezdobetus van");
	}
}
