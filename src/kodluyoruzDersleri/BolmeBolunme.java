package kodluyoruzDersleri;

import java.util.Scanner;

public class BolmeBolunme {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir say� giriniz. ");
		int sayi=scan.nextInt();
		float ortalama=0.0f;
		int a=0;
		for(int i=0;i<=sayi;i++) {
			if(i%3==0&&i%4==0) {
				ortalama+=i;
				a++;
			}
		}
		System.out.println("��e ve d�rde b�l�nebilen say�lar�n ortalamas�: "+ortalama/a);
		
	}

}
