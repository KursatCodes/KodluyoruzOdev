package kodluyoruzDersleri;

import java.util.Scanner;

public class Burclar {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Doðum tarihinizi gün ve ay olarak giriniz.");
		int gun=scan.nextInt();
		int ay=scan.nextInt();
		if(ay==1) {
			if(gun>22)System.out.println("Kova");
			else System.out.println("Oðlak");
		}
		if(ay==2) {
			if(gun>22)System.out.println("Balýk");
			else System.out.println("Kova");
		}
		if(ay==3) {
			if(gun>22)System.out.println("Koç");
			else System.out.println("Balýk");
		}
		if(ay==4) {
			if(gun>22)System.out.println("Boða");
			else System.out.println("Koç");
		}
		if(ay==5) {
			if(gun>22)System.out.println("Ýkizler");
			else System.out.println("Boða");
		}
		if(ay==6) {
			if(gun>22)System.out.println("Yengeç");
			else System.out.println("Ýkizler");
		}
		if(ay==7) {
			if(gun>22)System.out.println("Aslan");
			else System.out.println("Yengeç");
		}
		if(ay==8) {
			if(gun>22)System.out.println("Baþak");
			else System.out.println("Aslan");
		}
		if(ay==8) {
			if(gun>22)System.out.println("Terazi");
			else System.out.println("Baþak");
		}
		if(ay==10) {
			if(gun>22)System.out.println("Akrep");
			else System.out.println("Terazi");
		}
		if(ay==11) {
			if(gun>22)System.out.println("Yay");
			else System.out.println("Akrep");
		}
		if(ay==12) {
			if(gun>22)System.out.println("Oðlak");
			else System.out.println("Yay");
		}
	}
}
