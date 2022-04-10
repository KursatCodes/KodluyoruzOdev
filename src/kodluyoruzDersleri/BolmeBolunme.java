package kodluyoruzDersleri;

import java.util.Scanner;

public class BolmeBolunme {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayý giriniz. ");
		int sayi=scan.nextInt();
		float ortalama=0.0f;
		int a=0;
		for(int i=0;i<=sayi;i++) {
			if(i%3==0&&i%4==0) {
				ortalama+=i;
				a++;
			}
		}
		System.out.println("Üçe ve dörde bölünebilen sayýlarýn ortalamasý: "+ortalama/a);
		
	}

}
