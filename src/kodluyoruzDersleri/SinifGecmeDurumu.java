package kodluyoruzDersleri;

import java.util.Scanner;

public class SinifGecmeDurumu {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int mat,fizik,kimya,turkce,tarih,muzik;
		System.out.println("Matematik notunuzu giriniz: ");
		mat=scan.nextInt();
		System.out.println("Fizik notunuzu giriniz: ");
		fizik=scan.nextInt();
		System.out.println("Kimya notunuzu giriniz: ");
		kimya=scan.nextInt();
		System.out.println("Türkçe notunuzu giriniz: ");
		turkce=scan.nextInt();
		System.out.println("Tarih notunuzu giriniz: ");
		tarih=scan.nextInt();
		System.out.println("Müzik notunuzu giriniz: ");
		muzik=scan.nextInt();
		if(mat<0)mat=0; 
		if(fizik<0)fizik=0;
		if(kimya<0)kimya=0;
		if(turkce<0)turkce=0;
		if(tarih<0)tarih=0;
		if(muzik<0)muzik=0;
		int toplam=mat+fizik+kimya+turkce+tarih+muzik;
		double notOrtalama=toplam/6;
		System.out.println("Not ortalamanýz: "+notOrtalama);
		if(notOrtalama<55)System.out.println("Kaldýnýz.");
		else System.out.println("Geçtiniz.");

	}

}
