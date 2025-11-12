

package practice;
import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the value of n : ");
	int n = sc.nextInt();
	int rev = 0;
	int temp = n;
	while(n!=0) {
		int digits = n % 10;
		rev = rev * 10 + digits;
		n = n /10;
	}
	if(rev == temp){
		System.out.println(temp + " is a palindrome");
	}
	else {
		System.out.println(temp + " is not a palindrome");
	}
}
}







