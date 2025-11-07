

package practice;
import java.util.Scanner;

public class Reverse_a_number {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the value of n : ");
	int n = sc.nextInt();
	int rev = 0;
	while(n>0) {
		int digits = n % 10;
		rev = rev * 10 + digits;
		n = n / 10;
	}
	System.out.println(rev);
}
}





