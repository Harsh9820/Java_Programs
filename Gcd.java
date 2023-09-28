import java.util.Scanner;
public class Gcd {

    static int findremGcd(int a, int b){
        if(a == 0)
            return b;
        if(b == 0)
            return a;
        if (a == b)
            return a;

        if(a > b)
            return findremGcd(a % b, b);
        return findremGcd(b % a, a);
    }

    static int findEuclideanGcd(int a, int b){
        if (a == 0)
            return b;
        if (b == 0)
            return a;
 
        // Base case
        if (a == b)
            return a;
        if (a > b)
            return findEuclideanGcd(a - b, b);
        return findEuclideanGcd(a, b - a);
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc =  new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        //System.out.println(findEuclideanGcd(a, b));
        System.out.println(findremGcd(a, b));
    }
}