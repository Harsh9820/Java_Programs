import java.util.Scanner;

public class Fibonacci {

    static long findSeries(int n){
        if(n <= 1)
            return n;
        long previous = 0;
        long current = 1;
        long x = 0;
        for (int i = 0; i < n - 1; i++) {
            x = current;
            current += previous;
            previous = x;
        }
        return current;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(findSeries(n)+ " ");
    }
}
