package kodluyoruzDersleri;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Birinci sayýyý giriniz: ");
		int sayi1=scan.nextInt();
		System.out.print("Ýkinci sayýyý giriniz: ");
		int sayi2=scan.nextInt();
		System.out.println("Yapmak istediðiniz iþlem nedir? \n1-Toplama\n2-Çýkartma\n3-Çarpma\n4-Bölme");
		int islem=scan.nextInt();
		switch (islem) {
		case 1:
			System.out.println("Toplama iþleminin sonucu: "+(sayi1+sayi2));
			break;
		case 2:
			System.out.println("Çýkartma iþleminin sonucu: "+(sayi1-sayi2));
			break;

		case 3:
			System.out.println("Çarpma iþleminin sonucu: "+(sayi1*sayi2));
			break;

		case 4:
			if(sayi2!=0) System.out.println("Bölme iþleminin sonucu: "+(sayi1/sayi2));
			else System.out.println("Bölen sayý sýfýr olamaz.");
			break;
		default:
			break;
		}

	}

}
