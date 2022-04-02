package kodluyoruzDersleri;

import java.util.Scanner;

public class HipotenusHesapla {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=0,b=0,c=0;
		double u,alan;
		System.out.println("Birinci kenar uzunluðu: ");
		a=scan.nextInt();
		System.out.println("Ýkinci kenar uzunluðu: ");
		b=scan.nextInt();
		System.out.println("Üçüncü kenar uzunluðu: ");
		c=scan.nextInt();
		u=(a+b+c)/2;
		alan=u*(u-a)*(u-b)*(u-c);
		alan=Math.sqrt(alan);
		System.out.println("Alan: "+alan);
	}

}
