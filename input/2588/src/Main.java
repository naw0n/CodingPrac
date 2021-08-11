import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();

        sc.close();

        int hundred,ten,one;
        one = b%10;
        ten = b%100-b%10;
        hundred = b-b%100;
        System.out.println(a*one);
        System.out.println(a*ten/10);
        System.out.println(a*hundred/100);
        System.out.println(a*b);
    }
}
