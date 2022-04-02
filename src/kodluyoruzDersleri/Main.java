package kodluyoruzDersleri;

import java.util.Scanner;

public class Main {

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
		int toplam=mat+fizik+kimya+turkce+tarih+muzik;
		double notOrtalama=toplam/6;
		System.out.println("Ortalamanýz: "+notOrtalama);
		System.out.println((notOrtalama>60)?"Sýnýfý Geçti":"Sýnýfta Kaldý");
		
	}

}
