import java.util.Scanner;

public class Password {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input password");
		String str1=sc.nextLine();
		System.out.println("confirm password");
		String str2=sc.nextLine();
		if(str1.equals(str2)) {
			System.out.println("password is Same");
		}else {
			System.out.println("password is different");
		}
	}

}
