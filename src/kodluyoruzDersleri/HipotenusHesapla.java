package kodluyoruzDersleri;

import java.util.Scanner;

public class HipotenusHesapla {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=0,b=0,c=0;
		double u,alan;
		System.out.println("Birinci kenar uzunlu�u: ");
		a=scan.nextInt();
		System.out.println("�kinci kenar uzunlu�u: ");
		b=scan.nextInt();
		System.out.println("���nc� kenar uzunlu�u: ");
		c=scan.nextInt();
		u=(a+b+c)/2;
		alan=u*(u-a)*(u-b)*(u-c);
		alan=Math.sqrt(alan);
		System.out.println("Alan: "+alan);
	}

}
