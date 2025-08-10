import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type a string: ");
        String s = sc.nextLine();

        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        System.out.println("Reversed: " + rev);

        sc.close();
    }
}
