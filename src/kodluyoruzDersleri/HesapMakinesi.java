package kodluyoruzDersleri;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Birinci say�y� giriniz: ");
		int sayi1=scan.nextInt();
		System.out.print("�kinci say�y� giriniz: ");
		int sayi2=scan.nextInt();
		System.out.println("Yapmak istedi�iniz i�lem nedir? \n1-Toplama\n2-��kartma\n3-�arpma\n4-B�lme");
		int islem=scan.nextInt();
		switch (islem) {
		case 1:
			System.out.println("Toplama i�leminin sonucu: "+(sayi1+sayi2));
			break;
		case 2:
			System.out.println("��kartma i�leminin sonucu: "+(sayi1-sayi2));
			break;

		case 3:
			System.out.println("�arpma i�leminin sonucu: "+(sayi1*sayi2));
			break;

		case 4:
			if(sayi2!=0) System.out.println("B�lme i�leminin sonucu: "+(sayi1/sayi2));
			else System.out.println("B�len say� s�f�r olamaz.");
			break;
		default:
			break;
		}

	}

}
