import java.util.Scanner;

public class LastOfSum {
    static void LastSumFibonacci(int N)
    {
        long n1 = 0, n2 = 1;
        long sum = 0;
        int c = 0;
 
        // Iterate till counter is N
        while (c < N) {
 
            // Print the number
 
            // Swap
            long n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            c = c + 1;
            sum += n3;
        }
        System.out.println(sum % 10);
    }
 
    // Driver Code
    public static void main(String args[])
    {
        // Given Number N
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        // Function Call
        LastSumFibonacci(n);
    }
}
