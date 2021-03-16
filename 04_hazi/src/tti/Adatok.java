package tti;

import java.util.Scanner;

public class Adatok {
	public static void main(String[] args) {
		Szemely szem = new Szemely();
		/*szem.setNev("János");
		szem.setSuly(70);
		szem.setMagassag(1.8);*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Adjon meg egy nevet: ");
		String nev = sc.nextLine();
		System.out.println("Adjon meg egy testtomeget(kg-ban egeszre kerekitve): ");
		int suly = sc.nextInt();
		System.out.println("Adjon meg egy magassagot(meterben): ");
		double magassag = sc.nextDouble();
		sc.close();
		
		
		szem.setNev(nev);
		szem.setSuly(suly);
		szem.setMagassag(magassag);
		
		szem.Testtomegindex(suly,magassag);
		
		System.out.println(szem.toString()+", alkat: "+szem.Alkat());
	}
}
