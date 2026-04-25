import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        int[] arr = new int[256];

        for (int i = 0; i < string.length(); i++) {
            arr[string.charAt(i)]++;
        }

        boolean flag = false;

        for (int i = 0; i < string.length(); i++) {
            if (arr[string.charAt(i)] == 1) {
                System.out.println(string.charAt(i));
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("All characters are repetitive");
        }
    }
}
