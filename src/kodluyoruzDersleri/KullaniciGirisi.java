package kodluyoruzDersleri;

import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Kullýný adýnýzý giriniz: ");
		String userName=scan.nextLine();
		System.out.print("Parolanýzý giriniz: ");
		String password=scan.nextLine();
		String pass="1234",userN="java123";
		if(userName.equals(userN)&&password.equals(pass)) {
			System.out.println("Baþarýlý giriþ yapýldý.");
		}//if(!(userName.equals(userN))||!(password.equals(pass))) 
		else {
			System.out.print("Hatalý giriþ yapýldý yeni þifre tanýmlayýnýz: ");
		}
		boolean a=true;
		while(a) {
			password=scan.next();
			if(password.equals(pass)) {
				System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");
			}
			else {
				System.out.println("Þifre oluþturuldu.");
				a=false;
			}
		}
	}

}
