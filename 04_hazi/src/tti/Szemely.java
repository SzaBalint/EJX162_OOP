package tti;

public class Szemely {
	private String nev;
	private int suly;
	private double magassag;
	private double tti;

	public void Testtomegindex(int s, double m) {
		tti = (double) s / (m * m);
	}

	public String Alkat() {
		if (tti < 18.5) {
			return "sovany";
		} else if (tti > 25) {
			return "kover";
		} else
			return "normal";
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public int getSuly() {
		return suly;
	}

	public void setSuly(int suly) {
		this.suly = suly;
	}

	public double getMagassag() {
		return magassag;
	}

	public void setMagassag(double magassag) {
		this.magassag = magassag;
	}

	public double getTti() {
		return tti;
	}

	public void setTti(double tti) {
		this.tti = tti;
	}

	@Override
	public String toString() {
		return "nev:" + nev + ", suly:" + suly + ", magassag:" + magassag + ", tti:" + tti + " alkat: " + Alkat();
	}

}
