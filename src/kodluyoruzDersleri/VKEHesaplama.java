package kodluyoruzDersleri;

import java.util.Scanner;

public class VKEHesaplama {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Boyunuzu metre cinsinden belirtiniz: ");
		double boy=scan.nextDouble();
		System.out.print("Kilonuzu kg cinsinden belirtiniz: ");
		double kilo=scan.nextDouble();
		double vke=kilo/(boy*boy);
		System.out.println("Vücut kitle endeksiniz: "+vke);

	}

}
