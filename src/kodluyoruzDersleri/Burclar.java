package kodluyoruzDersleri;

import java.util.Scanner;

public class Burclar {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Do�um tarihinizi g�n ve ay olarak giriniz.");
		int gun=scan.nextInt();
		int ay=scan.nextInt();
		if(ay==1) {
			if(gun>22)System.out.println("Kova");
			else System.out.println("O�lak");
		}
		if(ay==2) {
			if(gun>22)System.out.println("Bal�k");
			else System.out.println("Kova");
		}
		if(ay==3) {
			if(gun>22)System.out.println("Ko�");
			else System.out.println("Bal�k");
		}
		if(ay==4) {
			if(gun>22)System.out.println("Bo�a");
			else System.out.println("Ko�");
		}
		if(ay==5) {
			if(gun>22)System.out.println("�kizler");
			else System.out.println("Bo�a");
		}
		if(ay==6) {
			if(gun>22)System.out.println("Yenge�");
			else System.out.println("�kizler");
		}
		if(ay==7) {
			if(gun>22)System.out.println("Aslan");
			else System.out.println("Yenge�");
		}
		if(ay==8) {
			if(gun>22)System.out.println("Ba�ak");
			else System.out.println("Aslan");
		}
		if(ay==8) {
			if(gun>22)System.out.println("Terazi");
			else System.out.println("Ba�ak");
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
			if(gun>22)System.out.println("O�lak");
			else System.out.println("Yay");
		}
	}
}
