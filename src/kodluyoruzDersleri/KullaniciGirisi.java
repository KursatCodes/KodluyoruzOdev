package kodluyoruzDersleri;

import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Kull�n� ad�n�z� giriniz: ");
		String userName=scan.nextLine();
		System.out.print("Parolan�z� giriniz: ");
		String password=scan.nextLine();
		String pass="1234",userN="java123";
		if(userName.equals(userN)&&password.equals(pass)) {
			System.out.println("Ba�ar�l� giri� yap�ld�.");
		}//if(!(userName.equals(userN))||!(password.equals(pass))) 
		else {
			System.out.print("Hatal� giri� yap�ld� yeni �ifre tan�mlay�n�z: ");
		}
		boolean a=true;
		while(a) {
			password=scan.next();
			if(password.equals(pass)) {
				System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
			}
			else {
				System.out.println("�ifre olu�turuldu.");
				a=false;
			}
		}
	}

}
