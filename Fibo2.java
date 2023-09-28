import java.math.BigInteger;
import java.util.Scanner;

public class Fibo2 {

static void Fibonacci(BigInteger N, int M)
    {
        BigInteger n1 = BigInteger.valueOf(0);
        BigInteger n2 = BigInteger.valueOf(1);
        BigInteger mo = BigInteger.valueOf(M);
        BigInteger c = BigInteger.valueOf(0);
 
        // Iterate till counter is N
        while (c.compareTo(N) == -1) {

            BigInteger n3 = n2.add(n1);
            n1 = n2;
            n2 = n3;
            c = c.add(BigInteger.valueOf(1));
        }
        System.out.print(n1.mod(mo));
    }
 
    // Driver Code
    public static void main(String args[])
    {
        // Given Number N
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();  
        int m = sc.nextInt();
        // Function Call
        Fibonacci(n, m);
        sc.close();
    }
}