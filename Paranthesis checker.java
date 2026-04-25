public class Main {
    public static void main(String[] args) {
        String input = "(()())";
        int count = 0;
        int totalLength = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '(') {
                count++;
            } else if (c == ')' && count > 0) {
                count--;
                totalLength += 2;
            }
        }

        System.out.println(totalLength);
    }
}
