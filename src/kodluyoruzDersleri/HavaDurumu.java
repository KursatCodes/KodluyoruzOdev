package kodluyoruzDersleri;

import java.util.Scanner;

public class HavaDurumu {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
		System.out.print("Havanýn kaç derece olduðunu giriniz: ");
		int havaDurumu=scan.nextInt();
		if(havaDurumu<5)System.out.println("Kayak yapmaya gidebilirsiniz.");
		else if(havaDurumu>=5&&havaDurumu<15)System.out.println("Sinemaya gidebilirsiniz.");
		else if(havaDurumu>=15&&havaDurumu<25)System.out.println("Pikniðe gidebilirsiniz.");
		else System.out.println("Yüzmeye gidebilirsiniz.");
	}}

}
