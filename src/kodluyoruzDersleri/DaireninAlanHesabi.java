package kodluyoruzDersleri;

import java.util.Scanner;

public class DaireninAlanHesabi {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Yar��ap de�erini belirleyiniz: ");
		int r=scan.nextInt();
		System.out.print("A�� de�erini belirleyiniz: ");
		int aci=scan.nextInt();
		double pi=3.14;
		double alan=pi*r*r*aci/360;
		System.out.println("Se�ili b�lgenin alan�: "+alan+" cm");
	}

}
