package kodluyoruzDersleri;

import java.util.Scanner;

public class ManavKasaProgrami {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double fiyat=0,kilo;
		System.out.println("Manavýmýza hoþgeldiniz.");
		System.out.print("Armut kaç kilo? ");
		kilo=scan.nextDouble();
		fiyat+=kilo*2.14;
		System.out.print("Domates kaç kilo? ");
		kilo=scan.nextDouble();
		fiyat+=kilo*1.11;
		System.out.print("Elma kaç kilo? ");
		kilo=scan.nextDouble();
		fiyat+=kilo*3.67;
		System.out.print("Muz kaç kilo? ");
		kilo=scan.nextDouble();
		fiyat+=kilo*0.95;
		System.out.print("Patlýcan kaç kilo? ");
		kilo=scan.nextDouble();
		fiyat+=kilo*5;
		
		System.out.println("Toplam fiyat: "+fiyat);
		System.out.print("Yine bekleriz.");
	}

}
