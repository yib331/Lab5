import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter something");
		Scanner console = new Scanner(System.in);
		while(console.hasNext()) {
			String str = console.nextLine();
			Palindrome pl = new Palindrome();
			pl.isaPalindrome(str);
			if(pl.isaPalindrome(str) == true) {
				System.out.println("is a palindrome");
			}
			else {
				System.out.println("not a palindrome");
			}
		}
	
	}
	public boolean isaPalindrome(String str) {
		boolean flag = false;
		if(str.length()< 2) {
			flag =  true;
		}
		else if(str.charAt(0) == str.charAt(str.length() - 1)) {
			flag =  true;
		}
		else 
			isaPalindrome(str.substring(1, str.length()-2));
		return flag;
		
	}

}
