package kodluyoruzDersleri;

import java.util.Scanner;

public class Siralama {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
		
		System.out.print("Birinci sayýyý giriniz:");
		int sayi1=scan.nextInt();
		System.out.print("Ýkinci sayýyý giriniz:");
		int sayi2=scan.nextInt();
		System.out.print("Üçüncü sayýyý giriniz:");
		int sayi3=scan.nextInt();
		if(sayi1>sayi2&&sayi1>sayi3) {
			if(sayi2>sayi3) {
				System.out.println("Sayýlar büyükten küçüðe: "+sayi1+", "+sayi2+", "+sayi3);
			}
			else System.out.println("Sayýlar büyükten küçüðe: "+sayi1+", "+sayi3+", "+sayi2);
		}
		if(sayi2>sayi1&&sayi2>sayi3) {
			if(sayi1>sayi3) {
				System.out.println("Sayýlar büyükten küçüðe: "+sayi2+", "+sayi1+", "+sayi3);
			}
			else System.out.println("Sayýlar büyükten küçüðe: "+sayi2+", "+sayi3+", "+sayi1);
		}
		if(sayi3>sayi1&&sayi3>sayi2) {
			if(sayi1>sayi2) {
				System.out.println("Sayýlar büyükten küçüðe: "+sayi3+", "+sayi1+", "+sayi2);
			}
			else System.out.println("Sayýlar büyükten küçüðe: "+sayi3+", "+sayi2+", "+sayi1);
		}
		}
	}

}
