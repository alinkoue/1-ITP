import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = (number%2==0) ? "your number is even":"your number is odd";
        System.out.println(result);
        scanner.close();
    }
}
