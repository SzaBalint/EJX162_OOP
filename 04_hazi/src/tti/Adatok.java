package tti;

public class Adatok {
	public static void main(String[] args) {
		Szemely szem = new Szemely();
		szem.setNev("J�nos");
		szem.setSuly(70);
		szem.setMagassag(1.8);
		szem.Testtomegindex(szem.getSuly(), szem.getMagassag());

		System.out.println(szem.toString());

	}
}
