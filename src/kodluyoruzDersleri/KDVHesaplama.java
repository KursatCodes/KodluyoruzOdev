package kodluyoruzDersleri;

import java.util.Scanner;

public class KDVHesaplama {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		float fiyat=0.0f,kdv=0f,sonFiyat=0.0f;
		System.out.println("Fiyatý belirleyiniz: ");
		fiyat=scan.nextFloat();
		if(fiyat<1000&&fiyat>0) {
			kdv=(float)(fiyat*0.18);
			sonFiyat=fiyat+kdv;
			System.out.println("KDV: "+kdv+" TL");
			System.out.println("Toplam fiyat: "+sonFiyat+" TL");
		}
		else if(fiyat>=1000) {
			kdv=(float)(fiyat*0.08);
			sonFiyat=fiyat+kdv;
			System.out.println("KDV: "+kdv+" TL");
			System.out.println("Toplam fiyat: "+sonFiyat+" TL");
		}
		else {
			System.out.println("Fiyat 0-1000 TL arasýnda olmalýdýr.");
		}
		
	}

}
