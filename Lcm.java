import java.util.Scanner;

public class Lcm {

    static long gcd(long a, long b) {
        if(a == 0)
            return b;
        if(b == 0)
            return a;
        if (a == b)
            return a;

        if(a > b)
            return gcd(a % b, b);
        return gcd(b % a, a);
    }
    
    static long findLcm(long a, long b){
        long g = gcd(a, b);
    
        return (a * b) / g;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findLcm(a, b));
    }
}
