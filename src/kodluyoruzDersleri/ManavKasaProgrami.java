package kodluyoruzDersleri;

import java.util.Scanner;

public class ManavKasaProgrami {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double fiyat=0,kilo;
		System.out.println("Manav�m�za ho�geldiniz.");
		System.out.print("Armut ka� kilo? ");
		kilo=scan.nextDouble();
		fiyat+=kilo*2.14;
		System.out.print("Domates ka� kilo? ");
		kilo=scan.nextDouble();
		fiyat+=kilo*1.11;
		System.out.print("Elma ka� kilo? ");
		kilo=scan.nextDouble();
		fiyat+=kilo*3.67;
		System.out.print("Muz ka� kilo? ");
		kilo=scan.nextDouble();
		fiyat+=kilo*0.95;
		System.out.print("Patl�can ka� kilo? ");
		kilo=scan.nextDouble();
		fiyat+=kilo*5;
		
		System.out.println("Toplam fiyat: "+fiyat);
		System.out.print("Yine bekleriz.");
	}

}
