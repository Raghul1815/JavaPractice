package practice;

public class Sum_of_digits {
public static void main(String[] args) {
	int n = 123;
	int sum = 0;
	while(n>0) {
		int digits  = n % 10;
		sum = sum + digits;
		n = n/10;
		
	}
	System.out.println(sum);

}
}
