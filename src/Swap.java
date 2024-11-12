import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("print 1st variable:");
        int v1 = in.nextInt();
        System.out.println("print 2nd variable:");
        int v2 = in.nextInt();
        int c=0;
        c = v1;
        v1 = v2;
        v2 = c;
        System.out.printf("%s %s",v1,v2);
    }
}
