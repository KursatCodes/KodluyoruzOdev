package kodluyoruzDersleri;

import java.util.Scanner;

public class TaksimetreProgrami {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		while(true) {
		int km=0,baslangic=10;
		float toplamUcret=20,ucret=0;
		System.out.print("G�zergah�n uzunlu�unu belirtiniz: ");
		km=scan.nextInt();
		ucret=(float)(km*2.2);
		if(km<5&&km>0) {
			System.out.println("�cret: "+toplamUcret+" TL");
		}
		else if(km>=5) {
			toplamUcret=baslangic+ucret;
			System.out.println("�cret: "+toplamUcret+" TL");
		}
		else {
			System.out.println("G�zergah negatif olamaz.");
		}
		}

	}

}
