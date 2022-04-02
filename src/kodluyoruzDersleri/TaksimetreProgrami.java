package kodluyoruzDersleri;

import java.util.Scanner;

public class TaksimetreProgrami {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		while(true) {
		int km=0,baslangic=10;
		float toplamUcret=20,ucret=0;
		System.out.print("Güzergahýn uzunluðunu belirtiniz: ");
		km=scan.nextInt();
		ucret=(float)(km*2.2);
		if(km<5&&km>0) {
			System.out.println("Ücret: "+toplamUcret+" TL");
		}
		else if(km>=5) {
			toplamUcret=baslangic+ucret;
			System.out.println("Ücret: "+toplamUcret+" TL");
		}
		else {
			System.out.println("Güzergah negatif olamaz.");
		}
		}

	}

}
